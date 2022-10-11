package com.github.design.behavior.strategy

import com.github.design.behavior.strategy.bean.CreditCard
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


class PayByCreditCard : PayStrategy {

    private val READER = BufferedReader(InputStreamReader(System.`in`))
    private var card: CreditCard? = null

    override fun pay(paymentAmount: Int): Boolean {
        if (cardIsPresent()) {
            println("Paying $paymentAmount using Credit Card.")
            card?.amount = card?.amount!! - paymentAmount
            return true;
        } else {
            return false;
        }
    }

    private fun cardIsPresent(): Boolean {
        return card != null
    }

    override fun collectPaymentDetails() {
        try {
            print("Enter the card number: ")
            val number = READER.readLine()
            print("Enter the card expiration date 'mm/yy': ")
            val date = READER.readLine()
            print("Enter the CVV code: ")
            val cvv = READER.readLine()
            card = CreditCard(number, date, cvv)
            // Validate credit card number...
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }


}