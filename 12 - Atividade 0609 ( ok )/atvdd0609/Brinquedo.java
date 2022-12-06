package atvdd0609;

public abstract class Brinquedo{
    public double velocidade;
    public double acelerecao;

    public void velocidade(int vel){};
    public void velocidade(double vel){};
    public void velocidade(double vel, double acel){};

    public abstract void mover();

}