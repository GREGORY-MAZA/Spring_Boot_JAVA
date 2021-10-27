package com.Greg.model;

public class VoitureForm {

    private int id;
    private String model;
    private String marque;
    private String couleur;
    private int prix;

    public VoitureForm(int id, String model, String marque, String couleur, int prix) {
        this.id = id;
        this.model = model;
        this.marque = marque;
        this.couleur = couleur;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


}
