fun main() {

    val list = Array(5) {0}

    println("Enter the elements : ")

    for (i in 0 until list.size) {

        list[i] = readln().toInt()
    }

    for(i in 0 until list.size) {

        if(list[i] % 2 == 0) {

            list[i] = list[i] * list[i]
        }
    }
    println(list.joinToString())
}