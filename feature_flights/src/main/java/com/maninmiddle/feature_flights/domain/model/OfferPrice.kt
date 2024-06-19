package com.maninmiddle.feature_flights.domain.model

import com.squareup.moshi.Json

data class OfferPriceDto (
    @field:Json(name = "value") val value: Int
)