package com.akinguldere.mackoliktestcase.extension

import java.text.SimpleDateFormat

val String.dateConvert: String
    get(){
        return if(this.isNotBlank()){
            val parser =  SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val formatter = SimpleDateFormat("dd MMM yyyy")
            formatter.format(parser.parse(this))
        }else this
    }