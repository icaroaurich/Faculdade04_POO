package teste2;

import java.util.Scanner;
public class AppOld {
    public static void main(String[] args) {
        boolean rodando = true;
        Scanner teclado = new Scanner(System.in);

        while (rodando){
            try{
                System.out.println("O que deseja fazer?");
                System.out.println("01 - Incluir Professor");
                System.out.println("02 - Consultar Professor");
                System.out.println("03 - Excluir Professor");
                int escolha = teclado.nextInt();

                if (escolha == 1){
                    Professor professor = new Professor();
                    try{professor.addProfessor(professor);}
                    catch(ProfExistException e){System.out.println(e);}
                }

                if (escolha == 2){
                    //Professor professor = new Professor();
                    //professor.ConsultarProfessor(professor);
                } 
                
                if (escolha == 3){ExcluirProfessor();} 

            }catch(Exception e){System.out.println("ERRO não identificado, favor contatar o programador.");}
            
        }
    }
    public static void IncluirProfessor() throws Exception{
        
    }
    public static void ConsultarProfessor(){
        System.out.print("Digite o CPF do professor que será excluído: ");
    }
    public static void ExcluirProfessor(){

    }
}
