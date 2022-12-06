package icaro;

import java.util.Scanner;
public class Cliente {
    private String nome;
    private String dtNasci;
    private String sexo;
    private String telefone;
    private String endereco;

    public Cliente(){
        setNome();
        setDtNasci();
        setSexo();
        setTelefone();
        setEndereco();
    }

    public void setNome(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        this.nome = teclado.nextLine();
    }
    public void setDtNasci(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Data de nascimento do cliente: ");
        this.dtNasci = teclado.nextLine();
    }
    public void setSexo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Sexo do cliente: ");
        this.sexo = teclado.nextLine();
    }
    public void setTelefone(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Telefone do cliente: ");
        this.telefone = teclado.nextLine();
    }
    public void setEndereco(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Endereço do cliente: ");
        this.endereco = teclado.nextLine();
    }

    public String getNome() {
        return nome;
    }
    public String getDtNasci() {
        return dtNasci;
    }
    public String getSexo() {
        return sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
}
