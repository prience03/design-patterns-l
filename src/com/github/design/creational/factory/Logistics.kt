package com.github.design.creational.factory


// 物流
interface Logistics {


    fun planDelivery()

    fun createTransport(type:String):Transport

}