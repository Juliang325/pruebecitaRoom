package com.example.pruebecitaroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pruebecitaroom.database.AppDB
import com.example.pruebecitaroom.modelo.Jugador

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conexion=AppDB.getBaseDatos(this)
        val daoJugador=conexion.DaoJugador()

        //var jugador1 = Jugador("Julian", 21, "abd")
        //daoJugador.addJugador(jugador1)

        val lista:MutableList<Jugador> = daoJugador.getJugadores()

        lista.forEach {
            val jugador:String=it.nombre+" "+it.jugadorId
            Log.d("room",jugador)
        }
    }
}