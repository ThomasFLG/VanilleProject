package com.btssio.ozenne.vanille.model;

/**
 * Classe représentant une catégorie de produits.
 */
public class Categorie {
    private String id;
    private String nom;

    public Categorie(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return "Categorie{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
