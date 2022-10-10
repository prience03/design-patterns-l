package com.github.design.behavior.strategy.bean

class CreditCard(var amount: Int ?,var number: String, var date: String?, var cvv: String?) {

    constructor(number: String, date: String?, cvv: String?) : this(1000,number, date, cvv)

}