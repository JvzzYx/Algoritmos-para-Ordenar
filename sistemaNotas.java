import java.util.Scanner;

public class sistemaNotas {

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite a nota do primeiro nota aluno ? ");
        int nota1 = sc.nextInt();
        System.out.print("Digite a nota do segunda nota aluno ? ");
        int nota2 = sc.nextInt();
        System.out.print("Digite a nota do terceira nota aluno ? ");
        int nota3 = sc.nextInt();

        int media = (nota1+nota2+nota3)/3; 

        if (media > 7){
            System.out.print ("Aluno aprovado");

        }else{
            System.out.print ("Aluno Reprovado");
        }
        sc.close();
    } 
}