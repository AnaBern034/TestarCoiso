

class Serviço {
    val produtos = mutableListOf<Produto>()

    data class Produto(var nome: String, var quantidade: Int, var preco: Double)

    var somaTotal = 0.0
    fun Calculo(produto1: Produto, produto2: Produto): String {

        produtos.add(produto1)
        produtos.add(produto2)

        produtos.forEach() {
            somaTotal += it.preco * it.quantidade
        }
        return "O preço total é $somaTotal"

    }

    fun promocao(produto1: Produto, produto2: Produto): String {
        println("Comprando produto")
        var quantidadeAtual = 0

        produtos.add(produto1)
        produtos.add(produto2)

        produto1.quantidade++
        produto2.quantidade++
        quantidadeAtual = produto1.quantidade + produto2.quantidade

        return "A quantidade atual é $quantidadeAtual no preço de $somaTotal"

    }

    fun notificarTempoStatus(produto1: Produto, produto2: Produto, cash: Double): String {
        if (cash < somaTotal) {
            println("Dinheiro insuficiente")
        } else {
            println("Concluido com sucesso")
        }
        return "tempo estimado: 2hrs"
    }

    fun controleDeEstoque(produto1: Produto, produto2: Produto, entrada: Int): String {
        if (entrada > produto1.quantidade && entrada > produto2.quantidade) {
            return "insuficiente"
        } else {
            return "pedido concluido"
        }
    }
//    fun realizarPagamento(produto1: Produto, produto2: Produto, limite: Int): String {
//        if (limite > produto1.quantidade && limite < produto2.quantidade) {
//            return "insuficiente"
//        } else {
//            return "pedido falho"
//        }
//    }
}