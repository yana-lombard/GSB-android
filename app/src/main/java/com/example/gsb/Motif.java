package com.example.gsb;

public class Motif {

    private String motifId;
    private String libelle;

    public Motif(String motifId, String libelle) {
        this.motifId = motifId;
        this.libelle = libelle;
    }

    public String getMotifId() {
        return motifId;
    }

    public void setMotifId(String motifId) {
        this.motifId = motifId;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}
