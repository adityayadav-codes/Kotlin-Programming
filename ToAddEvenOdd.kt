fun main() {

    println("Enter the size of Element : ")
    val n= readln().toInt()
    val list = Array(n) {0}
println("Enter the ${n} Elements : ")
    for (i in 0 until n) {

        list[i] = readln().toInt()
    }
    var addEven = 0
    var addOdd = 0

    for (i in 0 until list.size) {

        if(list[i] % 2 == 0) {

            addEven += list[i]
        }
        else {

            addOdd += list[i]
        }
    }
    println("Sum of Even : $addEven")
    println("Sum of odd : $addOdd")
}