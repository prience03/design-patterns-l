package com.github.design.creational.absfactory.factory

import com.github.design.creational.absfactory.bean.ModernChair
import com.github.design.creational.absfactory.bean.ModernCoffeeTable
import com.github.design.creational.absfactory.bean.ModernSofa
import com.github.design.creational.absfactory.furniturebase.Chair
import com.github.design.creational.absfactory.furniturebase.CoffeTable
import com.github.design.creational.absfactory.furniturebase.Sofa

class ModernFurnitureFactory:FurnitureFactory() {

    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createCoffeTable(): CoffeTable {
        return ModernCoffeeTable()
    }

    override fun creatSofe(): Sofa {
        return ModernSofa()
     }
}