class Pistola(municion: Int,
              tipoDeMuncion: String,
              danio: Int,
              radio: Radio): ArmaDeFuego("Pistola", municion, 1, tipoDeMuncion) {

                  override var danio: Int = danio
                      set(value) {
                          require(radio in Radio.REDUCIDO..Radio.CORTO) { "El rango de una pistola solo puede ser reducido o corto." }
                          field = value
                      }

                  override var radio: Radio = radio
                      set(value) {
                          require(danio in 1..5) { "El daño solo puede ser entre 1 y 5." }
                          field = value
                      }


                  init {
                      require(radio in Radio.REDUCIDO..Radio.CORTO) { "El rango de una pistola solo puede ser reducido o corto." }
                      require(danio in 1..5) { "El daño solo puede ser entre 1 y 5." }
                  }

}