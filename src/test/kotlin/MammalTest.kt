import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse


class MammalTest {

    @Test
    fun `When instantiating the dog class it should behave like a subclass of Dog`(){

        val dog = Dog()
        //assertTrue (dog.isInstanceOf(Dog()))
        assertTrue(dog is Dog)
        assertFalse(dog::class == Penguim::class)
        assertEquals(dog::class, Dog::class)

    }

}