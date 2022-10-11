package com.github.design.creational.factory.road

import com.github.design.creational.factory.Logistics
import com.github.design.creational.factory.Transport

class RoadLogistics: Logistics {

    var roadTransport: Transport?= null

    override fun planDelivery() {
        print("${this.javaClass.name} 开始交付")
       roadTransport?.deliver()
    }

    override fun createTransport(type: String): Transport {
        roadTransport = RoadTransport()
        return roadTransport!!
    }


}