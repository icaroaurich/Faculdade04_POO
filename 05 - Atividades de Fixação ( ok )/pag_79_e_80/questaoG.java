
import java.util.Scanner;     // classe scanner usada para receber um input
public class questaoG{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);    //cria um objeto scanner 
    double a, b,c;        // cria uma variavel a e b para armazenar o dado 

    System.out.printf("informe peso "); 
    a = ler.nextFloat();     //nextFloat indica um valor inteiro a ser adquirido

    System.out.printf("informe altura "); 
    b = ler.nextFloat(); 
     
    c = a/Math.pow(b,2);
    if (c >= 30) {                                  
        System.out.print("obeso");
    } else {
        System.out.print( "normal");
    }
    }
}
