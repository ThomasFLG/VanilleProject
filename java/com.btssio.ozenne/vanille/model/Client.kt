package com.btssio.ozenne.vanille.model

/**
 * Classe représentant un client.
 *
 * Le mot-clé 'data' permet au compilateur de générer automatiquement
 * les fonctions equals(), hashCode(), copy() et toString().
 *
 * Tous les paramètres du constructeur sont déclarés en tant que propriétés (var ou val).
 */
data class Client(
    var id: Int = 0,
    var nom: String = "",
    var prenom: String = "",
    var email: String = ""
)
