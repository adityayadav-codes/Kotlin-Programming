//fun main() {
//
//    val list = Array(3) { IntArray(3) }
//
//    println("Enter Element for Matrix : ")
//
//    for (i in 0 until 3){
//
//        for (j in 0 until 3) {
//
//            list[i][j] = readln().toInt()
//        }
//        println("Matrix:- ")
//
//        for (i in 0 until 3) {
//
//            for (j in 0 until 3) {
//
//                print("${list[i][j]} ")
//            }
//            println()
//        }
//    }
//}

//
fun main() {

    val list = Array(3) { IntArray(3) }

    println("Enter Element for Matrix : ")

    for (i in 0 until 3){
        for (j in 0 until 3) {
            list[i][j] = readln().toInt()
        }
    }

    println("Matrix:- ")

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("${list[i][j]} ")
        }
        println()
    }
}
