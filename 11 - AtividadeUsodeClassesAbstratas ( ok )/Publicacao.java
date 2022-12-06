abstract public class Publicacao {
    private String titulo;
    private String autor;
    private String anoPublic;
    private String genero;
    private String editora;
    private int qtDisp;

    public Publicacao(String titulo, String autor, String anoPublic, String genero, String editora, int qtDisp){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublic = anoPublic;
        this.genero = genero;
        this.editora = editora;
        this.qtDisp = qtDisp;
    }

    abstract void imprimir();

    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getanoPublic() {return anoPublic;}
    public String getGenero() {return genero;}
    public String getEditora() {return editora;}
    public int getQtDisp() {return qtDisp;}
}