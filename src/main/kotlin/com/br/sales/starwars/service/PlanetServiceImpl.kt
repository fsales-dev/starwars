package com.br.sales.starwars.service

import com.br.sales.starwars.model.Planet
import com.br.sales.starwars.repository.ClimateRepository
import com.br.sales.starwars.repository.PlanetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlanetServiceImpl: PlanetService {

    @Autowired
    lateinit var repository: PlanetRepository

    @Autowired
    lateinit var groundRepository: PlanetRepository

    @Autowired
    lateinit var climateRepository: ClimateRepository

    override fun create(planet: Planet) {
        //validatePlanet(planet)
        repository.save(planet)
    }

    override fun findById(id: Long): Planet? {
        TODO("Not yet implemented")
    }

    override fun update(id: Long, planet: Planet) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    private fun validatePlanet(planet: Planet) {

        var ground = groundRepository.findById(planet.ground.id)

        if (ground.isEmpty) {
            throw IllegalArgumentException("Terreno não encontrado")
        }

        var climate = climateRepository.findById(planet.climate.id)
        if (climate.isEmpty) {
            throw java.lang.IllegalArgumentException("Clima não encontrado")
        }
    }
}