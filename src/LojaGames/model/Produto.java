package LojaGames.model;

public class Produto {
    //
    private String nome,fabricante;
    private float preco;
    private int id,faixaEtaria;

    //Constructor
    public Produto(String nome, String fabricante, float preco, int id, int faixaEtaria) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.id = id;
        this.faixaEtaria = faixaEtaria;
    }

    //Getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void visualizar(){
        System.out.println("ID: "+ this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Fabricante: "+this.getFabricante());
        System.out.println("Faixa Etaria: "+this.getFaixaEtaria());
        System.out.println("Preço: R$"+this.getPreco());

    }
}
