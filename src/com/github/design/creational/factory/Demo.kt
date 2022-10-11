package com.github.design.creational.factory

import com.github.design.creational.factory.road.RoadLogistics
import com.github.design.creational.factory.road.RoadTransport
import com.github.design.creational.factory.sea.SeaLogistics
import com.github.design.creational.factory.sea.SeaTransport
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val reader = BufferedReader(InputStreamReader(System.`in`))

    var transport: Transport? = null

    print("""
        Please, select a transpost:
        1 - RoadTranSport
        2 - SeaTransport
        """.trimIndent())

    val choice = reader.readLine().toInt()

    var logistics: Logistics? = null

    when (choice) {
        1 -> {
            logistics = RoadLogistics()
        }
        2 -> {
            logistics = SeaLogistics()
        }
    }
    logistics?.createTransport("")
    logistics?.planDelivery()


}


