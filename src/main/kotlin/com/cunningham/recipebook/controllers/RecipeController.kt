package com.cunningham.recipebook.controllers

import com.cunningham.recipebook.repositories.RecipeRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/recipes")
class RecipeController(val recipeRepository: RecipeRepository) {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET] )
    fun getAll() = recipeRepository.getAll()

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET] )
    fun getById(@PathVariable("id") id: Int) = recipeRepository.getById(id)

}