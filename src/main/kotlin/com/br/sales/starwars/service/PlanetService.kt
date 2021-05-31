package com.br.sales.starwars.service

import com.br.sales.starwars.model.Planet

interface PlanetService {

    fun create(planet: Planet)
    fun findById(id: Long): Planet?
    fun update(id: Long, planet: Planet)
    fun delete(id: Long)
}