package com.akinguldere.mackoliktestcase.model.news

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsItem(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val link: String,
    val picUrl: String
) : Parcelable