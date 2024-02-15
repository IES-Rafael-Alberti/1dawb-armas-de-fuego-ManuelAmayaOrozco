class Coche(municion: Int,
            danio: Int,
            radio: Radio): ArmaDeFuego("Coche", municion, 1, "Ráfaga de luz larga") {

    override var danio: Int = danio
        set(value) {
            require(radio in Radio.CORTO..Radio.AMPLIO) { "El rango de un coche solo puede ser entre corto y amplio." }
            field = value
        }

    override var radio: Radio = radio
        set(value) {
            require(danio in 1..5) { "El daño solo puede ser entre 1 y 5." }
            field = value
        }


    init {
        require(radio in Radio.CORTO..Radio.AMPLIO) { "El rango de un coche solo puede ser entre corto y amplio." }
        require(danio in 1..5) { "El daño solo puede ser entre 1 y 5." }
    }

}