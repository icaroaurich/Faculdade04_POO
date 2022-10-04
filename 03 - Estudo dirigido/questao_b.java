/* 
*   Faça um programa que leia 
*   2 provas (peso 3 cada uma) 
*   e um trabalho (peso 1). 
*   Casoamédia final seja maior ou igual a 7 imprimir a mensagem “aprovado”, 
*   caso contrário, imprimir a mensagem reprovado". 
*   Segue o cálculo para a média: calculoMedia = (notaprova1 * 3 + notaprova2 * 3 + notatrabalho *1)/7 
*/
import java.util.Scanner;

public class questao_b{
    public static void main(String[] args){
        Scanner objNumero = new Scanner(System.in);

        System.out.print("Qual a nota da sua primeira prova? :");
        Float prova1 = objNumero.nextFloat(); // receber valor da prova 1

        System.out.print("Qual a nota da sua segunda prova? :");
        Float prova2 = objNumero.nextFloat(); // receber valor da prova 1

        System.out.print("Qual a nota do trabalho? :");
        Float trabalho = objNumero.nextFloat(); // receber valor do trabalho
        objNumero.close();

        float media = (prova1 * 3 + prova2 * 3 + trabalho * 1) / 7; // média
        if (media >= 7){
            System.out.printf("Aprovado! sua nota final foi: %.2f", media);
        } else{
            System.out.printf("Reprovado! sua nota final foi: %.2f", media);
        }

    }
}