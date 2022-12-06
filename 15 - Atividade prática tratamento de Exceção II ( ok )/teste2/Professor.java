package teste2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Professor {
    private String nome;
    //private int idade;
    //private String sexo;
    private Integer cpf;
    //private int rg;
    //private String endereco;
    //Dependente dependente;

    static int contador = 0;
    static int tamanhoLista = 2;
    static Professor listaDeProfessores[] = new Professor[tamanhoLista];

    Scanner teclado = new Scanner(System.in);

    public Professor(int escolha){
        if (escolha == 1){ // castrar professor
            try{
                PerguntarNome();
                PerguntarCPF();
            }catch(InputMismatchException e){System.out.println("Conteúdo informado não é um número!\n");}
        }

        if (escolha == 2){ // consultar professor
            try{
                System.out.print("Digite o CPF do professor que será consultado: ");
                Integer consultarCPF = teclado.nextInt();
                ConsultarProfessor(consultarCPF);
            }catch(InputMismatchException e){System.out.println("Conteúdo informado não é um número!\n");
            }catch(ProfNotExistException e){System.out.println(e);}

        }

        if (escolha == 3){ // excluir professor
            try{
                System.out.print("Digite o CPF do professor que será excluío: ");
                Integer excluirCPF = teclado.nextInt();
                ExcluirProfessor(excluirCPF);
            }catch(InputMismatchException e){System.out.println("Conteúdo informado não é um número!\n");
            }catch(ProfNotExistException e){System.out.println(e);}
        }
    }

    public void PerguntarNome(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do professor: ");
        String nome = teclado.nextLine();
        this.nome = nome;
    }

    public void PerguntarCPF() throws InputMismatchException{
        Scanner teclado = new Scanner(System.in);
        System.out.print("CPF do professor: ");
        Integer cpf = teclado.nextInt();
        this.cpf = cpf;
    }

    public void addProfessor(Professor professor) throws ProfExistException, Exception{
        boolean existe = existe(professor);

        if (existe){
            ProfExistException erro = new ProfExistException();
            throw erro;}

        else{
            try{
                listaDeProfessores[contador] = professor;
                contador++;
                System.out.println("Professor "+professor.nome+" adicionado com sucesso!");
            }catch(ArrayIndexOutOfBoundsException e){System.out.println("Limite de professores alcançado: "+tamanhoLista);}
        }
    }

    public boolean existe(Professor professor){
        for (int i=0 ; i < tamanhoLista ; i++){
            System.out.println(listaDeProfessores[i].cpf);
            if (listaDeProfessores[i] == null){return false;}
            if (professor.cpf.equals(listaDeProfessores[i].cpf)){return true;}
        }
        return false;
    }

    public void ConsultarProfessor(Integer cpf) throws ProfNotExistException{
        ProfNotExistException erro = new ProfNotExistException();
        boolean existe = false;
        try{
            for (int i=0 ; i < tamanhoLista ; i++){
                
                if (listaDeProfessores[i] == null){throw erro;}
                if (cpf.equals(listaDeProfessores[i].cpf)){
                    System.out.println(listaDeProfessores[i]);
                    existe = true;
                    break;
                }
            }
            if (existe == false){throw erro;}

        }catch(Exception e){System.out.println(e);}
    }
    
    public void ExcluirProfessor(Integer cpf) throws ProfNotExistException{
        try{
            ProfNotExistException erro = new ProfNotExistException();
            Scanner teclado = new Scanner(System.in);
            boolean existe = false;

            for (int i=0 ; i < tamanhoLista ; i++){
                
                if (listaDeProfessores[i] == null){throw erro;}
                if (cpf.equals(listaDeProfessores[i].cpf)){
                    existe = true;
                    // Remover professor
                    System.out.print("O professor "+listaDeProfessores[i]+" será excluído, proceguir? (S/N)");
                    String continuar = teclado.nextLine();
                    if (continuar.equals("S")){listaDeProfessores[i] = null;contador--;
                        System.out.println("Professor removido.\n");}
                    else{System.out.println("Operação cancelada.\n");}
                    break;
                }
            }
            if (existe == false){throw erro;}

        }catch(Exception e){System.out.println(e);}
    } 

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();
        return this.nome;
    }
}