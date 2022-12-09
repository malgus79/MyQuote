package com.myquote.domain

import com.myquote.data.model.QuoteModel
import com.myquote.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    //no es suspend, porque esta en memoria, luego con BD si se usara corutinas
    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes  //TODO reemplazar por llamada a repositorio
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (0..quotes.size - 1).random()
            return quotes[randomNumber]
        }
        return null
    }
}