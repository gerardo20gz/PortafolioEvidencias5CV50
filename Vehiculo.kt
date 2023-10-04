class Vehiculo {

    var color = ""
    var marca = ""
    var Modelo = ""
    var placas = ""
    var encendido = false
    var gasolina = 0f

    fun escender(){
       encendido = true
    }
    fun apagar(){
        encendido = false

    }
    fun recargar(litros:Float){

        gasolina+= litros

    }
}