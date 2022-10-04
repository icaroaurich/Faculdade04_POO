import java.util.Scanner;     // classe scanner usada para receber um input

public class questaoE{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);    //cria um objeto scanner 
    int a, b;        // cria uma variavel a e b para armazenar o dado 

    System.out.printf("informe o primeiro valor "); 
    a = ler.nextInt();     //nextint indica um valor inteiro a ser adquirido

    System.out.printf("informe outro valor "); 
    b = ler.nextInt(); 

    if (a > b) {                                  
        System.out.print(a);
    } else {
        System.out.print( b);
    }
    }
}
