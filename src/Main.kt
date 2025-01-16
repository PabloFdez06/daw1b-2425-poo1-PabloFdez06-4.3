fun main() {
    val persona1 = Persona(68.5, 1.77)
    val persona2 = Persona("Pablo", 120.0, 1.90)
    val persona3 = Persona("Viti", 76.0, 1.61)

    println(persona1)
    println(persona2)
    println(persona3)

    println("-------------------------")

    print("Introduce el nombre de la persona 1: ")
    val nombreUs = readln()
    persona1.nombre = nombreUs
    println("La persona llamada ${persona1.nombre}, pesa ${ persona1.peso } kilos, y mide ${"%.2f".format (persona1.altura) }metros")

    println("-------------------------")

    println("--SOBRE LA PERSONA 3--")

    println("La persona llamada 3, pesa ${persona3.peso}kg, mide ${persona3.altura} y tiene un indice de masa corporal de ${"%.2f".format(persona3.calcularIMC())}%")
    print("Modifica la altura del usuario: ")
    val modAltura = readln().toDouble()
    persona3.altura = modAltura
    println("La persona llamada 3, pesa ${persona3.peso}kg, mide ${persona3.altura} y tiene un indice de masa corporal de ${"%.2f".format(persona3.calcularIMC())}%")

    println("--SOBRE LA PERSONA 3--")

    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)

    if (persona2.equals(persona3)) {
        println("Las personas 2 y 3 son iguales")
    }else{
        println("Las personas 2 y 3 NO son iguales")
    }

}
