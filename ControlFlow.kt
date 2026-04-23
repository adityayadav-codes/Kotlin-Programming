package org.example

//if Statement (Basic)

//fun  main() {
//    val age = 23
//
//    if (age > 19) {
//
//        print("You r right to vote")
//    }
//}

//  if-else

//fun main() {
//
//    val num: Int = 3
//
//    if(num % 2 == 0) {
//
//        print("Even")
//    }
//    else {
//
//        print("odd")
//    }
//}

// 3. if-else if-else

//fun main() {
//    val marks = 99
//    if(marks >= 95) {
//
//        print("A+")
//    } else if (marks >=90){
//
//        print("A")
//    }
//    else if(marks >= 85) {
//
//        print("B+")
//    } else if(marks >= 80) {
//
//        print("B")
//    } else if(marks >= 70) {
//
//        print("C")
//    }
//    else{
//
//        print("D")
//    }
//}


// 4. if as an Expression

//fun main(){
//
//    val city = "Azamgarh"
//
//    print("Enter your City ")
//    val inputCity = readln()
//    val hometown = if (city == inputCity) "You r from my city " else "No, U r not"
//    print(hometown)
//}

// when (Switch Replacement)
//
//fun main() {
//
//    val num = 4
//
//    when(num) {
//
//        2,4,6,8,10 -> print("Even")
//
//        1,3,5,7,9 -> print("Odd")
//    }
//}

//  Range in when

//fun main() {
//
//    val marks = 90
//
//    when(marks) {
//
//      in 90..100 -> print("A")
//        in 80 .. 90 ->print("B")
//        else -> print("C")
//    }
//}

//ex:2----------------------------

//fun main() {
//
//    val weekdays:Int;
//
//    print("Enter the week day : ")
//    weekdays = readln().toInt()
//
//    when(weekdays) {
//
//        1 -> print("Monday")
//        2 -> print("Tuesday")
//        3 -> print("Wednesday")
//        4 -> print("Thursday")
//        5 -> print("Friday")
//        6 -> print("Saturday")
//        7 -> print("Sunday")
//        else -> print("Invalid Day entered")
//    }
//}

// 1. Check if a number is:
//    * Positive / Negative / Zero
//2. Grade system using if
//3. Same grade system using when
//4. Simple calculator:
//    * Input 2 numbers + operator (+, -, *, /)
//    * Use when
//5. Check largest of 3 numbers

//fun main() {
//    /*
//        Simple calculator:
//       * Input 2 numbers + operator (+, -, *, /)
//       * Use when
//    */
//    println("Calculator:-")
//
//    val a : Int;
//    val b : Int;
//
//    print("Enter the value a & b :-")
//    a  = readln().toInt()
//    b = readln().toInt()
//
//    val choice : Int;
//
//    print("Enter choice 1 for addition , 2 for subtraction, 3 for multiplication , 4 for division")
//     choice = readln().toInt()
//    when(choice) {
//
//        1 -> print(a + b)
//        2 -> print(a - b)
//        3 -> print(a * b)
//        4 -> print(b / a)
//    }
//}

