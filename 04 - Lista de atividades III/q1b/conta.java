public class conta{
    String nomeCorrentista;
    int rg;
    int cpf = 123;
    float saldo;
    int numero;
    int agencia;

    //set
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    public void setRG(int rg){
        this.rg = rg;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    //get
    public void getAll(){
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
        System.out.println("nomeCorrentista:...."+nomeCorrentista);
        System.out.println("rg:................."+rg);
        System.out.println("cpf:................"+cpf);
        System.out.println("saldo:.............."+saldo);
        System.out.println("numero:............."+numero);
        System.out.println("agencia:............"+agencia);
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
    }
    public float getSaldo() {
        return saldo;
    }
}