package com.example.gsb;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GSBService {
    @POST("api/auth/login")
    Call<Visiteur> login(@Body Visiteur visiteur);

    @GET("api/praticients")
    Call<Visiteur> register(@Body Visiteur visiteur);
}
