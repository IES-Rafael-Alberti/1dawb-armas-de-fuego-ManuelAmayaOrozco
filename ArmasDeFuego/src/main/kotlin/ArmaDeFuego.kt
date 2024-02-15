import kotlin.random.Random

abstract class ArmaDeFuego(private val nombre: String,
                           private var municion: Int,
                           private val municionARestar: Int,
                           private val tipoDeMuncion: String) {

    abstract val danio: Int
    abstract val radio: Radio

    open fun dispara() {
        if (municion < municionARestar) {
            if (cantidadMunicionExtra < (municionARestar * 2)) {
                if(cantidadMunicionExtra < municionARestar) {
                    println("No hay suficiente munición para disparar.")
                }
                else {
                    recargar()
                    municion -= municionARestar
                    println("$nombre se ha disparado. (Munición restante = $municion)")
                }
            }
            else {
                recargar()
                municion -= municionARestar
                println("$nombre se ha disparado. (Munición restante = $municion)")
            }
        }
        else {
            municion -= municionARestar
            println("$nombre se ha disparado. (Munición restante = $municion)")
        }
    }

    fun recargar() {
        if (cantidadMunicionExtra < (municionARestar * 2)) {
            if(cantidadMunicionExtra < municionARestar) {
                println("No hay suficiente munición extra para recargar.")
            }
            else {
                municion += cantidadMunicionExtra
                val dif = municion - cantidadMunicionExtra
                cantidadMunicionExtra -= dif
                println("$nombre ha sido recargada. (Munición = $municion)")
            }
        }
        else {
            municion += cantidadMunicionExtra
            val dif = municion - cantidadMunicionExtra
            cantidadMunicionExtra -= dif
            println("$nombre ha sido recargada. (Munición = $municion)")
        }
    }

    fun mostrarInfo() {
        println("Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMuncion, Daño: $danio, Radio: ${radio.radio}")
    }

    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMuncion, Daño: $danio, Radio: ${radio.radio}"
    }

    fun mostrarMunicionExtra() {
        println("Munición extra = $cantidadMunicionExtra... Para todas las armas de fuego.")
    }

    companion object {
        var cantidadMunicionExtra = Random.nextInt(5, 16)
    }
}