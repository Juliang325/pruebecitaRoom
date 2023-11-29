package com.example.pruebecitaroom.modelo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="equipos_table")
data class Equipo(
    @ColumnInfo(name = "nombre")
    var nombre:String,
    @ColumnInfo(name = "presupuesto")
    var presupuesto:Int
    ) {

    @PrimaryKey(autoGenerate=true)
    @ColumnInfo(name = "id_equipo")
    var equipoId:Int=0

}