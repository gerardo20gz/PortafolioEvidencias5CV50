fun main(){
    var numero1 = 3.2
    var numero2 = 2.1
    var numero3 = 2.1
    //tipoDato('a')
    tringulo(numero1,numero2,numero3)
}
fun tringulo(lado1: Double, lado2: Double, lado3: Double){
    if((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
        println("Triangulo Equilatero")
        }else if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            println("Triangulo Isosceles")
            }else{
                println("Triangulo Escaleno")
            }
}
fun tipoDato(dato: Any){
    when(dato){
        is String -> println("Es String")
        is Float -> println("Es un Float")
        is Int -> println("Es un Entero")
        is Double -> println("Es un Double")
        is Char -> println("Es un Char")
    }
}