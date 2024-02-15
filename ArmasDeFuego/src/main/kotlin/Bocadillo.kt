class Bocadillo(municion: Int,
                danio: Int,
                radio: Radio): ArmaDeFuego("Bocadillo", municion, 1, "Olor a jamón") {


    override var danio: Int = danio
        set(value) {
            require(radio in Radio.REDUCIDO..Radio.CORTO) { "El rango de un bocadillo solo puede ser reducido y corto." }
            field = value
        }

    override var radio: Radio = radio
        set(value) {
            require(danio in 1..10) { "El daño solo puede ser entre 1 y 10." }
            field = value
        }


    init {
        require(radio in Radio.REDUCIDO..Radio.CORTO) { "El rango de un bocadillo solo puede ser reducido y corto." }
        require(danio in 1..10) { "El daño solo puede ser entre 1 y 10." }
    }

}