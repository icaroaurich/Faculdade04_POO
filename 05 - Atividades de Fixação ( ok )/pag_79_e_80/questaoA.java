import java.util.Scanner;
public class questaoA {
    public static void main(String[] args){
       Scanner ler  = new Scanner(System.in);
       float horas, salario; 

       System.out.println("insira horas trabalhadas");
       horas = ler.nextFloat();

       salario = horas*20;

       System.out.println(salario);


    }



    
}
