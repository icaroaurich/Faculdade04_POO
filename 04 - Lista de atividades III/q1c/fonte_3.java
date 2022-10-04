import java.util.Scanner;
public class fonte_3{
    public static void lista(animal[] animais){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Qual animal deseja ver?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        animal teste = animais[escolhaUsuario];
        teste.getAll();
        System.out.println("");
    }

    public static void alterar(animal[] animais){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual animal deseja alterar?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        animal alterar = animais[escolhaUsuario];
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
            System.out.print("Qual especie?:");
            String especie = teclado.nextLine();
            alterar.setEspecie(especie);}
        else if(escolhaUsuario == 2){
            System.out.print("Qual a data de nascimento?:");
            String dataNasci = teclado.nextLine();
            alterar.setDataNasci(dataNasci);}
        else if(escolhaUsuario == 3){
            System.out.print("Qual o nome?:");
            String nome = teclado.nextLine();
            alterar.setNome(nome);}
        else if(escolhaUsuario == 4){
            System.out.print("Qual o número de registro?:");
            int nRegistro = teclado.nextInt();
            alterar.setnRegistro(nRegistro);}
        else if(escolhaUsuario == 5){
            System.out.print("Qual o local de nascimento?:");
            String localNasci = teclado.nextLine();
            alterar.setLocalNasci(localNasci);}

        else{System.out.println("Número fora da faixa!!");}
    }

    public static void registrarAnimal(animal objAnimal){
        //instanciando obj's
        Scanner teclado = new Scanner (System.in);
        //Começo do código ***

        System.out.print("Qual especie?:");
        String especie = teclado.nextLine();
        objAnimal.setEspecie(especie);

        System.out.print("Qual a data de nascimento?:");
        String dataNasci = teclado.nextLine();
        objAnimal.setDataNasci(dataNasci);

        System.out.print("Qual o nome?:");
        String nome = teclado.nextLine();
        objAnimal.setNome(nome);

        System.out.print("Qual o Número de registro?:");
        int nRegistro = teclado.nextInt();
        objAnimal.setnRegistro(nRegistro);
        teclado.nextLine();

        System.out.print("Qual o local de nascimento?:");
        String localNasci = teclado.nextLine();
        objAnimal.setLocalNasci(localNasci);
    }   

    public static void main(String[] args) {
        Boolean rodando = true;
        animal animais[] = new animal[5];
        int i = 1;

        while (rodando){
            Scanner teclado = new Scanner (System.in);        
            //ArrayList<animal> animais = new ArrayList<>();
            //int escolhaUsuario = 1;

            System.out.println("Bem vindo ao programa\nO que gostaria de fazer?");
            System.out.println("1 - Cadastrar animal;");
            System.out.println("2 - Alterar animal;");
            System.out.println("3 - Ver animais;");        
            System.out.println("4 - sair;");        
            //escolhaUsuario = Integer.parseInt(teclado.nextLine());
            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            if (escolhaUsuario ==1){      
                animal objAnimal = new animal();      
                registrarAnimal(objAnimal);
                animais[i] = objAnimal;
                i++;
                }
            else if (escolhaUsuario == 2){
                alterar(animais);
                }
            else if (escolhaUsuario == 3){
                lista(animais);
                }
            else if (escolhaUsuario == 4){
                rodando = false;
                }
        }
        }
}