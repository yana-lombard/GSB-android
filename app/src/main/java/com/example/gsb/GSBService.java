package com.example.gsb;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GSBService {

    // Définition de la méthode login qui fait un appel POST à l'API
    @POST("api/auth/login")
    // Elle prend en paramètre un objet Visiteur et renvoie un appel Retrofit contenant un objet Visiteur
    Call<Visiteur> login(@Body Visiteur visiteur);

    // Définition de la méthode getVisiteurId qui fait un appel GET à l'API
    @GET("api/visiteurs/{id}")
    // Elle prend en paramètre un token JWT et un ID de visiteur, et renvoie un appel Retrofit contenant un objet Visiteur
    Call<Visiteur> getVisiteurId(@Header("Authorization")String tokenJWT, @Path("id") String VisiteurId);
}