import java.util.*

fun main(){
    print("masukan berat badan anda! \nBerat badan (kg):")
    val reader = Scanner(System.`in`)
    val berat_badan = reader.nextInt()
    print("masukan tinggi badan anda! \nTinggi badan (cm):")
    val tinggi_badan = reader.nextInt()
    val tinggi_badan_meter =tinggi_badan.toDouble()/100
    val tinggi_final =tinggi_badan_meter * tinggi_badan_meter
    val Bmi = berat_badan.toDouble()/ tinggi_final

    println("Berat badan anda adalah $berat_badan dan tinggi badan adalah $tinggi_badan" +
                "sehingga di dapat BMI $Bmi dan berdasarkan bmi anda masukan ke dalam kategori"

    )
    if (Bmi < 18.5){
        println("terlalu kurus")
    }else if (Bmi >= 18.5 && Bmi < 25){
        println("ideal")
    }else {
        println("gemuk")
    }
}