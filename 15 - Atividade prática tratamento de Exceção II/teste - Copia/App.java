package teste;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i=0;i<3;i++){

            System.out.println("O que deseja fazer?");
            System.out.println("1 - Inclusão");
            System.out.println("2 - Exclusão");
            System.out.println("3 - Pesquisa");
            String escolha = teclado.nextLine();

            if (escolha.equals("1")){
                Professor professor = incluirProfessor();
                boolean existe = existeProfessor(professor.nome);
                if (existe == true){System.out.println("Já existe");}
                else{Professor.addProfessor(professor);}
                }
                
            else if (escolha == "2"){System.out.println("Ainda não implementado");}
            else if (escolha.equals("3")){pesquisarTodos();}
            else{
                System.out.println("Valor inválido!");
                i--;}

        }
    }
    public static Professor incluirProfessor(){
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

        System.out.print("O professor tem dependente? (S/N): ");
        String dependenteExiste = teclado.nextLine();

        if (dependenteExiste.equals("s")) {
            Dependente dependente = incluirDependente(nome);
            Professor professor = new Professor(nome, idade, sexo, cpf, rg, endereco, dependente);
            return professor;
        }else{
            Professor professor = new Professor(nome, idade, sexo, cpf, rg, endereco);
            return professor;
        }

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
    public void excluirProfessor(){}

    public static void pesquisarTodos(){
        for (int i=0;i<Professor.contador;i++){
            Professor professor = Professor.vetor[i];
            professor.getAll();
        }
    }
    public static void pesquisar(String nome){
        for (int i=0;i<Professor.contador;i++){
            Professor professor = Professor.vetor[i];
            if (professor.nome.equals(nome)){professor.getAll();break;}
            else if (i==professor.contador){System.out.println("Professor não cadastrado!");break;}
        }
    }
    public static boolean existeProfessor(String nome){
        boolean existe = false;
        for (int i=0;i<Professor.contador;i++){
            Professor professor = Professor.vetor[i];
            if (professor.nome.equals(nome)){existe = true;return existe;}
        }

        return existe;
    }
}
