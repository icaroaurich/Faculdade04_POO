/* Sabendo que um Carro para o sistema de cadastro da loja XPTO Veículos possui as seguintes 
características: 
* Código, 
* Marca, 
* Cor, 
* Modelo, 
* Ano de Fabricação, 
* Número de Portas, 
* Tipo de Combustível, 
* Quantidade Disponível, 
* Preço e 
* se carro é completo ou básico. 

O objeto Carro possui os seguintes comportamentos: 
(i) cadastrar e alterar que recebem como parâmetro as características do Carro; 
(ii) listar – comportamento responsável por listar as informações do carro.

*/
import java.util.Scanner;
public class fonte_1{
    public static void lista(carro[] carros){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Qual carro deseja ver?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        carro teste = carros[escolhaUsuario];
        teste.getAll();
        System.out.println("");
    }

    public static void alterar(carro[] carros){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual carro deseja alterar?: ");
        int escolhaUsuario = teclado.nextInt();
        teclado.nextLine();

        carro alterar = carros[escolhaUsuario];
        alterar.getAll();
        System.out.println("");
        System.out.println("Oque deseja alterar?:");
        System.out.println("2 - Marca");
        System.out.println("3 - Cor");
        System.out.println("4 - Modelo");
        System.out.println("5 - Ano de fabricação");
        System.out.println("6 - Número de portas");
        System.out.println("7 - Tipo de combustível");
        System.out.println("8 - Quantidade disponível");
        System.out.println("9 - Preço");
        System.out.println("0 - Completo ou básico");
        escolhaUsuario = teclado.nextInt();
        teclado.nextLine();
        if (escolhaUsuario == 2){
            System.out.print("Digite a marca do veículo: ");
            String marca = teclado.nextLine();
            alterar.setMarca(marca);}
        else if(escolhaUsuario == 3){
            System.out.print("Digite a cor do veículo: ");
            String cor = teclado.nextLine();
            alterar.setCor(cor);}
        else if(escolhaUsuario == 4){
            System.out.print("Digite o modelo do veículo: ");
            String modelo = teclado.nextLine();
            alterar.setModelo(modelo);}
        else if(escolhaUsuario == 5){
            System.out.print("Digite ano de fabricação do veículo: ");
            String anoFab = teclado.nextLine();
            alterar.setAnoFabricacao(anoFab);}
        else if(escolhaUsuario == 6){
            System.out.print("Digite o número de portas do veículo: ");
            int nPortas = teclado.nextInt();
            teclado.nextLine();
            alterar.setnPortas(nPortas);}
        else if(escolhaUsuario == 7){
            System.out.print("Digite o tipo de combustível do veículo: ");
            String combustivel = teclado.nextLine();
            alterar.setTipoCombustível(combustivel);}
        else if(escolhaUsuario == 8){
            System.out.print("Digite a quantidade disponível do veículo: ");
            int quantidadeDisponivel = teclado.nextInt();
            teclado.nextLine();
            alterar.setQuantidadeDisponivel(quantidadeDisponivel);}
        else if(escolhaUsuario == 9){
            System.out.print("Digite o preço do veículo: ");
            float preco = teclado.nextFloat();
            alterar.setPreco(preco);}
        else if(escolhaUsuario == 0){
            System.out.print("Digite 0 para básico, 1 para completo: ");
            int completo = teclado.nextInt();
            alterar.setCompleto(completo);}

        else{System.out.println("Número fora da faixa!!");}
    }

    public static void registrarCarro(carro objCarro){
        //instanciando obj's
        Scanner teclado = new Scanner (System.in);
        //Começo do código ***

        // System.out.print("Digite o codigo do veículo: ");
        // int codigo = teclado.nextInt();
        // objCarro.setCodigo(codigo);
        // teclado.nextLine();

        System.out.print("Digite a marca do veículo: ");
        String marca = teclado.nextLine();
        objCarro.setMarca(marca);

        System.out.print("Digite a cor do veículo: ");
        String cor = teclado.nextLine();
        objCarro.setCor(cor);

        System.out.print("Digite o modelo do veículo: ");
        String modelo = teclado.nextLine();
        objCarro.setModelo(modelo);

        System.out.print("Digite o ano de fabricação do veículo: ");
        String anoFabricacao = teclado.nextLine();
        objCarro.setAnoFabricacao(anoFabricacao);

        System.out.print("Digite o número de portas do veículo: ");
        int nPortas = teclado.nextInt();
        objCarro.setnPortas(nPortas);
        teclado.nextLine();

        System.out.print("Digite o tipo de combustível do veículo: ");
        String tipoCombustível = teclado.nextLine();
        objCarro.setTipoCombustível(tipoCombustível);

        System.out.print("Digite a quantidade disponível do veículo: ");
        int quantidadeDisponivel = teclado.nextInt();
        objCarro.setQuantidadeDisponivel(quantidadeDisponivel);
        teclado.nextLine();

        System.out.print("Digite preço do veículo: ");
        float preco = teclado.nextFloat();
        objCarro.setPreco(preco);
        teclado.nextLine();

        System.out.print("Digite se o veículo é completo ou básico \n(0 básico /1 completo): ");
        int completo = teclado.nextInt();
        objCarro.setCompleto(completo);
        teclado.nextLine();
    }
    public static void main(String[] args) {
        Boolean rodando = true;
        carro carros[] = new carro[5];
        int i = 1;

        while (rodando){
            Scanner teclado = new Scanner (System.in);        
            //ArrayList<carro> carros = new ArrayList<>();
            //int escolhaUsuario = 1;

            System.out.println("Bem vindo ao programa\nO que gostaria de fazer?");
            System.out.println("1 - Cadastrar carro;");
            System.out.println("2 - Alterar carro;");
            System.out.println("3 - Ver carros;");        
            System.out.println("4 - sair;");        
            //escolhaUsuario = Integer.parseInt(teclado.nextLine());
            int escolhaUsuario = teclado.nextInt();
            //teclado.nextLine();

            if (escolhaUsuario ==1){      
                carro objCarro = new carro();      
                registrarCarro(objCarro);
                objCarro.setCodigo(i);
                carros[i] = objCarro;
                i++;
                }
            else if (escolhaUsuario == 2){
                alterar(carros);
                }
            else if (escolhaUsuario == 3){
                lista(carros);
                }
            else if (escolhaUsuario == 4){
                rodando = false;
                }
        }
        }
}