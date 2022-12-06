package teste2;

public class ProfNotExistException extends Exception{
    public ProfNotExistException(){
        super("ERRO: Professor não existe na base de dados!\n");
    }
}