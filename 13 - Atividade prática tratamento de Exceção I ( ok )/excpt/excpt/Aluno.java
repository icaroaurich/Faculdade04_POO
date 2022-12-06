package excpt;

public class Aluno{
    private String nome;
    private String endereco;
    private int matricula;

    public Aluno(String nome, String endereco, int matricula){
        this.nome = nome;
        //this.endereco = endereco;
        this.matricula = matricula;
    }
    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
}