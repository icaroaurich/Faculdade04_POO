package atvdd0609;
import java.util.Scanner;
public class app{
    public static void main(String[] args) {
        boolean rodando = true;
        while (rodando == true){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Oque deseja controlar?");
            System.out.println("1 - Caminhao");
            System.out.println("2 - Helicoptero");
            System.out.println("3 - Navio");
            int escolha = teclado.nextInt();
            teclado.nextLine();
            Brinquedo brq;
            ControleRemoto controle = new ControleRemoto();

            if (escolha == 1){
                brq = new Caminhao();
                controle.controlar(brq);}
            if (escolha == 2){
                brq = new Helicoptero();
                controle.controlar(brq);}
            if (escolha == 3){
                brq = new Navio();
                controle.controlar(brq);}

        }}
}