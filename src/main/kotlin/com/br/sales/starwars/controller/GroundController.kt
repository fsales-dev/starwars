package com.br.sales.starwars.controller

import com.br.sales.starwars.model.Ground
import com.br.sales.starwars.repository.GroundRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/ground")
class GroundController {

    @Autowired
    lateinit var repository: GroundRepository

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): ResponseEntity<Ground> {
        var ground: Optional<Ground> = repository.findById(id)

        return ResponseEntity(ground.get(), HttpStatus.OK)
    }
}