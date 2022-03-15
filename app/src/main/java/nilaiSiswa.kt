fun main(){
    val nilai = 90

    if (nilai < 75){
        print("nilai anda kurang")
    }else if (nilai == 75){
        print("nilai anda cukup")
    }else if ((nilai >= 75) && (nilai <= 79)){
        print("nilai anda cukup")
    }else if (nilai >= 80 && nilai <= 89){
        print("nilai anda baik")
    }else {
        print("nilai anda sangat baik")
    }

}