package com.github.design.creational.builder

import com.github.design.creational.builder.bean.*


class CarBuilder:Builder {

    private var type: CarType? = null
    private var seats = 0
    private var engine: Engine? = null
    private var transmission: Transmission? = null
    private var tripComputer: TripComputer? = null
    private var gpsNavigator: GPSNavigator? = null

    override fun setCarType(carType: CarType?) {
        this.type = carType;
    }

    override fun setSeats(seats: Int) {
        this.seats =seats
    }

    override fun setEngine(engine: Engine?) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission?) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer?) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator?) {
        this.gpsNavigator = gpsNavigator
    }



    fun build(): Car? {
        return Car(type, seats, engine!!, transmission!!, tripComputer!!, gpsNavigator!!,10.0)
    }
}