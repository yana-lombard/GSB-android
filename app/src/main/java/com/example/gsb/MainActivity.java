package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gsb.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private Visiteur visiteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonAuthentification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Visiteur vis = new Visiteur(binding.editEmail.getText().toString(),binding.editPassword.getText().toString());
                GSBService gsbVisitesServices = RetroFitClientInstance.getRetrofitInstance().create(GSBService.class);
                Call<Visiteur> call = gsbVisitesServices.login(vis);


                call.enqueue(new Callback<Visiteur>() {
                    @Override
                    public void onResponse(Call<Visiteur> call, Response<Visiteur> response) {
                        visiteur = response.body();
                        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                        intent.putExtra("visiteur", visiteur);
                    }
                    @Override
                    public void onFailure(Call<com.example.gsb.Visiteur> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Une erreur est survenue !" + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }
}