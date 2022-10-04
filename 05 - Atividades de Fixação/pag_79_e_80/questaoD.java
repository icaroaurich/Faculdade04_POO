import java.util.Scanner;

public class questaoD {
        public static void main(String[] args){
            Scanner ler  = new Scanner(System.in);
            float temperatura; 
     
            System.out.println("insira temperatura  ");
            temperatura = ler.nextFloat();
            
            if (temperatura <= 37){
                System.out.println("não estar febril");
            }else{
                System.out.println("estar febril ");
            }
            
    
    
        }
    }
