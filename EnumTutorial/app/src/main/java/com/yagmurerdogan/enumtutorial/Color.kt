package com.yagmurerdogan.enumtutorial

/*
 You can watch the lesson -> https://www.youtube.com/watch?v=-1C7Tm6eblA
 Thanks for "Simplified Coding"!
 */

interface DoColor {
    fun doColor()
}

enum class Color(val colorName: String, val colorValue: Int) : DoColor {
    RED("Red", 10) {
        override fun doColor() {
            println("Colored with Red")
        }
    },
    GREEN("Green", 20) {
        override fun doColor() {
            println("Colored with Green")
        }
    },
    BLUE("Blue", 30) {
        override fun doColor() {
            println("Colored with Blue")
        }
    }
}

fun main() {
    println(Color.RED.colorName)
    println(Color.RED.colorValue)
    println(Color.BLUE.colorName)
    println(Color.BLUE.colorValue)
    println(Color.GREEN.colorName)
    println(Color.GREEN.colorValue)

    /*
    --- when color has no parameters---
    Color.values().forEach { println(it) }
    val color = Color.RED
    when(color) {
        Color.RED -> println("Red")
        Color.GREEN -> println("Green")
        Color.BLUE -> println("Blue")
    }*/
}