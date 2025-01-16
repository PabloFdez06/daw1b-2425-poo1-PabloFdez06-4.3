class Persona(var peso: Double, var altura: Double) {
    fun calcularIMC() : Double = peso * altura

    fun saludar():String = "Saludos ${nombre}"

    private fun alturaEncimaMedia() : Boolean { // preguntar si en caso de que sea por debajo de la media se haria con if else, y si es correcto hacerlo con require o debe ser una funcion.
        if (altura >= ALTURA_MEDIA) {
            return true
        } else {
            return false
        }
    }

    private fun pesoEncimaMedia():Boolean {
        if (peso >= PESO_MEDIO){
            return true
        }else{
            return false
        }
    }

    private fun estadoImc() : String {
        var imc: Double = calcularIMC()
        return when {
            imc < 18.5 -> "peso insuficiente"
            imc in 18.5..24.9 -> "peso saludable"
            imc in 25.0..29.9 -> "sobrepeso"
            else -> "obesidad"
        }
    }

    companion object{
        const val ALTURA_MEDIA = 1.75
        const val PESO_MEDIO = 70.0
    }


    var nombre: String? = "Desconocido"
    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        return "${nombre} con una altura de ${altura} (${if (alturaEncimaMedia()) {"Altura por encima de la media"}else{"Altura por debajo de la media"}}) y un peso de ${peso}kg (${if (pesoEncimaMedia()) {"Peso por encima de la media"}else{"Peso por debajo de la media"}}). Tiene un IMC de ${"%.2f".format (calcularIMC())} (${(estadoImc())})"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return this.nombre == other.nombre && this.peso == other.peso && this.altura == other.altura
    }
}