package com.example.pruebecitaroom.modelo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="jugadores_table")
data class Jugador(
    @ColumnInfo(name = "nombre")
    var nombre:String,
    @ColumnInfo(name = "edad")
    var edad:Int,
    @ColumnInfo(name = "direccion")
    var direccion:String?=null) {

    @PrimaryKey(autoGenerate=true)
    @ColumnInfo(name = "id_jugador")
    var jugadorId:Int=0





}