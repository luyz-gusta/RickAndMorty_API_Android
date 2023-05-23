package br.senai.sp.jandira.rickandmorty.model

data class Character(
    val id: Long,
    val name: String,
    val status: String,
    val species: String,
    val origin: Origin,
    val image: String,
    val location: Location
)

