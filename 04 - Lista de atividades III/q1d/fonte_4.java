import java.util.Scanner;
public class fonte_4{
    public static void lista(professor[] professores){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Qual professor deseja ver?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        professor teste = professores[escolhaUsuario];
        teste.getAll();
        System.out.println("");
    }

    public static void alterar(professor[] professores){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual professor deseja alterar?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        professor alterar = professores[escolhaUsuario];
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
            System.out.print("Qual o nome do professor?:");
            String nome = teclado.nextLine();
            alterar.setNome(nome);}
        else if(escolhaUsuario == 2){
            System.out.print("Qual o título do professor?:");
            String titulo = teclado.nextLine();
            alterar.setTitulacao(titulo);}
        else if(escolhaUsuario == 3){
            System.out.print("Qual a formação do professor?:");
            String formacao = teclado.nextLine();
            alterar.setFormacao(formacao);}
        else if(escolhaUsuario == 4){
            System.out.print("Qual a carga horária do professor?:");
            String carga = teclado.nextLine();
            alterar.setCargaHoraria(carga);}
        else if(escolhaUsuario == 5){
            System.out.print("Qual o salário do professor?:");
            float salario = teclado.nextFloat();
            alterar.setSalario(salario);}
        else if(escolhaUsuario == 6){
            System.out.print("Qual as disciplinas do professor?:");
            String disciplinas = teclado.nextLine();
            alterar.setDisciplinas(disciplinas);}

        else{System.out.println("Número fora da faixa!!");}
    }

    public static void registrarProfessor(professor objProfessor){
        //instanciando obj's
        Scanner teclado = new Scanner (System.in);
        //Começo do código ***

        System.out.print("Qual o nome do professor?:");
        String nome = teclado.nextLine();
        objProfessor.setNome(nome);

        System.out.print("Qual o título do professor?:");
        String titulo = teclado.nextLine();
        objProfessor.setTitulacao(titulo);

        System.out.print("Qual a formação do professor?:");
        String formacao = teclado.nextLine();
        objProfessor.setFormacao(formacao);

        System.out.print("Qual a carga horária do professor?:");
        String carga = teclado.nextLine();
        objProfessor.setCargaHoraria(carga);

        System.out.print("Qual o salario do professor?:");
        float salario = teclado.nextFloat();
        objProfessor.setSalario(salario);
        teclado.nextLine();

        System.out.print("Qual as disciplinas do professor?:");
        String disciplinas = teclado.nextLine();
        objProfessor.setDisciplinas(disciplinas);
    }   

    public static void main(String[] args) {
        Boolean rodando = true;
        professor professores[] = new professor[5];
        int i = 1;

        while (rodando){
            Scanner teclado = new Scanner (System.in);        
            //ArrayList<professor> professores = new ArrayList<>();
            //int escolhaUsuario = 1;

            System.out.println("Bem vindo ao programa\nO que gostaria de fazer?");
            System.out.println("1 - Cadastrar professor;");
            System.out.println("2 - Alterar professor;");
            System.out.println("3 - Ver professores;");        
            System.out.println("4 - sair;");        
            //escolhaUsuario = Integer.parseInt(teclado.nextLine());
            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            if (escolhaUsuario ==1){      
                professor objProfessor = new professor();      
                registrarProfessor(objProfessor);
                professores[i] = objProfessor;
                i++;
                }
            else if (escolhaUsuario == 2){
                alterar(professores);
                }
            else if (escolhaUsuario == 3){
                lista(professores);
                }
            else if (escolhaUsuario == 4){
                rodando = false;
                }
        }
        }
}