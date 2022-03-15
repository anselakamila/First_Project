import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    print("masukan bilangan pertama")
    val bil1 = reader.nextInt()

    print("masukan bilangan kedua :")
    val bil2 = reader.nextInt()

    calculator2Bil(bil1, bil2)
}

fun calculator2Bil(bil1 : Int,bil2 : Int) {
    val penjumlahan = bil1 + bil2
    val perkalian = bil1 * bil2
    val pengurangan = bil1 - bil2
    val pembagian = bil2.toDouble() / bil1.toDouble()


    println("opersi matematika antar $bil1 dan $bil2 sebagai berikut \n + penjumlahan $penjumlahan " +
            "\n + pengurangan $pengurangan \npembagian $pembagian")

}
