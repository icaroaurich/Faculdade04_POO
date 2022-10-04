//Faça um algoritmo que solicite ao usuário para digitar um número. 
// Informe quais os divisores deste número.

import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();

            boolean primo = CalcularPrimo(numero);
            boolean dois = CalcularDividirDois(numero);
            boolean tres = CalcularDividirTres(numero);
            boolean cinco = CalcularDividirCinco(numero);
            boolean sete = CalcularDividirSete(numero);

            if (primo == true){System.out.println("O número é primo!!");}
            else{System.out.println("Não é primo!!");}
            if(dois == true){System.out.println("O número é divisível por 2.");}
            else{System.out.println("O número não é divisível por 2.");}
            if(tres == true){System.out.println("O número é divisível por 3.");}
            else{System.out.println("O número não é divisível por 3.");}
            if(cinco == true){System.out.println("O número é divisível por 5.");}
            else{System.out.println("O número não é divisível por 5.");}
            if(sete == true){System.out.println("O número é divisível por 7.");}
            else{System.out.println("O número não é divisível por 7.");}}
    }

    public static boolean CalcularPrimo(int numero){
        boolean primo = true;
        if (numero == 2 | numero == 3){return primo;}
        else{
            if (numero % 2 == 0){primo = false;}
            else if(numero % 3 == 0){primo = false;}
            else if(numero % 5 == 0){primo = false;}
            return primo;}
    }

    public static boolean CalcularDividirDois(int numero){
        boolean dois = false;
        if (numero % 2 == 0){dois = true;}
        return dois;
    }

    public static boolean CalcularDividirTres(int numero){
        boolean dois = false;
        if (numero % 3 == 0){dois = true;}
        return dois;
    }

    public static boolean CalcularDividirCinco(int numero){
        boolean dois = false;
        if (numero % 5 == 0){dois = true;}
        return dois;
    }

    public static boolean CalcularDividirSete(int numero){
        boolean dois = false;
        if (numero % 7 == 0){dois = true;}
        return dois;
    }
}
