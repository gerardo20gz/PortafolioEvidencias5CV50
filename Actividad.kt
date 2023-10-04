import kotlin.math.roundToInt

fun main(){
/*
    val userValidado =  login("Gerardo", "")

 */
    println("El promedio de el alumno es el siguiente: ${promedio(tercera =  10f)}")
    println("Redondear un numero, el numero sera 8.33, su reondeo es: ${redondear(8.33f)}")
    println("Redondear un numero, el numero sera 4.72, su reondeo es: ${redondear(4.72f)}")


}
//funciones locales
//funcion que vivive dentro de una dfuncion
/*
* solo va a funcionar en la funcion que esta dentro
* */

fun login(user: String, password: String) : Boolean {
    fun validar(input : String) : Boolean {
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validar(user)
    val passValidated =  validar(password)

    return userValidated && passValidated
}

fun imprimir(valor: String = "Este es el primer valor por defecto" , valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}
fun promedio(primera: Float = 8f, segunda: Float = 8f, tercera : Float): Float{
    return (primera+segunda+tercera)/3
}

fun redondear(numero:Float): Int{
    return numero.roundToInt()

}