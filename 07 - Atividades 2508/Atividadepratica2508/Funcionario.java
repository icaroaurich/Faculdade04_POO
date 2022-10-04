public class Funcionario{
    private String nome;
    private int rg;
    private int cpf;
    private String dataNasci;
    private String dataAdmicao;
    private float salario;
    private int matricula;
    private String cargo;
    
    static private int geraMatricula = 0;
    protected Endereco endereco = new Endereco();

    public Funcionario(String nome, int rg, int cpf, String dataNasci, String dataAdmicao, float salario){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasci = dataNasci;
        this.dataAdmicao = dataAdmicao;
        this.salario = salario;
        this.matricula = ++geraMatricula;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
       return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void getAll() {
        System.out.println(".........");
        System.out.println("NOME........"+this.nome);
        System.out.println("RG.........."+this.rg);
        System.out.println("CPF........."+this.cpf);
        System.out.println("dtNasci....."+this.dataNasci);
        System.out.println("dtAdmic....."+this.dataAdmicao);
        System.out.println("SALARIO....."+this.salario);
        System.out.println("MATRIC......"+this.matricula);
        System.out.println("CARGO......."+this.cargo);

        System.out.println("CIDADE.........."+endereco.cidade);
        System.out.println("BAIRRO.........."+endereco.bairro);
        System.out.println("RUA............."+endereco.rua);
        System.out.println("NUMERO.........."+endereco.numero);

    }
    
}

