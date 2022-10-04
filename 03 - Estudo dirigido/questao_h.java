// Faça um algoritmo que leia um vetor V[10] e imprima esse vetor na tela. 
// Crie também um vetor COMP que conterá somente os valores menores que 10 do vetor V

public class questao_h{
    public static void main(String[]agrs){
        System.out.println("Início");
        int i;
        int b = 1;
        int V[] = new int[10];
        int COMP[] = new int[10];

        for (i=1;i<10;i++){
            b = i*2;
            V[i] = b;
        }
        System.out.println("COMP");
        for (b=1;b<10;b++){
            if (V[b] < 10){ // 
            COMP[b] = V[b];
            }
        }
        imprimir_vetor(V, i);
        System.out.println("");
        imprimir_vetor(COMP, i);

    }

    public static void imprimir_vetor(int[] V, int i){
        for (i=1;i<10;i++){ // printar vetor
            System.out.print(V[i]+" // ");
        }
    }

}