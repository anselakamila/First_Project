fun main(){
    persegi(6.0)
    persegiPanjang(4.0,10.0)
    jajarGenjang(7.0,11.0)
    layangLayang(5.0,10.0)
    trapesium(6.0,8.0,11.0)
    lingkaran(6.0,10.0)
    belahKetupat(4.0,6.0)
    segitiga(6.0,8.0)

}

fun segitiga(alas: Double,tinggi: Double) {
    val result = alas * tinggi/2
    println("luas segitiga adalah $result ")
}

fun belahKetupat(diagonal1: Double,diagonal2: Double) {
    val result = diagonal1 * diagonal2/2
    println("luas belah ketupat adalah")

}

fun lingkaran(phi : Double,r : Double ) {
    val result = phi * r * r
    println("luas liangkaran adalah $result")

}

fun trapesium(sisi_A : Double,sisi_b: Double,tinggi : Double) {
    val result =((sisi_A + sisi_b) * tinggi)/2
    println("luas trapesium adalah $result")


}

fun layangLayang(diagonal1 : Double,diagonal2: Double) {
    val result = diagonal1 * diagonal2 /2
    println("luas layang layang adalah $result")
}

fun jajarGenjang(alas : Double,tinggi : Double ) {
    val result = alas * tinggi
    println("luas jajarGenjang adalah $result")

}



fun persegiPanjang(panjang : Double, lebar : Double) {
    val result = panjang * lebar
    println("Luas persegi panjang adalah $result")

}

fun persegi(sisi : Double){
    val result = sisi * sisi
    println("luas persgi adalah $result")
}
