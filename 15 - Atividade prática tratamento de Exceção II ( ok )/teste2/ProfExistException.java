package teste2;

public class ProfExistException extends Exception{
    public ProfExistException(){
        super("ERRO: Professor já existe na base de dados!\n");
    }
}