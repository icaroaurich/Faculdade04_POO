class Filme extends Publicacao{
	String diretor;
	String atorPrincipal;
	String sinopse;
	String tempoDuracao;
	
	public Filme(String titulo, String autor, int anoPublicacao,String genero, String editora, int quantidadeDisp, String diretor, String atorPrincipal, String sinopse, String tempoDucarao){
		super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisp);
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.sinopse = sinopse;
		this.tempoDuracao = tempoDucarao;
	}
	
	@Override
	public void imprimirDados(){
		System.out.println("Título................."+super.getTitulo());
		System.out.println("Autor.................."+super.getAutor());
		System.out.println("Ano de publicação......"+super.getAnoPublicacao());
		System.out.println("Editora................"+super.getEditora());
		System.out.println("Gênero................."+super.getGenero());
		System.out.println("Quantidade disponível.."+super.getQuantidadeDisponivel());
		
		System.out.println("Diretor................"+this.diretor);
		System.out.println("Ator Principal........."+this.atorPrincipal);
		System.out.println("Sinopse................"+this.sinopse);
		System.out.println("Tempo de duração......."+this.tempoDuracao);
		
	}
}