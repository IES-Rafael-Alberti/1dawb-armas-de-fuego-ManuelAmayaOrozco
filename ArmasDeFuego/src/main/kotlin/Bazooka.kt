class Bazooka(municion: Int,
              tipoDeMuncion: String,
              danio: Int,
              radio: Radio): ArmaDeFuego("Bazooka", municion, 3, tipoDeMuncion) {

    override var danio: Int = danio
        set(value) {
            require(radio in Radio.INTERMEDIO..Radio.ENORME) { "El rango de un bazooka solo puede ser entre intermedio y enorme." }
            field = value
        }

    override var radio: Radio = radio
        set(value) {
            require(danio in 10..30) { "El daño solo puede ser entre 10 y 30." }
            field = value
        }


    init {
        require(radio in Radio.INTERMEDIO..Radio.ENORME) { "El rango de un bazooka solo puede ser entre intermedio y enorme." }
        require(danio in 10..30) { "El daño solo puede ser entre 10 y 30." }
    }
}