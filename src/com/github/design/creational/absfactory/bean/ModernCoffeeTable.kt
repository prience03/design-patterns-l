package com.github.design.creational.absfactory.bean

import com.github.design.creational.absfactory.furniturebase.CoffeTable

class ModernCoffeeTable:CoffeTable {
    override fun makeCoffer() {
        print("modern coffee make coffee")
    }
}