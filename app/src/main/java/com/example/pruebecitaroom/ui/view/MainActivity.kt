package com.example.pruebecitaroom.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pruebecitaroom.R
import com.example.pruebecitaroom.database.AppDB
import com.example.pruebecitaroom.modelo.entities.Equipo
import com.example.pruebecitaroom.modelo.entities.Jugador

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conexion=AppDB.getBaseDatos(this)
        val daoEquipo=conexion.DaoEquipo()
        val daoJugador=conexion.DaoJugador()
/*
        var equipo1 = Equipo("Betis", 100)
        daoEquipo.addEquipo(equipo1)
        var jugador1 = Jugador(1, "Julian", 21, "abd")
        daoJugador.addJugador(jugador1)
*/
        val lista:MutableList<Jugador> = daoJugador.getJugadores()

        lista.forEach {
            val jugador:String=it.nombre+" "+it.jugadorId+" "+it.equipoId
            Log.d("room",jugador)
        }
    }
}