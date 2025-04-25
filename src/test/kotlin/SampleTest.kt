import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SampleTest {

    @Test
    fun `simple addition test`() {
        val result = add(2, 3)
        assertEquals(5, result)
    }

    private fun add(a: Int, b: Int): Int {
        return a + b
    }

    @Test
    fun `simple addition test should fail`() {
        val result = add(2, 3)
        assertEquals(999, result) // intentionally incorrect
    }
}
