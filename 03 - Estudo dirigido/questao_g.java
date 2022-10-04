/*
 * Faça um algoritmo que leia um vetor T[15]. 
 * Crie, a seguir, um vetor Fat[15] que contém os fatoriais dos valores contido no vetor T. 
 * Mostre a seguir o vetor Fat. 
 * Fatorial de n = n *(n-1)*(n-2)*(n-3)*...*1
 * Ex: Fatorial de 4
 */

public class questao_g{
    public static void main(String[]agrs){
        System.out.println("Início");
        int i; // indice
        int T[] = new int[15]; // vetor T
        int fat[] = new int[15]; // vetor fat

        for (i=1;i<15;i++){ // laço de repetção para adicionar numeros de 1 á 15 no vetor T
            T[i] = i;
        }

        for (i=1;i<15;i++){ // printar vetor T
            System.out.println(T[i]);
        }
        
        System.out.println("Início do FAT");

        for (i=1;i<15;i++){ // verifica qual o número na posição i do vetor T, faz o FAT e adiciona no vetor fat
            fat[i] = fat(i);
        }
        
        for (i=0;i<15;i++){ // printar vetor fat
            System.out.println(fat[i]);
        }
        System.out.println("Fim do código");

    }

    public static int fat(int numero){
        if (numero == 1){
        return 1;
        }else{
        return (numero * fat(numero-1));
    }
    }

}