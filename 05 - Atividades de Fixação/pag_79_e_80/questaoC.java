import java.util.Scanner;

public class questaoC {
        public static void main(String[] args){
            Scanner ler  = new Scanner(System.in);
            int idade; 
     
            System.out.println("insira idade ");
            idade = ler.nextInt();
            
            if (idade >= 18){
                System.out.println("pode tirar a carteira: de maior");
            }else{
                System.out.println("não pode tirar carteira: ");
            }
            
    
    
        }
    }
    
    
    

