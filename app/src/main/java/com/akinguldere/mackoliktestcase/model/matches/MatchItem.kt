package com.akinguldere.mackoliktestcase.model.matches

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MatchItem(
    val id: Long,
    val fts_A: Int,
    val fts_B: Int,
    val team_A: Team,
    val team_B: Team
) : Parcelable