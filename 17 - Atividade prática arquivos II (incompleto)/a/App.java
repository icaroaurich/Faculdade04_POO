package a

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App{

    static String diretorio = "C:\\icaro_local\\faculdade\\semestre_4\\POO - Cleber\\atividades\\17 - Atividade prática Arquivos II\\icaro\\";
    static String nomeArquivo = "clientes.txt";


    public static void main(String[] args) {
        File f = new File(diretorio+nomeArquivo);
        LerArquivo(f);
    }

    public static void LerArquivo(File f){
        try {
            Scanner leitor = new Scanner(f);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();

                String str = linha;
                int inicio = 0;
                int fim;
                Cliente cliente = new Cliente();

                for (int i=1 ; i < 5; i++){
                    fim = str.indexOf( ",");
                    String s = str.substring(inicio, fim);
                    //System.out.println(s);
                    cliente.Preencher(i,s);

                    for (int a=0 ; a < fim+1 ; a++){str = str.substring(1);}
                }
                cliente.listaClientes.add(cliente);
                System.out.println(cliente.listaClientes);
            }
            leitor.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }

    }
}