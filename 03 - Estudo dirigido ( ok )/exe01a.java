import java.util.Scanner;

import javax.swing.SpringLayout;
class exe01a{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        // perguntar um número
        // perguntar outro número
        // if 1° número maior que o 2° número, primimir 1, else, imprimir 2

        System.out.print("Digite o primeiro número: ");
        int pNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int sNumero = teclado.nextInt();

        if (pNumero > sNumero){System.out.println(pNumero+" é maior que "+sNumero);}
        else{System.out.println(sNumero+" é maior que "+pNumero);}
     }
}