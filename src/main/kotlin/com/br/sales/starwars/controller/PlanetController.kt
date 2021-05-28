package com.br.sales.starwars.controller

import com.br.sales.starwars.model.Planet
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/planets")
class PlanetController {

    @GetMapping("/hello")
    fun helloWorld(): String {

        return "Cheguei"
    }

    @PostMapping()
    fun create(@RequestBody planet: Planet): ResponseEntity<Planet> {

        return ResponseEntity.ok().build()
    }

    @GetMapping("/{id}")
    fun findPlanetById(@PathVariable id: Long): ResponseEntity<Planet> {

        return ResponseEntity.ok().build()
    }

    @PutMapping("/{id}")
    fun update(@RequestBody planet: Planet, @PathVariable("id") id: Long): ResponseEntity<Planet> {

        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<Unit> {

        return ResponseEntity.noContent().build()
    }

    @GetMapping()
    fun findAll(): ResponseEntity<List<Planet>> {

        return ResponseEntity.ok().build()
    }

}