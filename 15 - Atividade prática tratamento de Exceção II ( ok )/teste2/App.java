package teste2;

//import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        boolean rodando = true;
        Scanner teclado = new Scanner(System.in);

        while (rodando){
            try{
                System.out.println("O que deseja fazer?");
                System.out.println("01 - Incluir Professor");
                System.out.println("02 - Consultar Professor");
                System.out.println("03 - Excluir Professor");
                System.out.print("Número: ");
                String escolha = teclado.nextLine();

                if (escolha.equals("1")){
                    Professor professor = new Professor(1);
                    try{professor.addProfessor(professor);}
                    catch(ProfExistException e){System.out.println(e);}
                }

                if (escolha.equals("2")){
                      Professor professor = new Professor(2);
                } 

                if (escolha.equals("3")){
                        Professor professor = new Professor(3);
                } 

            //}catch(Exception e){System.out.println("ERRO não identificado, favor contatar o programador.\n");}  
            }catch(Exception e){System.out.println(e);}  
        }
    }
}
