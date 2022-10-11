package com.github.design.behavior.strategy


/**
 *  Common interface for all strategies.
 */
interface PayStrategy {

    fun pay(paymentAmount:Int):Boolean

    fun collectPaymentDetails()


}