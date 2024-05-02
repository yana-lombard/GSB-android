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

    //Declaration des variables
    private ActivityMainBinding binding;
    private Visiteur visiteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialisation de la vue
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Action lors du clic sur le bouton d'authentification
        binding.buttonAuthentification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Création d'un objet Visiteur avec les informations saisies par l'utilisateur
                Visiteur vis = new Visiteur(binding.editEmail.getText().toString(),binding.editPassword.getText().toString());
                //Appel de la méthode login de l'interface GSBService
                GSBService gsbVisitesServices = RetroFitClientInstance.getRetrofitInstance().create(GSBService.class);
                Call<Visiteur> call = gsbVisitesServices.login(vis);


                //Gestion de la reponse de l'appel à l'API
                call.enqueue(new Callback<Visiteur>() {
                    @Override
                    public void onResponse(Call<Visiteur> call, Response<Visiteur> response) {
                        //Récupération de l'objet Visiteur retourné par l'API
                        visiteur = response.body();
                        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                        intent.putExtra("visiteur", visiteur);
                        startActivity(intent);
                    }
                    @Override
                    public void onFailure(Call<com.example.gsb.Visiteur> call, Throwable t) {
                        //Affichage d'un message d'erreur en cas d'échec de l'appel à l'API
                        Toast.makeText(MainActivity.this, "Une erreur est survenue !" + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}