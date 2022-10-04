package loja_vendedor;
public class Vendedor{
    int idade;
    String nome;

    public void vender(){}
    public void getAll(){
        System.out.println("    Nome: "+nome);
        System.out.println("    Idade: "+idade);
        if (nome.equals("Lorena")){
            String observacao = "       Observações sobre "+nome+":\n       Linda\n       Maravilhosa\n       Perfeita\n       Diva\n       Melhor vendedora";
            System.out.println(observacao);}
        else if (nome.equals("Icaro")){
            String observacao = "       Observações sobre "+nome+":\n       Fez esse programinha\n       Apaixonado por Lorena <3";
            System.out.println(observacao);}

        else{System.out.println("       Observações sobre "+nome+":\n       Sem observações definidas");}
    }
}