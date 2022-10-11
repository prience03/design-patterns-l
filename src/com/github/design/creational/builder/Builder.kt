package com.github.design.creational.builder

import com.github.design.creational.builder.bean.*


interface Builder {

    fun setCarType(carType: CarType?)

    fun setSeats(seats: Int)

    fun setEngine(engine: Engine?)

    fun setTransmission(transmission: Transmission?)

    fun setTripComputer(tripComputer: TripComputer?)

    fun setGPSNavigator(gpsNavigator: GPSNavigator?)


}