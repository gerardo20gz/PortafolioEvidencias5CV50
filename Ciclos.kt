fun main(){

    //imprimir un rango de numeros de 1 al 5
    for(i in 1..5){
        println(i)
    }
    //otra notacion
    for(i in 1 until  5){
        println(i)
    }
    //contar de dos en dos
    for(i in 0..10 step 2){
        println(i)
    }

    //iterar una lista
    val nombres = listOf("Kirby","Ness","Fox","Luigi","Mario","Link","Capitan Falconp","Samus","Pikachu", "Jigglypuff", "Donkey Kong", "Yoshi")
    for(nombre in nombres){
        println(nombre)
    }

    //iterar un lista de String a traves del metodo llamado foreach
    nombres.forEach { println(it) }

    //ejemplo
    for (nombre in nombres){
        println(nombre)
        if(nombre == "Link"){
            println("nombre encontrado")
            break
        }else{
            println("nombre no encontrado")
        }
    }

    // Ciclo While

    var x = 20

    while (x>=0){
        println(x)
        x-=1
    }

    //Funcion de contar cuantas veces se repite un nombre de acuerdo a una lista de nombres
    val nombreContador = countName("Juan");
    println("Numero de Veces que se repitio el nombre: $nombreContador")

    //Ciclo Do While

    /*do {
        /*codigo */
    }while(condicion)
     */
    var y = 20
    do {
        println(y)
        y--
    }while(y>0)

}
fun countName(name: String) : Int{
    var count = 0
    val nombres = listOf("Juan", "Juan_Pedro", "Anna Sofia", "Jose_Juan", "Mireya Maria", "Juan", "Ernesto", "Pedro")
    for(currentName in nombres){
        if (name in currentName){
            count++
        }
    }
    return count
}


