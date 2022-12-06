package loja_vendedor;
import java.util.ArrayList;
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean rodando = true;
        ArrayList <Loja> lojas = new ArrayList<Loja>();
        while (rodando == true){
            System.out.println("O que gostaria de fazer?");
            System.out.println("1 - Cadastrar loja");
            System.out.println("2 - Cadastrar vendedor");
            System.out.println("3 - Visualizar vendedor");
            System.out.print("Escolha: ");
            int escolha = teclado.nextInt();
            teclado.nextLine();

            if (escolha == 1){
                Loja loja = cadastrarLoja();
                lojas.add(loja);}
            else if (escolha == 2){
                cadastrarVendedor(lojas);}
            else if(escolha == 3){
                Loja loja = (Loja) lojas.get(0);
                loja.getAllVendedor();}
                //rodando = false;}
            else{
                System.out.println("Valor não reconhecido, favor digitar um número válido!!");}
            System.out.println("");
        }teclado.close();
    }

    public static Vendedor cadastrarVendedor(ArrayList lojas){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do vendedor: ");
        String nome = teclado.nextLine();
        System.out.print("Informe a idade do vendedor: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        Vendedor vendedor = new Vendedor();
        vendedor.nome = nome;
        vendedor.idade = idade;
        Loja loja = (Loja) lojas.get(0);
        System.out.println("A qual loja este vendedor pertence?");
        System.out.println("Lojas disponíveis:");
        System.out.println("1 - "+loja.nome);
        System.out.print("Loja: ");
        String nomeLoja = teclado.nextLine();
        loja.admitirVendedor(vendedor);

        //teclado.close();
        return vendedor;
    }

    public static Loja cadastrarLoja(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome da loja: ");
            String nome = teclado.nextLine();
        System.out.print("Informe o ramo: ");
            String ramo = teclado.nextLine();
        System.out.print("Informe o ano de fundação: ");
            int anoFun = teclado.nextInt();
            teclado.nextLine();

        Loja loja = new Loja();
        loja.nome = nome;
        loja.ramo = ramo;
        loja.anoFundacao = anoFun;
        return loja;
    }
}