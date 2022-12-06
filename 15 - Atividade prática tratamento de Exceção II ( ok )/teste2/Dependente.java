package teste2;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Dependente{
    String nome;
    int idade;
    String sexo;

    public Dependente(){
        try{
            PerguntarNome();
            PerguntarSexo();
            PerguntarIdade();

        }catch(InputMismatchException e){System.out.println(e);}
    }

    public void PerguntarNome(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do dependente: ");
        String nome = teclado.nextLine();
        this.nome = nome;
        teclado.close();
    }
    public void PerguntarSexo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o sexo do dependente: ");
        String sexo = teclado.nextLine();
        this.sexo = sexo;
        teclado.close();
    }
    public void PerguntarIdade() throws InputMismatchException{
        Scanner teclado = new Scanner(System.in) ;
        System.out.print("Idade de "+nome+": ");
        int idade = teclado.nextInt();
        this.idade = idade;
        teclado.close();
    }
}