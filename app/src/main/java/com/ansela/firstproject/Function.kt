package com.ansela.firstproject
fun main(){
    val name = "ansela"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)
}

fun morning(name : String){
    println("halo selamat pagi ansela $name")
}
fun afternoon(name : String){
    println("halo selamat siang ansela $name")
}
fun evening(name : String){
    println("halo sore ansela $name")
}
fun night(name : String){
    println("halo selamat malam ansela  $name")
}
fun goodbye(name : String){
    println("sampai jumpa ansela $name")
}
