/*  Faça um programa onde o usuário informe 2 valores e a operação que deseja realizar. 
    As seguintes operações podem ser realizadas:
    “soma”
    ”subtracao”
    ”multiplicacao”
    “divisao”
*/

import java.util.Scanner;
public class questao_d{
    public static void main(String [] agrs){
        Scanner objNumero = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = objNumero.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = objNumero.nextInt();

        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.print("Digite o número do operador: ");
        int operador = objNumero.nextInt();
        objNumero.close();

        if (operador == 1){
            System.out.print(somar(numero1,numero2));
        }else if (operador == 2){
            System.out.print(subtrair(numero1,numero2));
        }else if (operador == 3){
            System.out.print(multiplicar(numero1,numero2));
        }else if (operador == 4){
            System.out.print(dividir(numero1,numero2));
        }
        }

    public static int somar(int numero1, int numero2){
        return (numero1 + numero2);
        }

    public static int subtrair(int numero1, int numero2){
        return (numero1 - numero2);
        }
        
    public static int multiplicar(int numero1, int numero2){
        return (numero1 * numero2);
        }

    public static int dividir(int numero1, int numero2){
        return (numero1 / numero2);
        }

    }