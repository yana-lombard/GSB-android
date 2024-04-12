package com.example.gsb;


import java.util.ArrayList;

public class Visiteur implements java.io.Serializable {

    private String token;

    private String visiteurId;
    private String email;
    private String password;
    private String nom;
    private String prenom;
    private ArrayList<Praticients> portefeuillePraticiens;

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

    public String getVisiteurId() {
        return visiteurId;
    }

    public void setVisiteurId(String visiteurId) {
        this.visiteurId = visiteurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Praticients> getPortefeuillePraticiens() {
        return portefeuillePraticiens;
    }

    public void setPortefeuillePraticiens(ArrayList<Praticients> portefeuillePraticiens) {
        this.portefeuillePraticiens = portefeuillePraticiens;
    }

}