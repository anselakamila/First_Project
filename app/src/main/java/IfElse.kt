import java.util.*

fun main(){
    val reader = Scanner(System. `in`)
    print("masukan bilangan : ")
    val number = reader.nextInt()

    if (number < 0){
        print("negative")
    }else{
        print("positive")
    }
}