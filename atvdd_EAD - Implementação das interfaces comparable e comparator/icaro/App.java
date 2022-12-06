package icaro;
import java.util.ArrayList;
import java.util.Collections;

public class App{
public static void main(String[] args) {
    ArrayList<Livro> livros = new ArrayList<Livro>();
    
    Livro livro01 = new Livro(465, "Anne Frank");
    Livro livro02 = new Livro(25, "Teoria das redes");
    Livro livro03 = new Livro(587, "Shrerek 6");

    livros.add(livro01);
    livros.add(livro02);
    livros.add(livro03);

    Collections.sort(livros);
    System.out.println(livros);

    Collections.sort(livros, new IcaroComparator());
    System.out.println(livros);
    }
}