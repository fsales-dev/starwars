package com.br.sales.starwars.repository

import com.br.sales.starwars.model.Planet
import org.springframework.data.repository.PagingAndSortingRepository

interface PlanetRepository: PagingAndSortingRepository<Planet, Long> {

}