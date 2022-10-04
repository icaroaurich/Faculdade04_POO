import java.util.Scanner;
public class fonte_2{
    public static void lista(conta[] contas){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Qual conta deseja ver?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        conta teste = contas[escolhaUsuario];
        teste.getAll();
        System.out.println("");
    }

    public static void alterar(conta[] contas){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual conta deseja alterar?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        conta alterar = contas[escolhaUsuario];
        alterar.getAll();
        System.out.println("");
        System.out.println("Oque deseja alterar?:");
        System.out.println("1 - Nome");
        System.out.println("2 - RG");
        System.out.println("3 - CPF");
        System.out.println("4 - Saldo");
        System.out.println("5 - Número");
        System.out.println("6 - Agencia");
        escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        if (escolhaUsuario == 1){
            System.out.print("Digite o nome do correntista: ");
            String nomeCorrentista = teclado.nextLine();
            alterar.setNomeCorrentista(nomeCorrentista);}
        else if(escolhaUsuario == 2){
            System.out.print("Digite o RG: ");
            int rg = teclado.nextInt();
            alterar.setRG(rg);
            teclado.nextLine();}
        else if(escolhaUsuario == 3){
            System.out.print("Digite o CPF: ");
            int cpf = teclado.nextInt();
            alterar.setCpf(cpf);}
        else if(escolhaUsuario == 4){
            System.out.print("Digite Saldo: ");
            float saldo = teclado.nextFloat();
            alterar.setSaldo(saldo);}
        else if(escolhaUsuario == 5){
            System.out.print("Digite o número: ");
            int numero= teclado.nextInt();
            teclado.nextLine();
            alterar.setNumero(numero);}
        else if(escolhaUsuario == 6){
            System.out.print("Digite a agencia: ");
            int agencia = teclado.nextInt();
            alterar.setAgencia(agencia);}

        else{System.out.println("Número fora da faixa!!");}
    }

    public static void registrarConta(conta objConta){
        //instanciando obj's
        Scanner teclado = new Scanner (System.in);
        //Começo do código ***

        System.out.print("Digite o nome do correntista: ");
        String nomeCorrentista = teclado.nextLine();
        objConta.setNomeCorrentista(nomeCorrentista);

        System.out.print("Digite o RG: ");
        int rg = teclado.nextInt();
        objConta.setRG(rg);
        teclado.nextLine();

        System.out.print("Digite o CPF: ");
        int CPF = teclado.nextInt();
        objConta.setCpf(CPF);
        teclado.nextLine();

        System.out.print("Digite o saldo: ");
        float saldo = teclado.nextFloat();
        objConta.setSaldo(saldo);
        teclado.nextLine();

        System.out.print("Digite o numero: ");
        int numero = teclado.nextInt();
        objConta.setNumero(numero);
        teclado.nextLine();

        System.out.print("Digite o agencia: ");
        int agencia = teclado.nextInt();
        objConta.setAgencia(agencia);
        teclado.nextLine();
    }

    public static void main(String[] args) {
        Boolean rodando = true;
        conta contas[] = new conta[5];
        int i = 1;

        while (rodando){
            Scanner teclado = new Scanner (System.in);        
            //ArrayList<conta> contas = new ArrayList<>();
            //int escolhaUsuario = 1;

            System.out.println("Bem vindo ao programa\nO que gostaria de fazer?");
            System.out.println("1 - Cadastrar conta;");
            System.out.println("2 - Alterar conta;");
            System.out.println("3 - Ver contas;");        
            System.out.println("4 - sair;");        
            //escolhaUsuario = Integer.parseInt(teclado.nextLine());
            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            if (escolhaUsuario ==1){      
                conta objConta = new conta();      
                registrarConta(objConta);
                contas[i] = objConta;
                i++;
                }
            else if (escolhaUsuario == 2){
                alterar(contas);
                }
            else if (escolhaUsuario == 3){
                lista(contas);
                }
            else if (escolhaUsuario == 4){
                rodando = false;
                }
        }
        }
}