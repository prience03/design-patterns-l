package com.github.design.behavior.strategy

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


/**
 * 阿里支付
 */
class AliPay :PayStrategy{

    private val DATA_BASE = hashMapOf<String,String>()

    private val READER = BufferedReader(InputStreamReader(System.`in`))
    private var email: String? = null
    private var password: String? = null
    private var signedIn = false

    init {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }


    override fun pay(paymentAmount: Int): Boolean {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    override fun collectPaymentDetails() {
        try {
            while (!signedIn) {
                print("Enter the user's email: ")
                email = READER.readLine()
                print("Enter the password: ")
                password = READER.readLine()
                if (verify()) {
                    println("Data verification has been successful.")
                } else {
                    println("Wrong email or password!")
                }
            }
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    private fun verify(): Boolean {
        setSignedIn(password == DATA_BASE[email])
        return signedIn
    }

    private fun setSignedIn(signedIn: Boolean) {
        this.signedIn = signedIn
    }

}