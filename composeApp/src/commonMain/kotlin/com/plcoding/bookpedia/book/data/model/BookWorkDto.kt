package com.plcoding.bookpedia.book.data.model

import com.plcoding.bookpedia.book.data.datasource.remote.BookWorkDtoSerializer
import kotlinx.serialization.Serializable

@Serializable(with = BookWorkDtoSerializer::class)
data class BookWorkDto(
    val description: String? = null
)