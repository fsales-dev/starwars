package com.br.sales.starwars.model

import javax.persistence.*

@Entity
data class Planet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @ManyToOne
    @JoinColumn(name = "climate_id")
    val climate: Climate,
    @ManyToOne
    @JoinColumn(name = "ground_id")
    val ground: Ground
)