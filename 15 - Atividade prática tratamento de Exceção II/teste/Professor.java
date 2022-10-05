package teste;
import java.util.Scanner;

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
    public void addProfessor(Professor professor) throws ProfessorCadastradoException{
        if (this.contador >= 1){throw new ProfessorCadastradoException("Número máximo de professores atingido!");}
        if (existeProfessor(professor)){throw new ProfessorCadastradoException("Professor já cadastrado!");}
        else{
            vetor[contador] = professor;
            contador++;
            System.out.println("Professor "+professor.nome+" adicionado com sucesso!");
        }
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
    public void pesquisarTodos(){
        for (int i=0;i<Professor.contador;i++){
            Professor professor = Professor.vetor[i];
            professor.getAll();
        }
    }
    public void pesquisar(String nome){
        for (int i=0;i<Professor.contador;i++){
            Professor professor = Professor.vetor[i];
            if (professor.nome.equals(nome)){professor.getAll();break;}
            else if (i==professor.contador){System.out.println("Professor não cadastrado!");break;}
        }
    }
    public boolean existeProfessor(Professor professorOriginal){
        boolean existe = false;
        for (int i=0;i<Professor.contador;i++){
            Professor professor = Professor.vetor[i];
            if (professor.nome.equals(professorOriginal.nome)){existe = true;return existe;}
        }

        return existe;
    }

}