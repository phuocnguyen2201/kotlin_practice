package com.viope.app

fun main(){
    for (card in Priority.values()) {
        println("${card.ordinal} : ${card.name}")
    }

}