package com.example.pruebecitaroom.modelo.daos

import androidx.room.*
import com.example.pruebecitaroom.modelo.entities.Equipo
import com.example.pruebecitaroom.modelo.entities.Jugador

@Dao
interface DaoEquipo {
    @Insert
    fun addEquipo(equipo: Equipo)
    @Query("SELECT * FROM equipos_table")
    fun getEquipos():MutableList<Equipo>
    @Update
    fun updateEquipo(equipo: Equipo)
    @Delete
    fun deleteEquipo(equipo: Equipo)

}