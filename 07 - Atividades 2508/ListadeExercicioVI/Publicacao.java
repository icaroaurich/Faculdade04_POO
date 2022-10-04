abstract class Publicacao{
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String genero;
	private String editora;
	private int quantidadeDisp;
	
	public Publicacao(String titulo,String autor,int anoPublic, String genero, String editora,int quantidadetDisp){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublic;
		this.genero = genero;
		this.editora = editora;
		this.quantidadeDisp = quantidadetDisp;
	}
	
	public abstract void imprimirDados();
	
	public String getTitulo(){
		return titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public int getAnoPublicacao(){
		return anoPublicacao;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public String getEditora(){
		return editora;
	}
	
	public int getQuantidadeDisponivel(){
		return quantidadeDisp;
	}
	
}