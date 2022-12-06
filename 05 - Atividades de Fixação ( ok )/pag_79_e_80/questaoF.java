import java.util.Scanner;

public class questaoF {
    
    public static void main (String[] args) {
        Scanner media = new Scanner(System.in);
        double prova1, prova2, trabalho1; 
        double notafinal;

        System.out.printf("insira nota da primeira prova: ");
        prova1 = media.nextDouble();

        System.out.printf("insira nota da segunda prova: ");
        prova2 = media.nextDouble();

        System.out.printf(" insira a nota do trabalho: "); 
        trabalho1 = media.nextDouble();

        notafinal = (prova1 + prova2 + trabalho1)/3; 
        System.out.print(notafinal);

        if (notafinal < 7){
        System.out.printf(" Reprovado");
        } else{
            System.out.printf("Aprovado");
        }



    }

}