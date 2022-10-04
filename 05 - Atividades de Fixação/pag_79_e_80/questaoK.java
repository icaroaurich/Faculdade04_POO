import java.util.Scanner;     
public class questaoK{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);    
    float a, b,c,d, resul, liquido;     
    

    System.out.printf("insira um numero "); 
    a = ler.nextFloat();   

    System.out.printf("insira um novo numero "); 
    b = ler.nextFloat();   

    resul = a+b;
    if (resul >= 10){
        System.out.println(resul+"+5 = " + (resul+5));

    }else{
        System.out.println(resul+ "-7 = " + (resul-7));
    }
   
    
    
    }

}