class Phone {
    var isOn = false

    //meotodos
    fun  turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun getTurn(){
        val turnMode = if(isOn) "Encendido" else "Apagado"
        println("el telefono esra $turnMode")
    }
}