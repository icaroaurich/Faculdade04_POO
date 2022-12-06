// Faça um algoritmo que solicite ao usuário para digitar 50 números entre 1 e 100.
// Informe o maior número digitado

import java.util.Scanner;
public class q3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite = 5;
        int lista[] = new int [limite];
        int i;

        for (i=0;i<limite;i++){
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            teclado.nextLine();
            lista[i] = numero;
        }
        int maior = lista[0];
        int menor = lista[0];
        
        for (i=0;i<limite;i++){
            if (lista[i] > maior){maior = lista[i];}
            if (lista[i] < menor){menor = lista[i];}
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
    }
}