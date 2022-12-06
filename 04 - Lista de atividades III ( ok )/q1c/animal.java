public class animal{
    String especie;
    String dataNasci;
    String nome;
    int nRegistro;
    String localNasci;

    //set
    public void setEspecie(String especia) {
        this.especie = especia;
    }
    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }public void setLocalNasci(String localNasci) {
        this.localNasci = localNasci;
    }

    //get
    public void getAll(){
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
        System.out.println("especie:.........."+especie);
        System.out.println("dataNasci:........"+dataNasci);
        System.out.println("nome:............."+nome);
        System.out.println("nRegistro:........"+nRegistro);
        System.out.println("localNasci:......."+localNasci);
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
    }
}