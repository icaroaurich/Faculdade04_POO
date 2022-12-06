public class carro{
    int codigo; 
    String marca;
    String cor;
    String modelo;
    String anoFabricacao;
    int nPortas;
    String tipoCombustível;
    int quantidadeDisponivel;
    Float preco;
    int completo; // completo ou básico, 0 para básico, 1 para completo.

    //set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    public void setTipoCombustível(String tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public void setCompleto(int completo) {
        this.completo = completo;
    }

    //get
    public void getAll(){
        for (int i=0;i<50;i++){System.out.print("-");}
        System.out.println("");
        System.out.println("Código:..................."+codigo);
        System.out.println("Marca:...................."+marca);
        System.out.println("Cor:......................"+cor);
        System.out.println("Modelo:..................."+modelo);
        System.out.println("Ano de Fabricação:........"+anoFabricacao);
        System.out.println("Número de portas:........."+nPortas);
        System.out.println("Tipo de cobustível:......."+tipoCombustível);
        System.out.println("Quantidade Disponível:...."+quantidadeDisponivel);
        System.out.println("Preço:...................."+preco);
        String strCompleto;
        if (completo == 1){strCompleto = "Sim";}
        else{strCompleto = "Não";}
        System.out.println("Completo:................."+strCompleto);
        for (int i=0;i<50;i++){System.out.print("-");}
    }

    public String getMarca() {
        return marca;
    }
}