package com.br.sales.starwars.repository

import com.br.sales.starwars.model.Ground
import org.springframework.data.repository.CrudRepository

interface GroundRepository: CrudRepository<Ground, Long> {
}