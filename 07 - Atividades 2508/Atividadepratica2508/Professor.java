public class Professor extends Funcionario{
    String formacao;
    String listaDisciplina[] = new String[5];
    int x = 0;

    public Professor(){
        super("joao",123,321,"11/04/2001","18/04/2019",1200);
        
    }

    public void setDisciplina(String disciplina){
        boolean adicionado = false;

        while (adicionado == false){
            if (listaDisciplina[x] == null){
            listaDisciplina[x] = disciplina;
            adicionado = true;}

            else{x++;}
        }
    }   

    public void getDisciplina(){
        boolean rodando = true;
        while (rodando == true){
            String y = listaDisciplina[x];
            if (y == null){
                rodando = false;
            }
            else{
                System.out.println("DISCIPLINA.."+y);
                x++;
            }
        }
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void getAll(){
        System.out.println("FORMAÇÃO...."+formacao);
        getDisciplina();
    }
}