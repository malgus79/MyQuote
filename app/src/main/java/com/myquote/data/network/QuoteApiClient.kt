package com.myquote.data.network

import com.myquote.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.Json")
    suspend fun getAllQuotes(): Response<QuoteModel>
}