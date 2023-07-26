fun main() {
    println("Digite um numero")
   val inputi= readln().toInt()
    diaSemanal(inputi)
} fun diaSemanal(inputi : Int) : String{
    val semana = when(inputi){
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Valor inválido"
    }
    return "O dia é $semana"
}
