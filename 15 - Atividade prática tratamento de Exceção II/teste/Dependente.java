package teste;
import java.util.Scanner;

public class Dependente{
    String nome;
    String idade;
    String sexo;
    public Dependente(String nome, String idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public static Dependente incluirDependente(String nome){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o nome do dependente do professor "+nome+"?: ");
        String depNome = teclado.nextLine();
        System.out.print("Qual a idade do dependente do professor "+nome+"?: ");
        String depIdade = teclado.nextLine();
        System.out.print("Qual o sexo do dependente do professor "+nome+"?: ");
        String depSexo = teclado.nextLine();

        Dependente dependende = new Dependente(depNome, depIdade, depSexo);
        return dependende;
    }
}