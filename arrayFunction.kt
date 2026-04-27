package org.example

fun size1() {

    println("-----size-----------")
    val arr = arrayOf(10,20,30)

    println(arr.size)
}
fun getAndset() {

    println("-------get&set---------------")
    val arr = arrayOf(10,20,30)

        println(arr.get(1))

    arr.set(1,100)

    println(arr[1])
    println(arr.joinToString())
}

fun firstAndLat() {

    println("-------firstAndLast------------")
    val arr = arrayOf(10,20,30)

    println(arr.first())

}
fun contain() {

    println("------contains----------------")

    val arr = arrayOf(10,20,30,40,50)

    println("hai ya nahi : ${arr.contains(90)}");
}

fun sortAndSorted() {

    println("-------sort/sorted-----------")
    val arr = arrayOf(10,30,50,20,40,80,70)

    //sort--
    arr.sort()
    println(arr.joinToString())

    // sorted--
    val newArray = arr.sorted()
    println(newArray)
}

fun reverseAndReversed() {
    println("---reverse/reversed-----------")

    val arr = arrayOf(1, 2, 3)

    arr.reverse()
    println(arr.joinToString())

    val arr1 = arrayOf(1,2,3)
    val newArr1 = arr1.reversed()
    println(newArr1)
}

fun sumMaxMin() {

    println("--sumMaxMin---")

    val arr = arrayOf(1,4,6,8,10)

    println("sum : ${arr.sum()}")
    println("Min : ${arr.min()}")
    println("Max : ${arr.max()}")
}

fun forEach() {
    println("--forEach--------")
    val arr = arrayOf(10,20,30)
    arr.forEach {
        println(it)
    }
}

fun map() {

    println("---Map-----")

    val arr = arrayOf(1,2,3,4,5)

    val result = arr.map { it * 2 }
    println(result)
}
fun filter() {

    println("---filter----")

    val arr = arrayOf(1,2,3,4)

    val even = arr.filter { it % 2 == 0 }

    println(arr.joinToString ())
    println(even)
}

fun joinToString() {

    val arr = arrayOf(10,20,30)

    println(arr.joinToString("=>>"))
}
fun main() {

    size1()
    getAndset()
    firstAndLat()
    contain()
    sortAndSorted()
    reverseAndReversed()
    sumMaxMin()
    forEach()
    map()
    filter()
    joinToString()
}