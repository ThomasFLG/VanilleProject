package com.btssio.ozenne.vanille.model;

/**
 * Classe représentant une promotion sur un produit.
 */
public class Promotion {
    private String code;
    private String description;
    private float tauxReduction; // Par exemple, 0.1 pour 10%

    public Promotion(String code, String description, float tauxReduction) {
        this.code = code;
        this.description = description;
        this.tauxReduction = tauxReduction;
    }

    // Getters et setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTauxReduction() {
        return tauxReduction;
    }

    public void setTauxReduction(float tauxReduction) {
        this.tauxReduction = tauxReduction;
    }
}
