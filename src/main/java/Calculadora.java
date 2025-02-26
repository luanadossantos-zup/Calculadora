import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero, ultimoNumero;
        char operacao;

        System.out.println("-----Calculadora Simples-----");

        primeiroNumero = getPrimeiroNumero(scanner);

        operacao = getOperacao(scanner);

        ultimoNumero = getUltimoNumero(scanner);

        System.out.println(resultado(operacao, primeiroNumero, ultimoNumero));

        scanner.close();

    }

    public static int getPrimeiroNumero(Scanner scanner) {
        int primeiroNumero;
        System.out.println("--> Digite o primeiro número:");

        primeiroNumero = scanner.nextInt();
        return primeiroNumero;
    }

    public static char getOperacao(Scanner scanner) {
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

    public static int getUltimoNumero(Scanner scanner) {
        int ultimoNumero;
        System.out.println("--> Por último, selecione o último número:");
        ultimoNumero = scanner.nextInt();
        return ultimoNumero;
    }

    public static int resultado(char operacao, int primeiroNumero, int ultimoNumero) {

        int numero = 0;
        switch (operacao) {

            case '+' :
                numero = soma(primeiroNumero, ultimoNumero);
                return numero;

            case '-' :
                numero = subtracao(primeiroNumero, ultimoNumero);
                return numero;

            case '*' :
                numero = multiplicacao(primeiroNumero, ultimoNumero);
                return numero;

            case '/' :

                numero = divisao(primeiroNumero, ultimoNumero);
                return numero;

            case '%':
                numero = resto(primeiroNumero, ultimoNumero);
                return numero;

        }

        return numero;
    }

    public static int resto(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero % ultimoNumero;
    }

    public static int divisao(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero / ultimoNumero;
    }

    public static int multiplicacao(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero * ultimoNumero;
    }

    public static int subtracao(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero - ultimoNumero;
    }

    public static int soma(int primeiroNumero, int ultimoNumero) {
        return primeiroNumero + ultimoNumero;
    }
}