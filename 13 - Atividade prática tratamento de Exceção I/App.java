import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = CadastrarAluno();
        List AlunosCadastrados = new ArrayList();
        AlunosCadastrados.add(aluno);
        boolean cadastrado = ProcurarMatricula(AlunosCadastrados,aluno);
        System.out.println(cadastrado);

    }
    public static Aluno CadastrarAluno(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();

        System.out.print("Digite o endereço do aluno:");
        String endereco = teclado.nextLine();

        System.out.print("Digite a matricula do aluno:");
        int matricula = teclado.nextInt();

        Aluno aluno = new Aluno(nome,endereco,matricula);
        return aluno;
    }
    public static boolean ProcurarMatricula(List AlunosCadastrados,Aluno aluno){
        boolean cadastrado = false;
        String sProcurar=String.valueOf(aluno.matricula);

        int count = 0;
        while (AlunosCadastrados.size() > count) {
            System.out.println(AlunosCadastrados.get(count));
            System.out.println(sProcurar);
            if (sProcurar.equals(AlunosCadastrados.get(count))){cadastrado = true;}
            count++;
        }

        return cadastrado;
        
    }
}
