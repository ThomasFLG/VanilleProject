package com.btssio.ozenne.model;

public class Categorie {
	 
	        private String id;
	        private String libelle;
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getLibelle() {
				return libelle;
			}
			public void setLibelle(String libelle) {
				this.libelle = libelle;
			}
			public Categorie(String id, String libelle) {
				super();
				this.id = id;
				this.libelle = libelle;
			}

	        
	        
	    

}
