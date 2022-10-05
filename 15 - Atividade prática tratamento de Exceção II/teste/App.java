package teste;
import java.util.Scanner;

import javax.swing.SpringLayout;
public class App {
    public static void main(String[] args) {
        for (int i=0;i<Professor.contador;i++){
            Scanner teclado = new Scanner(System.in);

            System.out.print("Qual o nome do professor?: ");
            String nome = teclado.nextLine();
            
            System.out.print("Qual a idade do professor?: ");
            String idade = teclado.nextLine();

            System.out.print("Qual o sexo do professor?: ");
            String sexo = teclado.nextLine();

            System.out.print("Qual o CPF do professor?: ");
            String cpf = teclado.nextLine();

            System.out.print("Qual o rg do professor?: ");
            String rg = teclado.nextLine();

            System.out.print("Qual o endereço do professor?: ");
            String endereco = teclado.nextLine();
            Dependente dependente = new Dependente("Icaro", "18", "Masculino");
            Professor professor = new Professor(nome, idade, sexo, cpf, rg, endereco, dependente);

            try{professor.addProfessor(professor);}
            catch(Exception e){System.out.println("Teste2");}
        }
        
    }

    
}