package com.akinguldere.mackoliktestcase.model.matches

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Team(
    val id: Int,
    val uuid: String,
    val name: String,
    val tla_name: String,
    val display_name: String
) : Parcelable