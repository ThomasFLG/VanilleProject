package com.btssio.ozenne.vanille.model;

/**
 * Classe représentant un produit.
 */
public class Produit {
    private String code;
    private String nom;
    private String image;
    private float prix;
    private Categorie categorie;

    public Produit(String code, String nom, String image, float prix, Categorie categorie) {
        this.code = code;
        this.nom = nom;
        this.image = image;
        this.prix = prix;
        this.categorie = categorie;
    }

    // Getters et setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    @Override
    public String toString() {
        return "Produit{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
