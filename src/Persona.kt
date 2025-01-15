class Persona(var peso: Double, var altura: Double) {
    fun calcularIMC() : Double = peso * altura

    fun saludar():String = "Saludos ${nombre}"

/*    fun alturaEncimaMedia() { // preguntar si en caso de que sea por debajo de la media se haria con if else, y si es correcto hacerlo con require o debe ser una funcion.
        if (altura >= 1.75){
            print("(por encima de la media)")
        }else{
            print("(por debajo de la media)")
        }
    }*/

    init {
        require(altura >= 1.75){"(por encima de la media)"}
        require(peso >= 70){"(por encima de la media)"}
    }

    fun pesoEncimaMedia():Boolean = peso >= 70

    var nombre: String? = "Desconocido"
    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        return "La persona llamada ${nombre}, con un peso de ${peso} y una altura de ${ altura}. Tiene un IMC de ${"%.2f".format (calcularIMC())}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return this.nombre == other.nombre && this.peso == other.peso && this.altura == other.altura
    }
}