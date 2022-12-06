// Faça um algoritmo que solicite ao usuário para digitar um valor numérico entre 0 e 5. 
// Caso o número digitado esteja entre 1 e 5 imprima em extenso o valor (Ex: “Um”, “Dois”, “Três”,
// Quarto”, “Cinco”) e repita a operação. Caso o usuário digite 0 o programa exibe a mensagem
// “Saindo do Algoritmo...” e chega ao fim.

import java.util.Scanner;
public class q4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            teclado.nextLine();
            if (numero == 0)
                {break;}
            else{
                String unidade = DefinirUnidade(numero);
                System.out.println(unidade);}}

        System.out.println("Saindo do Algoritmo...");}

    public static String DefinirUnidade(int numero){

        if (numero == 1){return "Um";}
        if (numero == 2){return "Dois";}
        if (numero == 3){return "Três";}
        if (numero == 4){return "Quatro";}
        if (numero == 5){return "Cinco";}
        else{
        return "Numero fora da faixa!";}}
}