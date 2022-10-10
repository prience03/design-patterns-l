package com.github.design.behavior.strategy.bean

import com.github.design.behavior.strategy.PayStrategy


class Order(var totalCost: Int?, var isClosed: Boolean = false) {

    constructor() : this(10, false)


    fun processOrder(strategy: PayStrategy) {
        strategy.collectPaymentDetails()
    }
}