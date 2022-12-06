public class Livro extends Publicacao{
    private String edicao;
    private String isbn;

    public Livro(String titulo, String autor, String anoPublic, String genero, String editora, int qtDisp, String edicao, String isbn){
        super(titulo, autor, anoPublic, genero, editora, qtDisp);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    @Override
    public void imprimir(){
        System.out.println(getTitulo());   
        System.out.println(getAutor());
        System.out.println(getanoPublic());    
        System.out.println(getGenero());    
        System.out.println(getEditora());    
        System.out.println(getQtDisp());
        System.out.println(edicao);
        System.out.println(isbn);
    }
}

