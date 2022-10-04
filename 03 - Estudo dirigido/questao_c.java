// Faça um programa que leia 2 valores e informe se os mesmos são divisores
// Saber se um número divide o outro

import java.util.Scanner;
public class questao_c{
    public static void main(String [] agrs){
        Scanner objNumero = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = objNumero.nextInt(); 

        System.out.print("Digite outro número inteiro: ");
        int numero2 = objNumero.nextInt();
        objNumero.close();

        if (numero1 % numero2 == 0){ // se dividir o primeiro pelo segundo não houver restos, a divisão é possível.
            System.out.println(numero1+" é divisível por "+numero2);
        } else{
            System.out.println(numero1+" não é divisível por "+numero2);
        }
        if (numero2 % numero1 == 0){ // se dividir o segundo pelo primeiro e não houver restos, a divisão é possível.
            System.out.println(numero2+" é divisível por "+numero1);
        } else{
            System.out.println(numero2+" não é divisível por "+numero1);
        }

        }
    }