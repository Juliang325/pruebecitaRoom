package com.example.pruebecitaroom.modelo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoJugador {
    @Insert
    fun addJugador(jugador: Jugador)
    @Query("SELECT * FROM jugadores_table")
    fun getJugadores():MutableList<Jugador>

}