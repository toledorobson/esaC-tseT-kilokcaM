package com.akinguldere.mackoliktestcase.model.news

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsResponse(
    val news: List<NewsItem>
) : Parcelable