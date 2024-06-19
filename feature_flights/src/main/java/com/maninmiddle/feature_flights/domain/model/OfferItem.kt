package com.maninmiddle.feature_flights.domain.model

import com.squareup.moshi.Json

data class OfferDto(
    @field:Json(name = "id") val id: Int,
    @field:Json(name = "title") val title: String,
    @field:Json(name = "town") val town: String,
    @field:Json(name = "price") val price: OfferPriceDto
)