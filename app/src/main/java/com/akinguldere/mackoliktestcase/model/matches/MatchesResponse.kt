package com.akinguldere.mackoliktestcase.model.matches

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MatchesResponse(
    val name: String,
    val format: String,
    val date: String,
    val matches: List<MatchItem>
) : Parcelable