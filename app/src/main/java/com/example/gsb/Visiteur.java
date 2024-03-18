package com.example.gsb;

public class Visiteur {
    private String id;
    private String nom;
    private String prenom;
    private String tel;
    private String password;
    private String email;
    private String dateEmbauche;


    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public String getTel() {
        return tel;
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

    public void setPassword(String Password) {
        this.password = Password;
    }

}