package teste;
public class Professor{
    String nome;
    String idade;
    String sexo;
    String cpf;
    String rg;
    String endereco;
    Dependente dependente;

    static int contador = 0;
    static Professor vetor[] = new Professor[20];
    
    public Professor(String nome, String idade, String sexo, String cpf, String rg, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }
    public Professor(String nome, String idade, String sexo, String cpf, String rg, String endereco,Dependente dependente){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dependente = dependente;
    }
    public static void addProfessor(Professor professor){
        vetor[contador] = professor;
        contador++;
        System.out.println("Professor "+professor.nome+" adicionado com sucesso!");
    }
    public void getAll(){
        System.out.println("Nome    : "+this.nome);
        System.out.println("Idade   : "+this.idade);
        System.out.println("Sexo    : "+this.sexo);
        System.out.println("CPF     : "+this.cpf);
        System.out.println("RG      : "+this.rg);
        System.out.println("Endereço: "+this.endereco);
        if (this.dependente != null){
            System.out.println("Dependente Nome : "+this.dependente.nome);
            System.out.println("Dependente Idade: "+this.dependente.idade);
            System.out.println("Dependente Sexo : "+this.dependente.sexo);
        }
    }

}