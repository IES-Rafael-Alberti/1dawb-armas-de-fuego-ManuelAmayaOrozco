class Rifle(municion: Int,
            tipoDeMuncion: String,
            danio: Int,
            radio: Radio): ArmaDeFuego("Rifle", municion, 2, tipoDeMuncion) {

    override var danio: Int = danio
        set(value) {
            require(radio.radio == "Intermedio" || radio.radio == "Corto") { "El rango de una pistola solo puede ser corto o intermedio." }
            field = value
        }

    override var radio: Radio = radio
        set(value) {
            require(danio in 5..10) { "El daño solo puede ser entre 5 y 10." }
            field = value
        }

    init {
        require(radio.radio == "Intermedio" || radio.radio == "Corto") { "El rango de una pistola solo puede ser corto o intermedio." }
        require(danio in 5..10) { "El daño solo puede ser entre 5 y 10." }
    }

}