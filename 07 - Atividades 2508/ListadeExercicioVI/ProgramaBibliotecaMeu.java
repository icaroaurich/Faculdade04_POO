import java.util.Scanner;
public class ProgramaBibliotecaMeu{
	public static void main(String[] args){
		//instanciando obj
		Scanner teclado = new Scanner(System.in);
		boolean rodando = true;
		while (rodando == true){
			System.out.println("O que deseja cadastrar?");
			System.out.println("1 para Livro");
			System.out.println("2 para filme");
			int cadastrar = teclado.nextInt();
			teclado.nextLine();
			Livros livro;
			Filme filme;
			
			if (cadastrar == 1){
				livro = CadastrarLivroAuto();
				livro.imprimirDados();}
			else if (cadastrar == 2){
				filme = CadastrarFilmeAuto();
				filme.imprimirDados();}
			else if (cadastrar == 0){
				rodando = false;}
			else{System.out.println("Conteúdo informado é inválido!\nTente novamente");}
		}
		teclado.close();
	}
	
	static Livros CadastrarLivro(){
		Scanner teclado = new Scanner(System.in);
		
		// recebendo dados * DIRETOR / ATOR / SINOPSE / TEMPO DURACAO
		System.out.print("Qual a edição?: ");
			int edicao = teclado.nextInt();
			teclado.nextLine();
			
		System.out.print("Qual o ISBN?: ");
			int isbn = teclado.nextInt();
			teclado.nextLine();
			
		System.out.print("Qual o Título?: ");
			String titulo = teclado.nextLine();
		
		System.out.print("Qual o autor?: ");
			String autor = teclado.nextLine();
			
		System.out.print("Qual o ano de publicação?: ");
			int anoPublic = teclado.nextInt();
			teclado.nextLine();
		
		System.out.print("Qual o genero?: ");
			String genero = teclado.nextLine();
			
		System.out.print("Qual a editora?: ");
			String editora = teclado.nextLine();
		
		System.out.print("Qual a quantidadet disponível?: ");
			int qtDisp = teclado.nextInt();
		teclado.nextLine();			
		
		Livros livro = new Livros(edicao,isbn,titulo,autor,anoPublic,genero,editora,qtDisp);
		livro.imprimirDados();
		return livro;
		
	}

	static Livros CadastrarLivroAuto(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual o Título?: ");
			String titulo = teclado.nextLine();
			
		Livros livro = new Livros(1,2,titulo,"autor",2001,"rock","editora",3);
		return livro;
		
	}

	static Filme CadastrarFilme(){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual o Título?: ");
			String titulo = teclado.nextLine();
		
		System.out.print("Qual o autor?: ");
			String autor = teclado.nextLine();
			
		System.out.print("Qual o ano de publicação?: ");
			int anoPublic = teclado.nextInt();
			teclado.nextLine();
		
		System.out.print("Qual o genero?: ");
			String genero = teclado.nextLine();
			
		System.out.print("Qual a editora?: ");
			String editora = teclado.nextLine();
		
		System.out.print("Qual a quantidadet disponível?: ");
			int qtDisp = teclado.nextInt();
		teclado.nextLine();			

		System.out.print("Qual o Diretor?: ");
			String diretor = teclado.nextLine();
		
		System.out.print("Qual o ator principal ");
			String atorPrincipal = teclado.nextLine();
		
		System.out.print("Qual a sinopse?: ");
			String sinopse = teclado.nextLine();

		System.out.print("Qual o tempo de duração?: ");
			String tempoDuracao = teclado.nextLine();

		Filme filme = new Filme(titulo, autor, anoPublic, genero, editora, qtDisp, diretor, atorPrincipal, sinopse, tempoDuracao);
		return filme;
	}

	static Filme CadastrarFilmeAuto(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual o Título?: ");
			String titulo = teclado.nextLine();

		Filme filme = new Filme(titulo, "Icaro", 2001, "Aventura","AurichFilms", 3, "Icaro","Joaozinho", "Joao zinho e suas aventuras", "47 horas");
		return filme;
	}
}

