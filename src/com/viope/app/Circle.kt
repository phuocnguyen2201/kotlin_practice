package com.viope.app

class Circle(var radius: Double): Shape(0,0) {
    fun getArea(): Double {
        return radius*radius*3.14159;
    }
}