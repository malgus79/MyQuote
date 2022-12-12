package com.myquote.domain.model

import com.myquote.data.database.entities.QuoteEntity
import com.myquote.data.model.QuoteModel

data class Quote(val quote: String, val author: String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)