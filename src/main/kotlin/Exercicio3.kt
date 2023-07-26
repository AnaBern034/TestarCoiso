fun main() {
    val numeros = mutableListOf<Int>()
    for (i in 1..5){
        println("Digite o numero $i")
        val  numero = readln().toInt()
        numeros.add(numero)
    }
        val numeroM = numeros.max()
    println("O maior numero é $numeroM")

}