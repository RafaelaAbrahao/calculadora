package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            Calculadora.resultados();

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida!");
                return;
            }

            try {
                System.out.println("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double n2 = scanner.nextDouble();


                double resultado = executarOperacoes(opcao, n1, n2);
                String operacao = tipoOperacao(opcao);
                System.out.println("O resultado da " + operacao + " é " + resultado);
            } catch (InputMismatchException e) {
                System.out.println("ERROOOOOOOOOOOO:");
            }
            
        } while (opcao != 0);
    }

    private static double executarOperacoes(int opcao, double n1, double n2) {

        switch (opcao) {

            case 1:
                return Calculadora.soma(n1, n2);
            case 2:
                return Calculadora.subtracao(n1, n2);
            case 3:
                return Calculadora.multiplicacao(n1, n2);
            case 4:
                return Calculadora.divisao(n1, n2);
            default:
                return 0; //throw new IllegalArgumentException("A opção é inválida: "+ opcao);
        }
    }

    private static String tipoOperacao(int opcao) {
        String[] operacao = {"adição", "subtração", "multiplicação", "divisão"};
        return operacao[opcao - 1];

    }
}