package icaro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App{

    static String diretorio = "C:\\icaro_local\\faculdade\\semestre_4\\POO - Cleber\\atividades\\16 - Atividade prática Arquivos I\\icaro\\";
    static String nomeArquivo = "log";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println("01 - Definir diretorio");
            System.out.println("02 - Ler arquivo");
            System.out.println("03 - Escrever no arquivo");
            System.out.println("04 - Deletar arquivo");
            System.out.println("05 - Cadastrar cliente");
            String escolha = teclado.nextLine();
            
            if (escolha.equals("1")){
                System.out.print("Diretório: ");
                diretorio = teclado.nextLine();

                System.out.print("Nome do arquivo: ");
                nomeArquivo = teclado.nextLine();

                CriarArquivo(diretorio+nomeArquivo);
            }

            if (escolha.equals("2")){
                File f = new File(diretorio+nomeArquivo+".txt");
                LerArquivo(f);
            }

            if (escolha.equals("3")){
                File f = new File(diretorio+nomeArquivo+".txt");
                System.out.println("O que deseja escrever no arquivo?: ");
                String msg = teclado.nextLine();
                EscreverArquivo(f,msg);
            } 

            if (escolha.equals("4")){
                File f = new File(diretorio+nomeArquivo+".txt");
                ExcluirArquivo(f);
            }   

            if (escolha.equals("5")){
                File f = new File(diretorio+nomeArquivo+".txt");
                Cliente cliente = new Cliente();

                String nome = cliente.getNome();
                String dtNasci = cliente.getDtNasci();
                String sexo = cliente.getSexo();
                String telefone = cliente.getTelefone();
                String endereco = cliente.getEndereco();

                EscreverArquivo(f,nome);
                EscreverArquivo(f,dtNasci);
                EscreverArquivo(f,sexo);
                EscreverArquivo(f,telefone);
                EscreverArquivo(f,endereco);
            }

            
        }
    }

    public static void CriarArquivo(String nomeArquivo){
        try {
            File arq = new File(nomeArquivo+".txt");

            if (arq.createNewFile()) {
                System.out.println("Arquivo criado: " + arq.getName());
            }
            else {
                System.out.println("Arquivo já existe!");
            }
        } catch (IOException e) {
          System.out.println("Ocorreu algum erro.");
        }
    }

    public static void EscreverArquivo(File f, String msg){
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter escriba = new BufferedWriter(fw);

            escriba.write(msg);
            escriba.newLine();
            escriba.close();
            fw.close();

            System.out.println("Arquivo escrito com sucesso!");
            
          } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
          }
    }

    public static void LerArquivo(File f){
        try {
            Scanner leitor = new Scanner(f);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } 

        catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }

    public static void ExcluirArquivo(File f){
            f.delete();
            System.out.println("O arquivo "+f+" foi deletado!");
    }















}
