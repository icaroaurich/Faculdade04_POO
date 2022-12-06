import java.util.Scanner;
public class fonte_5{
    public static void lista(funcionario[] funcionarios){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Qual funcionario deseja ver?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        funcionario teste = funcionarios[escolhaUsuario];
        teste.getAll();
        System.out.println("");
    }

    public static void alterar(funcionario[] funcionarios){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual funcionario deseja alterar?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        funcionario alterar = funcionarios[escolhaUsuario];
        alterar.getAll();
        System.out.println("");
        System.out.println("Oque deseja alterar?:");
        System.out.println("1 - Especie");
        System.out.println("2 - Data nascimento");
        System.out.println("3 - nome");
        System.out.println("4 - número de registro");
        System.out.println("5 - local de nascimento");
        escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        if (escolhaUsuario == 1){
            System.out.print("Qual o nome do funcionario?:");
            String nome = teclado.nextLine();
            alterar.setNome(nome);}
        else if(escolhaUsuario == 2){
            System.out.print("Qual o título do funcionario?:");
            String titulo = teclado.nextLine();
            alterar.setTitulacao(titulo);}
        else if(escolhaUsuario == 3){
            System.out.print("Qual a formação do funcionario?:");
            String formacao = teclado.nextLine();
            alterar.setFormacao(formacao);}
        else if(escolhaUsuario == 4){
            System.out.print("Qual a carga horária do funcionario?:");
            String carga = teclado.nextLine();
            alterar.setCargaHoraria(carga);}
        else if(escolhaUsuario == 5){
            System.out.print("Qual o salário do funcionario?:");
            float salario = teclado.nextFloat();
            alterar.setSalario(salario);}
        else if(escolhaUsuario == 6){
            System.out.print("Qual as disciplinas do funcionario?:");
            String disciplinas = teclado.nextLine();
            alterar.setDisciplinas(disciplinas);}

        else{System.out.println("Número fora da faixa!!");}
    }

    public static void registrarFuncionario(funcionario objFuncionario){
        //instanciando obj's
        Scanner teclado = new Scanner (System.in);
        //Começo do código ***

        System.out.print("Qual o nome do funcionario?:");
        String nome = teclado.nextLine();
        objFuncionario.setNome(nome);

        System.out.print("Qual o nome do funcionario?:");
        String nome = teclado.nextLine();
        objFuncionario.setNome(nome);
    }   

    public static void main(String[] args) {
        Boolean rodando = true;
        funcionario funcionarios[] = new funcionario[5];
        int i = 1;

        while (rodando){
            Scanner teclado = new Scanner (System.in);        
            //ArrayList<funcionario> funcionarios = new ArrayList<>();
            //int escolhaUsuario = 1;

            System.out.println("Bem vindo ao programa\nO que gostaria de fazer?");
            System.out.println("1 - Cadastrar funcionario;");
            System.out.println("2 - Alterar funcionario;");
            System.out.println("3 - Ver funcionarios;");        
            System.out.println("4 - sair;");        
            //escolhaUsuario = Integer.parseInt(teclado.nextLine());
            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            if (escolhaUsuario ==1){      
                funcionario objFuncionario = new funcionario();      
                registrarFuncionario(objFuncionario);
                funcionarios[i] = objFuncionario;
                i++;
                }
            else if (escolhaUsuario == 2){
                alterar(funcionarios);
                }
            else if (escolhaUsuario == 3){
                lista(funcionarios);
                }
            else if (escolhaUsuario == 4){
                rodando = false;
                }
        }
        }
}