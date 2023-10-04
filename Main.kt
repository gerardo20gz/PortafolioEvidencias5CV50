
fun main(args: Array<String>) {
  //val  phone = Phone()

  //phone.getTurn()

  val myVehiculo = Vehiculo()

  myVehiculo.color = "Verde"
  myVehiculo.marca = "Ford"
  myVehiculo.Modelo = "Focus"
  myVehiculo.placas = "REM-4123"
  println("el coche esta prendido? ${myVehiculo.encendido}")
  myVehiculo.escender()
  println("el coche esta prendido? ${myVehiculo.encendido}")

  println("El tanque tiene: ${myVehiculo.gasolina}")
  myVehiculo.recargar(20.07f)
  println("El tanque tiene: ${myVehiculo.gasolina}")


}

