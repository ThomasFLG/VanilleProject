package com.btssio.ozenne.vanille.controller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.btssio.ozenne.vanille.R
import com.btssio.ozenne.vanille.model.Commande
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Association du layout activity_main.xml à l'activité
        setContentView(R.layout.activity_main)
        
        // Formatage de la date de la commande
        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val dateCommande = sdf.format(Commande.dateCommande)
        
        // Affichage de la date de la commande dans un Toast
        Toast.makeText(this, "Date de la commande : $dateCommande", Toast.LENGTH_LONG).show()
    }
}
