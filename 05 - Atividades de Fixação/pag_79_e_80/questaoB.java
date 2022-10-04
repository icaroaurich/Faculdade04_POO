import java.lang.Thread.State;
import java.util.Scanner;

public class atividadeB {
    public static void main(String[] args){
        Scanner ler  = new Scanner(System.in);
        float distancia, gasolina, preco; 
 
        System.out.println("insira distancia ");
        distancia = ler.nextFloat();
        
        System.out.println("insira preço da  gasolina litro");
        gasolina = ler.nextFloat();

        System.out.println("quantidade de gasolina precisa é " + (distancia/12)*gasolina); 


    }
        
    
}
