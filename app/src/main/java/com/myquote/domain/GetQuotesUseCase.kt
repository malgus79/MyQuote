package com.myquote.domain

import com.myquote.data.QuoteRepository
import com.myquote.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}