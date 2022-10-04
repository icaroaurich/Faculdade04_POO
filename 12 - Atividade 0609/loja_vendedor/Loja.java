package loja_vendedor;
import java.util.ArrayList;
public class Loja{
    String nome;
    String ramo;
    int anoFundacao;
    ArrayList <Vendedor> vendedores = new ArrayList<Vendedor>();

    public void admitirVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    public void demitirVendedor(){}
    public void getAll() {
        System.out.println("Nome: "+nome);
        System.out.println("Ramo: "+ramo);
        System.out.println("Ano de Fundação: "+anoFundacao);}

    public void getAllVendedor(){
        vendedores.get(0).getAll();
        vendedores.get(1).getAll();
    }
}