import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    @Test
    public void testAdd() {
        Calculatrice calc = new Calculatrice();
        assertEquals(6.0f, calc.add(4.0f, 2.0f));
    }

    @Test
    public void testDiv() {
        Calculatrice calc = new Calculatrice();
        assertEquals(3.0f, calc.div(7.0f, 4.0f));
    }

    @Test
    public void testDivByZero() {
        Calculatrice calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> {
            calc.div(8.0f, 0.0f);
        });
    }

    @Test
    public void testMult() {
        Calculatrice calc = new Calculatrice();
        assertEquals(35.0f, calc.mult(5.0f, 7.0f));
    }

    @Test
    public void testMinus() {
        Calculatrice calc = new Calculatrice();
        assertEquals(0.5f, calc.minus(2.0f, 1.5f));
        assertEquals(-2.0f, calc.minus(3.0f, 5.0f));
    }
}