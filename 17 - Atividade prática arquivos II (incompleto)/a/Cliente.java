package a

import java.util.ArrayList;

public class Cliente {
    private String id;
    String nome;
    private String cidade;
    private String endereco;
    private String email;

    //static Cliente listaClientes[] = new Cliente[10];
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    public Cliente(){

    }

    public void Preencher(int numero, String data){
        if (numero == 1){this.id = data;}
        if (numero == 2){this.cidade = data;}
        if (numero == 3){this.nome = data;}
        if (numero == 4){this.endereco = data;}
        if (numero == 5){this.email = data;}
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //System.out.println(id);
        //System.out.println(nome);
        //System.out.println(endereco);
        //System.out.println(email);
        //return super.toString();
        return nome;
    }
}
