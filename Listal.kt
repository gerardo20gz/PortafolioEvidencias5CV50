fun main(){
    //Ya matenme porfavor

    //Lista o Arreglo

    val numeros =  listOf("one", "two", "three", "four", "five")
    println(numeros)

    println("Numero de Elementos: ${numeros.size}")
    println("Segundo Elemento: ${numeros.get(1)}")
    println("Cuarto Elemento: ${numeros[3]}")
    println("Ultimo Elemento: ${numeros.get(numeros.size-1)}")
    println("Indez del elemento \"four\" : ${numeros.indexOf("four")}")

    //Mutable List
    //Nos permite alterar los elementos de una lista, podemos agregar, modificar, eliminar y leer los elementos

    val list = mutableListOf(1,2,3,4,5,6)
    println(list)
    //Agregar Elementos
    list.add(7)
    println(list)
    //Remover Elementos, de acuerdo, el parametro que se envia es la posicion de la lista
    list.removeAt(2)
    println(list)
    //Modificar elemento
    list[0] = 0
    println(list)

    //Set
    // es una operacion  que regresa una serie de elementos unica que no se repita
    // almacen valores unicos, tambien se puede almacenar valores
    // Usamos la funcion setOf()

    //Se crean dos sets con valores unicos y desornados
    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reverseNumSet: Set<Int> = setOf(5,4,2,3,2,1,0)

    //Set Mutable

    var names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")

    //Map
    //o Diccionario es un conjunto de pares clave-valor, cada clave es unicay cada una ellas se asigna exactamente un valor

    val namesToAges : Map<String, Int> = mapOf("user_one" to 20,"user_two" to 23)

    //iterando un Map
    for ((key, value) in namesToAges){
        println("$key tiene $value años")
    }
}