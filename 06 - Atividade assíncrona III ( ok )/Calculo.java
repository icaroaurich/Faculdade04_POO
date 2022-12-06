public class Calculo{

    private float totalSalario;
    //set

    //get
    public float getTotalSalario() {
        return totalSalario;
    }

    public void CalcularSalario(float salarioBase,int horasTrabalhadas){    
        totalSalario = salarioBase*horasTrabalhadas;

    }
}

