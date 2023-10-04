fun main(){

    println("Area con valores por defecto: ${rectanguleArea()}")
    println("Area con valores por defecto: ${rectanguleArea(10.0)}")
    println("Area con valores por defecto: ${rectanguleArea(height = 10.0)}")
    println("Area con valores por defecto: ${rectanguleArea(height = 2.0, base = 3.5)}")
    println("Area Prisma Rectangular: ${areaPrismaRectanngular(5.2,9.3,2.0)}")
    println("Volumen Rectangular: ${volumenPrismaRectangular(2.1,9.2,1.4)}")
}
fun rectanguleArea(base:Double= 20.0, height:Double=30.0):Double{
    return base*height
}
fun areaPrismaRectanngular(lado1: Double, ancho: Double, altura:Double):Double{
    return 2*((lado1*(ancho+altura))+(ancho*altura))
}
fun volumenPrismaRectangular(lado: Double, ancho: Double, altura:Double):Double{
    return lado*ancho*altura
}