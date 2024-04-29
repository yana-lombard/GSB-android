package com.example.gsb;

public class Visites {

    private String visiteId;
    private String dateVisite;
    private String commentaire;
    private String praticientId;

    private String visiteurId;
    private String motifId;

    public Visites(String visiteId, String dateVisite, String commentaire, String praticientId, String visiteurId,String motifId) {
        this.visiteId = visiteId;
        this.dateVisite = dateVisite;
        this.commentaire = commentaire;
        this.praticientId = praticientId;
        this.visiteurId = visiteurId;
        this.motifId = motifId;
    }

    public String getVisiteId() {
        return visiteId;
    }

    public void setVisiteId(String visiteId) {
        this.visiteId = visiteId;
    }

    public String getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(String dateVisite) {
        this.dateVisite = dateVisite;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getPraticientId() {
        return praticientId;
    }

    public void setPraticientId(String praticientId) {
        this.praticientId = praticientId;
    }

    public String getMotifId() {
        return motifId;
    }

    public void setMotifId(String motifId) {
        this.motifId = motifId;
    }

    public String getVisiteurId() {
        return visiteurId;
    }

    public void setVisiteurId(String visiteurId) {
        this.visiteurId = visiteurId;
    }


}
