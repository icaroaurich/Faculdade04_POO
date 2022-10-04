import java.rmi.StubNotFoundException;

class Livros extends Publicacao{
	private int edicao;
	private int isbn;
	
	public Livros(int edicao, int isbn,String titulo,String autor,int anoPublic, String genero, String editora,int quantidadetDisp){
		super(titulo, autor, anoPublic, genero, editora, quantidadetDisp);
		this.edicao = edicao;
		this.isbn = isbn;			
	}
	@Override
	public void imprimirDados(){
		System.out.println("Título................."+super.getTitulo());
		System.out.println("Autor.................."+super.getAutor());
		System.out.println("Ano de publicação......"+super.getAnoPublicacao());
		System.out.println("Editora................"+super.getEditora());
		System.out.println("Gênero................."+super.getGenero());
		System.out.println("Quantidade disponível.."+super.getQuantidadeDisponivel());
		
		System.out.println("Edição................."+this.edicao);
		System.out.println("ISBN..................."+this.isbn);
		
	}
}