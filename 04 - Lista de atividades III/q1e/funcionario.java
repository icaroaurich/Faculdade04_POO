/*
 * nome, 
 * data de nascimento, 
 * RG, 
 * CPF, 
 * endereço, 
 * naturalidade (Local de nascimento), 
 * salário, 
 * profissão, 
 * grau de instrução e 
 * matrícula
 */
public class funcionario{
    String nome;
    String dtNasci;
    String rg;
    String cpf;
    String endereço;
    String naturalidade;
    float salario;
    String profissao;
    String grau;
    int matricula;
    

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDtNasci(String dtNasci) {
        this.dtNasci = dtNasci;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public void setGrau(String grau) {
        this.grau = grau;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //get
    public void getAll(){
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
        System.out.println("nome:............"+nome);
        System.out.println("dtNasci:........."+dtNasci);
        System.out.println("rg:.............."+rg);
        System.out.println("cpf:............."+cpf);
        System.out.println("endereço:........"+endereço);
        System.out.println("naturalidade:...."+naturalidade);
        System.out.println("salario:........."+salario);
        System.out.println("profissao:......."+profissao);
        System.out.println("grau:............"+grau);
        System.out.println("matricula:......."+matricula);
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
    }
}