import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test as Test1

class TestarEx2 {
    @Test1
    fun TestarDiaSemana() {
        val input = 1
        val diaSemana = diaSemanal(input)

       assertEquals("O dia é Domingo",diaSemana)
    }
}