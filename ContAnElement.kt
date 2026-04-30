import org.example.forEach

// 14
fun main() {

    val list = Array(10){0}

    var count = 0

    println("Enter the elements : ")
    for(i in 0 until list.size) {

        list[i] = readln().toInt()
    }
    for (i in 0 until list.size) {

        count++
    }
    println(list.size)

}