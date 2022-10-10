package com.github.design.behavior.strategy

import com.github.design.behavior.strategy.bean.Order
import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {

    val priceOnProducts = hashMapOf<Int, Int>()
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val order = Order()
    var strategy: PayStrategy? = null

    priceOnProducts.put(1, 2200)
    priceOnProducts.put(2, 1850);
    priceOnProducts.put(3, 1100);
    priceOnProducts.put(4, 890);


    while (!order.isClosed) {
        var cost: Int
        var continueChoice: String
        do {
            print("""
        Please, select a product:
        1 - Mother board
        2 - CPU
        3 - HDD
        4 - Memory""".trimIndent())
            val choice = reader.readLine().toInt()
            cost = priceOnProducts[choice]!!
            print("Count: ")
            val count = reader.readLine().toInt()
            order.totalCost = cost * count
            print("Do you wish to continue selecting products? Y/N: ")
            continueChoice = reader.readLine()
        } while (continueChoice.equals("Y", ignoreCase = true))

        if (strategy == null) {
            println("""
    Please, select a payment method:
    1 - PalPay
    2 - Credit Card
    """.trimIndent())
            val paymentMethod = reader.readLine()

            // Client creates different strategies based on input from user,
            // application configuration, etc.
            if (paymentMethod == "1") {
                strategy = AliPay()
            } else {
                strategy = PayByCreditCard()
            }
        }
        //处理
        order.processOrder(strategy);

        print("Pay " + order.totalCost + " units or Continue shopping? P/C: ");
        val proceed = reader.readLine()
        if (proceed == "P") {
            // Finally, strategy handles the payment.
            // real pay
            if (strategy.pay(order.totalCost!!)) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("FAIL! Please, check your data.");
            }
            order.isClosed = true
        }
    }

}