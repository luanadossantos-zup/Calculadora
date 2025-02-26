import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTests {

    @Test
    public void testSuccessSoma() {
        Integer soma = Calculadora.soma(10,5);
        assertEquals(15, soma);
    }

    @Test
    public void testSuccessSubtracao() {
        Integer subtracao = Calculadora.subtracao(20,5);
        assertEquals(15, subtracao);
    }

    @Test
    public void testMultiplicacao() {
        Integer multiplicacao = Calculadora.multiplicacao(10,5);
        assertEquals(50,multiplicacao);

    }

    @Test
    public void testDivisao() {
        Integer divisao = Calculadora.divisao(20,4);
        assertEquals(5,divisao);
    }

    @Test
    public void testResto() {
        Integer resto = Calculadora.resto(20, 4);
        assertEquals(0,resto);
    }

    @Test
    public void testResultado() {
        assertEquals(5, Calculadora.resultado('+', 2, 3));
        assertEquals(-1, Calculadora.resultado('-', 2, 3));
        assertEquals(6, Calculadora.resultado('*', 2, 3));
        assertEquals(2, Calculadora.resultado('/', 6, 3));
        assertEquals(1, Calculadora.resultado('%', 7, 3));

    }

    @Test
    public void testGetOperacao() {

        String input = "+\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        assertEquals('+', Calculadora.getOperacao(scanner));

        input = "-\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
        assertEquals('-', Calculadora.getOperacao(scanner));

        input = "*\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
        assertEquals('*', Calculadora.getOperacao(scanner));


        input = "/\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
        assertEquals('/', Calculadora.getOperacao(scanner));

        input = "%\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
        assertEquals('%', Calculadora.getOperacao(scanner));

        // Simulando entrada inválida seguida de uma válida
        input = "x\n-\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
        assertEquals('-', Calculadora.getOperacao(scanner));

    }

    @Test
    public void testPrimeiroNumero() {
        String input = "11";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        assertEquals(11, Calculadora.getPrimeiroNumero(scanner));
    }

    @Test
    public void testUltimoNumero() {
        String input = "22";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        assertEquals(22, Calculadora.getUltimoNumero(scanner));
    }


}
