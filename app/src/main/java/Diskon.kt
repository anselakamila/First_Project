/* Ibu beli belajaan di supermarket
400.000 -> diskon 4 %
800.000 -> diskon 9 %
1.600.000 -> diskon 19 %
2.000.000 -> diskon 25 %
3.000.000 -> diskon 40 %
total uang yang harus dibayar */
fun main() {
    val price = 2500000

    if (price >= 400000 && price < 800000) {
        val resultDiskon = 400000 * 4 / 100
        val finalprice = price - (resultDiskon)
        print("jadi total yang harus dibayar adalah $finalprice")


    } else if (price >= 800000 && price < 1600000) {
        val resultDiskon = 800000 * 9 / 100
        val finalprice = price - (resultDiskon)
        print("jadi total yang harus dibayar adalah $finalprice")

    } else if (price >= 1600000 && price < 2000000) {
        val resultDiskon = 1600000 * 19 / 100
        val finalprice = price - (resultDiskon)
        print("jadi total yang harus dibayar adalah $finalprice")


    } else if (price >= 2000000 && price < 3000000){
        val resultDiskon = 2000000 * 25 / 100
        val finalprice = price - (resultDiskon)
        print("jadi total yang harus dibayar adalah $finalprice")
    }else{
        val resultDiskon = 3000000 * 40 / 100
        val finalprice = price - (resultDiskon)
        print("jadi total yang harus dibayar adalah $finalprice")

    }

}






















