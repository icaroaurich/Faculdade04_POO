import java.util.Scanner;
public class fonte_6{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float pNumero = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite o segundo número: ");
        float sNumero = teclado.nextInt();
        teclado.nextLine();

        ProgramaCalculadora objCalculadora = new ProgramaCalculadora();
        objCalculadora.setpNumero(pNumero);
        objCalculadora.setpNumero(sNumero);

        System.out.println("Escolha uma operação: ");
        System.out.println("1 - SOMAR");
        System.out.println("2 - DIMINUIR");
        System.out.println("3 - MULTIPLICAR ");
        System.out.println("4 - DIVIDIR");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        if (escolhaUsuario == 1){objCalculadora.getSoma(pNumero, sNumero);}
        else if(escolhaUsuario == 2){objCalculadora.getSubstrair(pNumero, sNumero);}
        else if(escolhaUsuario == 3){objCalculadora.getMultiplicar(pNumero, sNumero);}
        else if(escolhaUsuario == 4){objCalculadora.getDividir(pNumero, sNumero);}
        
    }
}