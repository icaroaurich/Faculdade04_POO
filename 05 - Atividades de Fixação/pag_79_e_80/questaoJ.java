import java.util.Scanner;     
public class questaoJ{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);    
    float a, b,c,d, resul, liquido;     
    

    System.out.printf("insira um numero "); 
    a = ler.nextFloat();   

    System.out.printf("insira um novo numero "); 
    b = ler.nextFloat();   

    resul = a+b;
    if (resul > 10){
        System.out.println(resul);

    }else{
        System.out.println("valor insuficiente");
    }
   
    
    
    }

}