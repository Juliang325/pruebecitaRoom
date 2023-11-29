package com.example.pruebecitaroom.modelo.daos

import androidx.room.*
import com.example.pruebecitaroom.modelo.entities.Jugador

@Dao
interface DaoJugador {
    @Insert
    fun addJugador(jugador: Jugador)
    @Query("SELECT * FROM jugadores_table")
    fun getJugadores():MutableList<Jugador>
    @Update
    fun updateJugador(jugador: Jugador)
    @Delete
    fun deleteJugador(jugador: Jugador)

}