package com.example.pruebecitaroom.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.pruebecitaroom.database.AppDB
import com.example.pruebecitaroom.modelo.entities.Jugador

class JugadorViewModel(application: Application): AndroidViewModel(application) {
    var jugadorModel = MutableLiveData<Jugador>()

    private val conexion= AppDB.getBaseDatos(getApplication())
    private val daoJugador=conexion?.DaoJugador()


    fun addJugador(jugador: Jugador){
        daoJugador?.addJugador(jugador)
    }

    fun deleteJugador(jugador: Jugador){
        daoJugador?.deleteJugador(jugador)
    }

    fun updateJugador(jugador: Jugador){
        daoJugador?.updateJugador(jugador)
    }

    fun initJugadores(){

    }


}