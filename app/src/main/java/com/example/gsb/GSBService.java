package com.example.gsb;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GSBService {
    @POST("api/auth/login")
    Call<Visiteur> login(@Body Visiteur visiteur);

    @GET("api/visiteurs/{id}")
    Call<Visiteur> getVisiteurId(@Header("Authorization")String tokenJWT, @Path("id") String VisiteurId);
}