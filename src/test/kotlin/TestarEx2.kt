import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestarEx2 {
    @Test
    fun TestarDiaSemana() {
        val input = 1
        val diaSemana = diaSemanal(input)

       assertEquals("Domingo",diaSemana)
    }
}