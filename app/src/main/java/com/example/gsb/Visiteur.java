package com.example.gsb;


public class Visiteur implements java.io.Serializable {

    private String token;

    private String visiteurId;
    private String email;
    private String password;
    private String nom;
    private String prenom;

    public Visiteur(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}