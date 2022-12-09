package com.myquote.domain

import com.myquote.data.QuoteRepository
import com.myquote.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}