package com.registro.rcm.model

import com.google.gson.annotations.SerializedName

class Mascota(val id: Int,
              val image: String,
              val name: String,
              val raza: String,
              val color: String,
              val edad: Int,
              val sexo: Int,
              @SerializedName("id_usuario")
              val idUser: Int)