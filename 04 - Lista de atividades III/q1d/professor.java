/*
 * nome, 
 * titulação, 
 * formação, 
 * carga horária, 
 * salário e 
 * uma descrição das disciplinas que professor pode ensinar
 */

public class professor{
    String nome;
    String titulacao;
    String formacao;
    String cargaHoraria;
    float salario;
    String disciplinas;

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    //get
    public void getAll(){
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
        System.out.println("nome:..........."+nome);
        System.out.println("titulacao:......"+titulacao);
        System.out.println("formacao:......."+formacao);
        System.out.println("cargaHoraria:..."+cargaHoraria);
        System.out.println("salario:........"+salario);
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
    }
}