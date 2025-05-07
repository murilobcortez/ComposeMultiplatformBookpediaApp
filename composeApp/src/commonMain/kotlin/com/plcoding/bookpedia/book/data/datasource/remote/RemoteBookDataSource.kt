package com.plcoding.bookpedia.book.data.datasource.remote

import com.plcoding.bookpedia.book.data.model.BookWorkDto
import com.plcoding.bookpedia.book.data.model.SearchResponseDto
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ) : Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}