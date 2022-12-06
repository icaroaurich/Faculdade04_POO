import java.util.Scanner;     
public class questaoH{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);    
    double a, b;        

    System.out.printf("informe o raio "); 
    a = ler.nextFloat();   
    
    b = Math.PI*Math.pow(a,2);
    System.out.printf("%.2f",b);
     
    }

}