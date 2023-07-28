import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class TestarEx3 {
    @Test
    fun TestarMaiorNumero(){
        val numero = listOf(10,2,3,6)
        val maiorNumero = numero.max()

        assertEquals(10,maiorNumero)
    }
}