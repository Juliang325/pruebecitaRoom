package com.example.pruebecitaroom.modelo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName="jugadores_table",
        foreignKeys = [
            ForeignKey(
            entity = Equipo::class,
            parentColumns = ["id_equipo"],
            childColumns = ["id_equipo_fk"]
            )
        ]
)
data class Jugador(
    @ColumnInfo(name = "id_equipo_fk")
    var equipoId: Int,
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