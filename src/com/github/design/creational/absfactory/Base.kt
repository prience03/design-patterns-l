package com.github.design.creational.absfactory

class Base {


    val function :(String,Int) -> Int = {it,l -> l+it.length}

    private val stringLengthFunc: (String) -> Int = {
        input -> input.length
    }

    private fun stringMapper(input: String, mapper: (String) -> Int): Int {
        return mapper(input)
    }

    private fun stringMapper2(input: String,ff:Int ,mapper: (String,Int) -> Int): Int {
        return mapper(input,ff)
    }

    fun main() {
        stringMapper("Android", stringLengthFunc)


        stringMapper2("1",2) { input, ff -> ff+input.length}

    }

    fun stringMapperFunction(input: String): (String) -> Int {
        return {
            val newString = input.substring(
                    input.indexOf("start")
            )
            input.length
        }
    }



}