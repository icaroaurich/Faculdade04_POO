/*
 * Uma fábrica possui uma máquina para aquecimento de sua matéria prima. Nesta máquina o usuário informa o tempo necessário para aquecimento em segundos
 * Você deve escrever um algoritmo onde o usuário possa dizer o tempo de aquecimento, em segundos, e imprima no formato Hora, Minutos e Segundos. Ex: 13230 segundos = 3:40:30
 */

import java.util.Scanner;
public class questao_e{
    public static void main(String [] agrs){
        Scanner objNumero = new Scanner(System.in);

        System.out.print("Digite quantos segundos: ");
        int segundos_original = objNumero.nextInt();
        objNumero.close();

        int horas = (segundos_original / 60) / 60;
        int minutos = ((segundos_original / 60) - horas * 60);
        int segundos = segundos_original % 60;
        
        System.out.print(horas+":");
        System.out.print(minutos+":");
        System.out.print(segundos);
        
        

        }
    }