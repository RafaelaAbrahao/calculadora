package calculadora;

public class Calculadora {

    public static double soma (double n1, double n2) {
        return n1 + n2;
    }

    public static double subtracao (double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicacao (double n1, double n2) {
        return n1 * n2;
    }

    public static double divisao (double n1, double n2) {
        if (n2 == 0){
            throw new ArithmeticException("A divisão por 0 não é permitida.");
        }
        return n1 / n2;
    }

    public static void resultados() {

        System.out.println("----Digite o número equivalente a operação que deseja----");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        System.out.println("0) Sair");
        System.out.println("Opção: ");
    }

}