import exceptions.InputInvalidoException;
import exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = lerInteiro(terminal);

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = lerInteiro(terminal);

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException ex) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        } catch (InputInvalidoException ex) {
            System.out.println("Entrada inválida: você deve digitar apenas números inteiros.");

        } finally {
            System.out.println("Contador finalizou");
        }

    }

    static int lerInteiro(Scanner scanner) throws InputInvalidoException {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            throw new InputInvalidoException("Valor digitado não é um número inteiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroDois <= parametroUm) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int x = 0; x < contagem; x++){
            System.out.printf("Imprimindo o número %s\n", x+1);
        }
        System.out.println("Contagem terminada");
    }
}