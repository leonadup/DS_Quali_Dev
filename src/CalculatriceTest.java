import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    @Test
    public void testAdd() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5.0f, calc.add(2.0f, 3.0f));
    }

    @Test
    public void testDiv() {
        Calculatrice calc = new Calculatrice();
        assertEquals(2.0f, calc.div(4.0f, 2.0f));
    }

    @Test
    public void testDivByZero() {
        Calculatrice calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> {
            calc.div(1.0f, 0.0f);
        });
    }

    @Test
    public void testMult() {
        Calculatrice calc = new Calculatrice();
        assertEquals(6.0f, calc.mult(2.0f, 3.0f));
    }
}