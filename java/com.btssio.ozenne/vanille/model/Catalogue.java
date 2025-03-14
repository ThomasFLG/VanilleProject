package com.btssio.ozenne.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalogue {
    private String id;
   private String titre;
   private LocalDate dateEdition;
   private List<Produit> lesProduits = new ArrayList<Produit>();

   

public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getTitre() {
	return titre;
}


public void setTitre(String titre) {
	this.titre = titre;
}


public LocalDate getDateEdition() {
	return dateEdition;
}


public void setDateEdition(LocalDate dateEdition) {
	this.dateEdition = dateEdition;
}


public List<Produit> getLesProduits() {
	return lesProduits;
}


public void setLesProduits(List<Produit> lesProduits) {
	this.lesProduits = lesProduits;
}


public Catalogue(String id, String titre, LocalDate dateEdition) {
	super();
	this.id = id;
	this.titre = titre;
	this.dateEdition = dateEdition;
}



public List<Produit> getLesProduitsCategorie(Categorie categorieRecherchee){

	   List<Produit> lesProduitsCat = new ArrayList<Produit>();
	   for(Produit produitLu : lesProduits) {
		   
		   if (produitLu.getCategorieDuProduit().equals(categorieRecherchee)) {
			   lesProduitsCat.add(produitLu);
		   }
		 
		    
	   }
	   Collections.sort(lesProduitsCat);
	   return lesProduitsCat;
}

   

   public int getProduit(String id, Produit[] produitTrouve) {
	
	   produitTrouve[0] = null;
		int result = -1;	
		int i = 0;
		while ((i < lesProduits.size()) && (produitTrouve[0] == null)) {
			if ((lesProduits.get(i).getId().equals(id))) {
				produitTrouve[0] = lesProduits.get(i);
				result = i;
			}				
			i++;
		}

		return result;
	}

   public boolean ajouterUnProduit(Produit unProduit) {
    	 boolean ok = false;
    	 Produit[] prods = new Produit[1];
    	 if (this.getProduit(unProduit.getId(), prods)==-1) {
    		 this.lesProduits.add(unProduit);
    		 ok = true;	    		 
    	 }
 	 
    	 return ok;
     }

  public boolean supprimerUnProduit(Produit unProduit) {
    	 
	  boolean ok = false;
 	 Produit[] prods = new Produit[1];
 	 if (this.getProduit(unProduit.getId(), prods)!=-1) {
 		 this.lesProduits.remove(prods[0]);
 		 ok = true;	    		 
 	 }
 	 return ok;
 	 
   		 
     }
  

  
  public boolean modifierUnProduit(Produit unProduit) {
 	 
	  boolean ok = false;
 	 Produit[] prods = new Produit[1];
 	 int indice =this.getProduit(unProduit.getId(), prods);
 	 if (indice!=-1) {
 		 this.lesProduits.remove(indice);
 		 this.lesProduits.add(unProduit);
 		 ok = true;	    		 
 	 }
 	 return ok;
 	 
 	 
 	 
  }
     
}

