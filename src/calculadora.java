package src;
import java.util.Scanner;

public class calculadora {
    //Classe principal da calculadora
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.next();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        // Estrutura de controle switch para realizar a operação com base no operador fornecido
        switch (operador) {
            case "+":
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }
        sc.close();
    }
}
