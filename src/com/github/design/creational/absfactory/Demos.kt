package com.github.design.creational.absfactory

import com.github.design.creational.absfactory.factory.FurnitureFactory
import com.github.design.creational.absfactory.factory.ModernFurnitureFactory
import com.github.design.creational.absfactory.furniturebase.Chair
import com.github.design.creational.absfactory.furniturebase.Sofa


fun main(){


    val factory :FurnitureFactory = ModernFurnitureFactory()

    val sofa:Sofa = factory.creatSofe()
    val chair:Chair = factory.createChair()
    val coffeeTable = factory.createCoffeTable()

    sofa.watchTv()
    chair.sitDown()
    coffeeTable.makeCoffer()


}