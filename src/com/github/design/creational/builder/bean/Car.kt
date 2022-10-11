package com.github.design.creational.builder.bean

class Car(var carType: CarType?,
          var seats: Int,
          var engine: Engine,
          var transmission: Transmission,
          var tripComputer: TripComputer,
          var gpsNavigator: GPSNavigator,
          var fuel: Double)