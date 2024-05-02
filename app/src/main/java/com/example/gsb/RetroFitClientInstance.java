package com.example.gsb;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClientInstance{
    //Declaration des variables
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://urban-space-garbanzo-66x455x6q7634x6x-3000.app.github.dev/";
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            //Création d'une nouvelle instance de Retrofit avec l'URL de base et le convertisseur Gson
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)

                    .addConverterFactory(GsonConverterFactory.create())

                    .build();
        }
        return retrofit;
    }
}