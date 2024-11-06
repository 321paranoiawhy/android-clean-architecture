package com.example.composepoc.data.model

// Data Transfer Object
data class ProductListDTO(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: String,
    val title: String
)