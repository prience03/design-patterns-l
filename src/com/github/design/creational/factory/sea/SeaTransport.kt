package com.github.design.creational.factory.sea

import com.github.design.creational.factory.Transport

class SeaTransport: Transport {
    override fun deliver() {
        print("Sea transport finish job , can enjoy")
    }
}