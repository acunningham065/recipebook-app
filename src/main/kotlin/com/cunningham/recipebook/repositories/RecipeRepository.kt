package com.cunningham.recipebook.repositories

import org.jooq.DSLContext
import org.springframework.stereotype.Component

@Component
class RecipeRepository(dslContext: DSLContext) {

    fun getAll() {
        System.out.println("GET ALL")
    }

    fun getById(id: Int) {
        System.out.println("GET BY ID $id")
    }
}