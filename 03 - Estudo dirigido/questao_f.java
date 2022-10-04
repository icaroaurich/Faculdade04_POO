/*
 * Faça um algoritmo que leia um vetor C[50] de inteiros. 
 * Encontre a seguir o maior elemento de C e mostre-o
 */
import java.util.Scanner;
 public class questao_f{
    public static void main(String[]agrs){
        Scanner objNumero = new Scanner(System.in);
        int i; // indice
        int tamanho_do_vetor = 3;
        int C[] = new int[tamanho_do_vetor]; // vetor com limite 50
        int maior = 0; // variável que irá guardar o maior int
        
        for (i=0;i<tamanho_do_vetor;i++){
            System.out.print("Digite um número: ");            
            C[i] = objNumero.nextInt();
            }

        objNumero.close();

        for (i=0;i<tamanho_do_vetor;i++){
            if (maior < C[i]){
                maior = C[i];
                }
            }
            
        System.out.print("O maior número do vetor é: "+maior);
        }
    }
