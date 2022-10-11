package com.github.design.creational.absfactory.bean

import com.github.design.creational.absfactory.furniturebase.Chair

class ModernChair: Chair {

    override fun sitDown() {
        print("modern chai is so modern")
    }
}