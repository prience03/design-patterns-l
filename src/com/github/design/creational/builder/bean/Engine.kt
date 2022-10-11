package com.github.design.creational.builder.bean


//产品特征 1
class Engine(volume: Double, mileage: Double)
//constructor(var volume: Double,  mileage: Double, var started: Boolean)
{

    var volume: Double = 0.0
        set(value) {
            field = if(value > 10.0) 10.1 else value
        }

    var mileage:Double = 0.0

    var started:Boolean = false


    fun off(){
        started = false
    }

    fun on(){
        started = true
    }

    fun go(mileage:Double){
        if(started){
            this.mileage = mileage
        }else{
            print("Cannot go(), you must start engine first!")
        }
    }

}