package com.github.design.creational.factory.sea

import com.github.design.creational.factory.Logistics
import com.github.design.creational.factory.Transport

class SeaLogistics: Logistics {

    var seaTransport: Transport?= null

    override fun planDelivery() {
        print("${this.javaClass.name} 开始交付")
        seaTransport?.deliver()
    }

    override fun createTransport(type: String): Transport {
        seaTransport = SeaTransport()
        return seaTransport!!
    }


}