public class Aluno{
    String nome;
    String endereco;
    int matricula;
    public Aluno(String nome, String endereco, int matricula){
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getEndereco() {
        return endereco;
    }
    public String toString(){
        String s=String.valueOf(this.matricula);
        return s;
    }
}