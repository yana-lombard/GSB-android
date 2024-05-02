package com.example.gsb;

public class Praticients {

    private String praticientId;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private String rue;
    private String cp;
    private String ville;

    public Praticients(String praticientId, String nom, String prenom, String tel, String email, String rue, String cp, String ville) {
        this.praticientId = praticientId;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public String getPraticientId() {
        return praticientId;
    }

    public void setPraticientId(String praticientId) {
        this.praticientId = praticientId;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
