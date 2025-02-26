import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTests {

    @Test
    public void testSuccessSoma() {
        Integer soma = Calculadora.soma(10,5);
        assertEquals(15, soma);
    }


}
