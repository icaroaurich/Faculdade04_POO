import java.util.Scanner;
public class Programa{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("RG: ");
        int rg = teclado.nextInt();
        teclado.nextLine();

        System.out.print("CPF: ");
        int cpf = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNasci = teclado.nextLine();

        System.out.print("Data de Admicão: ");
        String dataAdmicao = teclado.nextLine();

        System.out.print("Salario: ");
        float salario = teclado.nextFloat();
        teclado.nextLine();
        

        Funcionario funcionario = new Funcionario(nome, rg, cpf, dataNasci, dataAdmicao, salario);
        Professor professor = new Professor();

        System.out.print("Cargo: ");
        String cargo = teclado.nextLine();

        System.out.print("Formação: ");
        String formacao = teclado.nextLine();

        System.out.print("Disciplina: ");
        String disciplina = teclado.nextLine();
        

        funcionario.setCargo(cargo);
        professor.setFormacao(formacao);
        professor.setDisciplina(disciplina);

        teclado.close();
        funcionario.getAll();
        professor.getAll();
    }
}