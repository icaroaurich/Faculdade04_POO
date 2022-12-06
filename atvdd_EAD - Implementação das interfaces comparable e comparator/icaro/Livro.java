package icaro;

public class Livro implements Comparable {
	private int isbn;
	private String nome;

	public Livro(int isbn, String nome) {
		this.isbn = isbn;
		this.nome = nome;
	}

	public int compareTo(Object other) { // ordenação "Padrão", por ISBN
		Livro livro = (Livro) other;		

		if (this.isbn < livro.getIsbn()) {return -1;}
		if(this.isbn > livro.getIsbn()){return 1;}
		return 0;
	}


	public int getIsbn() {
		return this.isbn;
	}

	public String getNome() {
		return this.nome;
	}	

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();
        return this.nome;
    }
}