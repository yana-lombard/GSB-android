package com.example.gsb;

import retrofit2.Call;
import retrofit2.http.POST;

public interface GSBService  {
    @POST("api/auth/login")
    static Call<Visiteur> login(Visiteur visiteur);

}
