package com.myquote.data

import com.myquote.data.model.QuoteModel
import com.myquote.data.model.QuoteProvider
import com.myquote.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}