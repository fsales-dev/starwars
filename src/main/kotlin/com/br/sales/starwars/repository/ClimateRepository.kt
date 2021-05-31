package com.br.sales.starwars.repository

import com.br.sales.starwars.model.Climate
import org.springframework.data.repository.CrudRepository

interface ClimateRepository: CrudRepository<Climate, Long> {
}