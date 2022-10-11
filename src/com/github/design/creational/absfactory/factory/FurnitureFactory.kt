package com.github.design.creational.absfactory.factory

import com.github.design.creational.absfactory.furniturebase.Chair
import com.github.design.creational.absfactory.furniturebase.CoffeTable
import com.github.design.creational.absfactory.furniturebase.Sofa

abstract class FurnitureFactory {

    abstract fun createChair():Chair

    abstract fun createCoffeTable():CoffeTable

    abstract fun creatSofe():Sofa

}