import java.util.Scanner;     
public class questaoI{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);    
    float a, b,c,d, bruto, liquido;     
    

    System.out.printf("valor da hora aula "); 
    a = ler.nextFloat();   

    System.out.printf("horas trabalhadas por mes "); 
    b = ler.nextFloat();   
    
    System.out.printf("desconto INSS "); 
    c = ler.nextFloat();   
    bruto = (a*b);
    liquido = bruto - ((a*b)*c/100);

    System.out.println("salario liquido é de " + liquido  ); 

    

   
    
    
    }

}