package excpt;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("bora");
        ArrayList <Aluno> lista = new ArrayList<Aluno>();
        boolean rodando = true;

        while (rodando){
            try{
                System.out.print("Nome: ");
                String nome = teclado.nextLine();

                System.out.print("Matricula: ");
                int matricula = teclado.nextInt();
                teclado.nextLine();

                Aluno aluno = new Aluno(nome,matricula);
                
                existe(aluno, lista);

                lista.add(aluno);
                System.out.println("Aluno adicionado com sucesso!! \n");

            }catch (InputMismatchException erro1){
                System.out.println("Conteúdo informado não é um número!");
                teclado.nextLine();
            }catch (Exception erro2){
                System.out.println("Aluno já matriculado!");
            }finally{
                System.out.println("Execução do Finally!");
            }
        }teclado.close();
    }

    public static boolean existe(Aluno aluno, ArrayList lista)throws Exception{
        int tamanhoLista = lista.size();

        if (tamanhoLista == 0){return false;}
        else{
            for (int i=0;i<tamanhoLista;i++){
                Aluno alunoDaLista = (Aluno) lista.get(i);

                Integer mat = aluno.getMatricula();
                Integer matLista = alunoDaLista.getMatricula();

                if (mat.equals(matLista)){
                    Exception erro = new Exception();
                    throw erro;
                }
            }
        }

        return false;
    }
}