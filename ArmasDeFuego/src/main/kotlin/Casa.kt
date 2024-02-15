class Casa(municion: Int,
           danio: Int,
           radio: Radio): ArmaDeFuego("Casa", municion, 1, "Confetti") {

    override var danio: Int = danio
        set(value) {
            require(radio in Radio.REDUCIDO..Radio.AMPLIO) { "El rango de una casa solo puede ser entre reducido y amplio." }
            field = value
        }

    override var radio: Radio = radio
        set(value) {
            require(danio in 1..3) { "El daño solo puede ser entre 1 y 3." }
            field = value
        }


    init {
        require(radio in Radio.REDUCIDO..Radio.AMPLIO) { "El rango de una casa solo puede ser entre reducido y amplio." }
        require(danio in 1..3) { "El daño solo puede ser entre 1 y 3." }
    }

}