//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package org.example

import javax.swing.text.StyledEditorKit

fun main() {

    print("hello kotlin ")
    val name = "Aditya yadav"
    var age = 20

    println("Name : $name")
    println("Age : $age")

    // Data Types---------------------
    val a: Int = 10
    val b: Double = 10.5
    val c: Char = 'c'
    val d: Boolean = true
    val e: String = "How r u"

    println("Integer : ${a}")
    println("Double  : ${b}")
    println(c +" Char <---")
    println("Char    : ${c}")
    println("Boolean : ${d}")
    println("String  : ${e}")

    // Input in kotlin------------------------
    print("Enter location : ")
    val location = readlnOrNull()
    println("Location is $location")

    // Assesment-----------
    /*
        1.	Print your name, age, and city
        2.	Take input and print greeting
        3.	Create 5 variables using val and var
        4.	Try string templates
        5.	Convert Java variable code → Kotlin
    */
//  1.	Print your name, age, and city
    val StarName = "Virat Kohli"
    var StarAge: Int = 20
    var city: String = "Uttar Pradesh"

    println("Star Name : ${StarName}")
    println("Star Age  : ${StarAge}")
    println("City      : ${city}")

//   2.	Take input and print greeting

}