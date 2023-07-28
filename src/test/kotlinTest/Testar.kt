package kotlinTest

import Serviço
import org.testng.AssertJUnit.assertEquals
import org.testng.AssertJUnit.assertFalse
import org.testng.annotations.Test

class Testar {
    private var produto1 = Serviço.Produto("Maçã", 3, 5.00)
    private var produto2 = Serviço.Produto("Pera", 3, 10.00)
    private var serviço = Serviço()

    @Test
    fun testarMetodoCalcularProduto(){
        assertEquals("O preço total é 45.0",  serviço.Calculo(produto1, produto2))
    }
    @Test
    fun testarMetodoPromocao(){
        serviço.Calculo(produto1, produto2)
        assertEquals("A quantidade atual é 8 no preço de 45.0",serviço.promocao(produto1,produto2))
    }
    @Test
    fun testarTempoEstimado(){
        serviço.Calculo(produto1, produto2)
        assertEquals("tempo estimado: 2hrs",serviço.notificarTempoStatus(produto1,produto2,45.0))
    }
    @Test
//    fun testarRealizarPagamento(){
//        assertEquals( "Concluido com sucesso", serviço.realizarPagamento(produto1,produto2,45.0))
//       // falta um a mais
//    }

    fun testarControleEstoque(){
        serviço.Calculo(produto1, produto2)
        assertEquals("pedido concluido",serviço.controleDeEstoque(produto1,produto2,2))
    }
}