/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Em uma eleição presidencial existem quatro candidatos. 
 * Os votos são informados através de códigos. 
 * Os dados utilizados para a contagem dos votos obedecem a seguinte codificação:
 * a) 1, 2, 3, 4 = voto para os respectivos candidatos;
 * b) 5 = voto em branco, senão considerar voto nulo
 * Elaborar um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
 * a) total de votos para cada candidato;
 * b) total de votos nulos;
 * c) total de votos em branco.
 * Como finalizador do conjunto de votos, tem-se o valor 0.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

 import java.util.Scanner;
 public class q5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite = 10;
        int candidatosVotos[] = new int [limite];
        String candidatosNomes[] = new String [6];
        int i;

        candidatosNomes[0] = "Nulo";
        candidatosNomes[5] = "Branco";

        for (i=1;i<5;i++){
            candidatosNomes[i] = "Candidato "+i;}

        for (i=0;i<limite;i++){
            System.out.print("Em quem deseja votar? :");
            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0 | numero > 5){
                System.out.println("Número digitado é inválido!!");
                System.out.println("Favor, informar um número válido.");
                i--;}
            else{
                if (numero == 1){candidatosVotos[1]++;}
                if (numero == 2){candidatosVotos[2]++;}
                if (numero == 3){candidatosVotos[3]++;}
                if (numero == 4){candidatosVotos[4]++;}
                if (numero == 5){candidatosVotos[5]++;}
                if (numero == 0){candidatosVotos[0]++;}}}
        
        for (i=0;i<6;i++){
            System.out.print(candidatosNomes[i]+" | ");
            System.out.println(candidatosVotos[i]);}

    }}