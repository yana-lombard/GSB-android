package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gsb.databinding.ActivityMain2Binding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    private RecyclerView recyclerView;
    private PraticientsRecyclerAdapter adapter;
    private Visiteur visiteurApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        visiteurApi = (Visiteur) getIntent().getSerializableExtra("visiteur");


        ArrayList<Praticients> praticiens = new ArrayList<>();

        binding.recyclerviewlayout2.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.recyclerviewlayout2.setLayoutManager(layoutManager);
        binding.recyclerviewlayout2.setFocusable(false);

        PraticientsRecyclerAdapter myAdapterPraticiens = new PraticientsRecyclerAdapter(praticiens); // Remplacez PraticientsRecyclerAdapter par le nom correct de votre adaptateur
        binding.recyclerviewlayout2.setAdapter(myAdapterPraticiens);

        GSBService gsbService = RetroFitClientInstance.getRetrofitInstance().create(GSBService.class);
        Call<Visiteur> call = gsbService.getVisiteurId("Bearer " + visiteurApi.getToken(), visiteurApi.getVisiteurId());
        call.enqueue(new Callback<Visiteur>() {
            @Override
            public void onResponse(Call<Visiteur> call, Response<Visiteur> response) {
                visiteurApi = response.body();
                if (visiteurApi != null) {
                    for (Praticients praticient : visiteurApi.getPortefeuillePraticiens()) {
                        praticiens.add(praticient);
                    }
                    myAdapterPraticiens.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<Visiteur> call, Throwable t) {
                Toast.makeText(MainActivity2.this, "Une erreur est survenue !" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

            binding.recyclerviewlayout2.addOnItemTouchListener(new RecyclerTouchPraticientListener(this,
                binding.recyclerviewlayout2, new RecyclerViewPraticientsClickListerner() {
            @Override
            public void onClick(View view, final int position) {
                // Obtenez le praticien à la position cliquée
                Praticients praticien = praticiens.get(position);
                // Créez une nouvelle intention pour démarrer Activity3
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                // Ajoutez le nom et le prénom du praticien à l'intention
                intent.putExtra("nomPraticien", praticien.getNom());
                intent.putExtra("prenomPraticien", praticien.getPrenom());
                intent.putExtra("telPraticien", praticien.getTel());
                intent.putExtra("emailPraticien", praticien.getEmail());
                intent.putExtra("ruePraticien", praticien.getRue());
                intent.putExtra("villePraticien", praticien.getVille());
                // Démarrez Activity3
                startActivity(intent);
            }

        }));

    }
}