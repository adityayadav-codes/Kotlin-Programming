fun main() {

    val list = Array<Array<Int>>(2) { Array(2) { 0 } }

    println("Enter 2❌2 matrix")

    for (i in 0 until list.size) {

        for (j in 0 until list[i].size){

            list[i][j] = readln().toInt()
        }
    }
    println("---------------")

    for (n in list) {

        println(n.joinToString (" "))
    }

    for (i in 0 until list.size) {

        for (j in 0 until list[i].size) {

            if (list[i][j] == 0){

                for (i in 0 until list.size) {

                    for (j in 0 until list[i].size) {

                        list[i][j] = 0
                    }
                }
            }

        }

    }

    println("-------------")

    for (n in list) {

        println(n.joinToString (" "))
    }
}
