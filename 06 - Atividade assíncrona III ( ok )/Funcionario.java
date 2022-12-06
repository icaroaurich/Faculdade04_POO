public class Funcionario{

    String cpf;
    String rg;
    String nome;
    static int geraMatricula = 0;
    private int matricula;
    private float salario;
    String dataContratacao;
    float salarioBase;
    
    public Funcionario(String nome,float salarioBase,float horasTrabalhadas,String dataContratacao,int matricula){
        
    //atributos
    this.nome = nome;    
    this.salarioBase = salarioBase;
    this.matricula = ++geraMatricula;
    horasTrabalhadas = horasTrabalhadas;   

    }

    public void calculaSalario(float salarioBase,float horasTrabalhadas){
        Calculo salarioFinal = new Calculo();
		salarioFinal.CalcularSalario(1200,30);
    };

    //set
    public void setSalario(float salario) {
        this.salario = salario;
    }
    //get
    public float getSalario(){
        return salario;
    }
    public void imprimeDados(){

    }
}   