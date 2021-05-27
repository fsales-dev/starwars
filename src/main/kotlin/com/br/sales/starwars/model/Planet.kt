package com.br.sales.starwars.model

data class Planet(
    val id: Long,
    val name: String,
    val climate: Climate,
    val ground: Ground
)