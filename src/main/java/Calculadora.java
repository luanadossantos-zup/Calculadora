import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero, ultimoNumero;
        char operacao;

        System.out.println("-----Calculadora Simples-----");

        primeiroNumero = getPrimeiroNumero(scanner);

        operacao = getOperacao(scanner);


        ultimoNumero = getUltimoNumero(scanner);


        resultado(operacao, primeiroNumero, ultimoNumero);

        scanner.close();

    }

    private static int getPrimeiroNumero(Scanner scanner) {
        int primeiroNumero;
        System.out.println("--> Digite o primeiro número:");

        primeiroNumero = scanner.nextInt();
        return primeiroNumero;
    }

    private static char getOperacao(Scanner scanner) {
        char operacao;
        do {
            System.out.println("--> Por favor, digite uma opção:");
            System.out.println("+ para adição");
            System.out.println("- para subtração");
            System.out.println("* para multiplicação");
            System.out.println("/ para divisão");
            System.out.println("% para resto de divisão");

            operacao = scanner.next().charAt(0);

            if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/' && operacao != '%') {
                System.out.println("Opção inválida!!!");
            }

        } while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/' && operacao != '%');
        return operacao;
    }

    private static int getUltimoNumero(Scanner scanner) {
        int ultimoNumero;
        System.out.println("--> Por último, selecione o último número:");
        ultimoNumero = scanner.nextInt();
        return ultimoNumero;
    }

    private static void resultado(char operacao, int primeiroNumero, int ultimoNumero) {
        switch (operacao) {

            case '+' :

                System.out.println(soma(primeiroNumero, ultimoNumero));
                break;

            case '-' :
                System.out.println(subtracao(primeiroNumero, ultimoNumero));
                break;

            case '*' :
                System.out.println(multiplicacao(primeiroNumero, ultimoNumero));
                break;

            case '/' :
                System.out.println(divisao(primeiroNumero, ultimoNumero));

            case '%':
                System.out.println(resto(primeiroNumero, ultimoNumero));
        }
    }

    private static int resto(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero % ultimoNumero;
    }

    private static int divisao(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero / ultimoNumero;
    }

    private static int multiplicacao(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero * ultimoNumero;
    }

    private static int subtracao(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero - ultimoNumero;
    }

    private static int soma(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero + ultimoNumero;
    }
}