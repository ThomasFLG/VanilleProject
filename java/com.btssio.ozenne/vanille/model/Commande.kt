package com.btssio.ozenne.vanille.model

import java.util.*
import kotlin.collections.HashMap

/**
 * Singleton représentant la commande en cours.
 *
 * La commande est créée une seule fois dans l'application.
 */
object Commande {
    // Identifiant de la commande, initialisé à 0.
    var id: Int = 0

    // Client associé à la commande, initialisé à null.
    var client: Client? = null

    // Date de création de la commande, accessible en lecture seule.
    val dateCommande: Date = Date()

    // Dictionnaire enregistrant les lignes de commande :
    // clé = Produit, valeur = quantité commandée.
    val lignesCommande: HashMap<Produit, Int> = HashMap()

    init {
        // Création d'une catégorie "bonbons"
        val bonbons = Categorie("bon", "bonbons")

        // Ajout de lignes à la commande
        lignesCommande[Produit("B004", "Bonbons caramel Lot 4 Kg", "", 5.0f, bonbons)] = 10
        lignesCommande[Produit("B005", "Bonbons acidulés Lot 5 Kg", "", 1.0f, bonbons)] = 2
    }

    /**
     * Calcule et renvoie le total de la commande.
     *
     * Pour chaque ligne, on multiplie le prix TTC du produit par la quantité commandée.
     */
    fun getTotalCommande(): Float {
        var total = 0f
        for ((produit, quantite) in lignesCommande) {
            total += produit.prix * quantite
        }
        return total
    }
}
