import java.util.Scanner;
import java.util.Random;

public class jogoAdvinha {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Random numeroAleatorio = new Random();

        int sorteado = numeroAleatorio.nextInt(10);
    
        System.out.print("Adivinhe o numero ?");
        int numero = sc.nextInt();

        if (sorteado != numero){
            System.out.print("Numero errado");
        }else {
            System.out.print("Numero correto");
        }
        sc.close();
    }
}
