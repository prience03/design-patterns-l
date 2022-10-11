package com.github.design.creational.factory.road

import com.github.design.creational.factory.Transport

class RoadTransport: Transport {

    override fun deliver() {
        print("road transport finish job , can enjoy")
    }
}