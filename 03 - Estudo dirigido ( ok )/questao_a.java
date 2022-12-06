// Faça um algoritmo que solicite ao usuário 2 números e imprima o maior deles.
import java.util.Scanner;
public class questao_a{
    public static void main(String [] agrs){
        Scanner objNumero = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = objNumero.nextInt(); // receber imput

        System.out.print("Digite outro número: ");
        int numero2 = objNumero.nextInt(); // receber imput
        objNumero.close();

        if (numero1 > numero2){ // Se o primeiro número for maior, imprima o primeiro
            System.out.print("O primeiro número ("+numero1+") é maior");
        } else{ // se não, imprima o segundo
            System.out.print("O segundo número ("+numero2 + ") é maior");
        }
    }
}