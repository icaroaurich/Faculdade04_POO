public class Filme extends Publicacao{
    private String diretor;
    private String atorPrin;
    private String sinopse;
    private String duracao;

    public Filme(String titulo, String autor, String anoPublic, String genero, String editora, int qtDisp, String diretor, String atorPrin, String sinopse, String duracao){
        super(titulo, autor, anoPublic, genero, editora, qtDisp);
        this.diretor = diretor;
        this.atorPrin = atorPrin;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    @Override
    public void imprimir(){
        System.out.println(getTitulo());   
        System.out.println(getAutor());
        System.out.println(getanoPublic());    
        System.out.println(getGenero());    
        System.out.println(getEditora());    
        System.out.println(getQtDisp());
        System.out.println(diretor);
        System.out.println(atorPrin);
        System.out.println(sinopse);
        System.out.println(duracao);
    }
}

