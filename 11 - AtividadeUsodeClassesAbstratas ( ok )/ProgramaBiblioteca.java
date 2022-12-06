import java.util.Scanner;

public class ProgramaBiblioteca {
	
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
     System.out.println("O que deseja inserir na biblioteca? ");
     System.out.println("01 - Livro");
     System.out.println("02 - Filme");
     // implementar tratamento de erro: número fora da faixa
     String escolha = teclado.nextLine();

     if (escolha.equals("1")){
        Livro livro = new Livro(PedirTitulo(),PedirAutor(),PedirAnoPublic(),PedirGenero(),PedirEditora(),PedirQtDisp(),PedirEdicao(),PedirISBN());
        livro.imprimir();
    }
     if (escolha.equals("2")){
        Filme filme = new Filme(PedirTitulo(),PedirAutor(),PedirAnoPublic(),PedirGenero(),PedirEditora(),PedirQtDisp(),PedirDiretor(), PedirAtorPrin(),PedirSinopse(), PedirDuracao());
        filme.imprimir();}
    }    

    public static String PedirTitulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o título: ");
        return teclado.nextLine();
    }
    public static String PedirAutor(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o autor: ");
        return teclado.nextLine();
    }
    public static String PedirAnoPublic(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de publicacao: ");
        return teclado.nextLine();
    }
    public static String PedirGenero(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o genero: ");
        return teclado.nextLine();
    }
    public static String PedirEditora(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a editora: ");
        return teclado.nextLine();
    }
    public static int PedirQtDisp(){
        //implementar tratamento de erro: imput != int
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade disponível: ");
        return teclado.nextInt();
    }
    public static String PedirEdicao(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a edição: ");
        return teclado.nextLine();
    }
    public static String PedirISBN(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a ISBN: ");
        return teclado.nextLine();
    }
    public static String PedirDiretor(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o diretor: ");
        return teclado.nextLine();
    }
    public static String PedirAtorPrin(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ator principal: ");
        return teclado.nextLine();
    }
    public static String PedirSinopse(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sinopse: ");
        return teclado.nextLine();
    }
    public static String PedirDuracao(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a duracao: ");
        return teclado.nextLine();
    }
}
