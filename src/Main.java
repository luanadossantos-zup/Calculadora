import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero, ultimoNumero, resultado;
        char operacao;

        System.out.println("-----Calculadora Simples-----");
        System.out.println("--> Digite o primeiro número:");

        primeiroNumero = scanner.nextInt();

        do {
            System.out.println("--> Por favor, digite uma opção:");
            System.out.println("+ para adição");
            System.out.println("- para subtração");
            System.out.println("* para multiplicação");
            System.out.println("/ para divisão");

            operacao = scanner.next().charAt(0);

            if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
                System.out.println("Opção inválida!!!");
            }

        } while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/');


        System.out.println("--> Por último, selecione o último número:");
        ultimoNumero = scanner.nextInt();



        switch (operacao) {

            case '+' :

                System.out.println(resultado = primeiroNumero + ultimoNumero);
                break;

            case '-' :
                System.out.println(resultado = primeiroNumero - ultimoNumero);
                break;

            case '*' :
                System.out.println(resultado = primeiroNumero * ultimoNumero);
                break;

            case '/' :
                System.out.println(resultado = primeiroNumero / ultimoNumero);
        }


    }
}