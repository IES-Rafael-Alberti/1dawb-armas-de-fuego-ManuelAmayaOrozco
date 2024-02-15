fun main(args: Array<String>) {
    val pistola = Pistola(15, "Bala", 3, Radio.CORTO)
    val rifle = Rifle(50, "Bala", 8, Radio.INTERMEDIO)
    val bazooka = Bazooka(10, "RPG", 25, Radio.ENORME)
    val casa = Casa(5, 2, Radio.AMPLIO)
    val coche = Coche(100, 5, Radio.AMPLIO)
    val bocadillo = Bocadillo(12, 10, Radio.CORTO)

    val armas = listOf<ArmaDeFuego>(pistola, rifle, bazooka, casa, coche, bocadillo)

    pistola.mostrarMunicionExtra()

    val disparos = (1..12).map { armas.random() to (1..6).random() }
    var count = 1

    for (disparo in disparos) {
        println("*** Disparo $count")
        disparo.first.dispara()
        println(disparo.first)
        count++
    }
}