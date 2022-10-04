public class ProgramaCalculadora{
    float pNumero;
    float sNumero;

    //set
    public void setpNumero(float pNumero) {
        this.pNumero = pNumero;
    }
    public void setsNumero(float sNumero) {
        this.sNumero = sNumero;
    }

    //get
    public float getSoma(float pNumero, float sNumero){
        return (pNumero + sNumero);
    }
    public float getSubstrair(float pNumero, float sNumero){
        return (pNumero - sNumero);
    }
    public float getMultiplicar(float pNumero, float sNumero){
        return (pNumero * sNumero);
    }
    public float getDividir(float pNumero, float sNumero){
        return (pNumero / sNumero);
    }
}