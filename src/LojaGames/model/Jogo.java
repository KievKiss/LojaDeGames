package LojaGames.model;

public class Jogo extends Produto{
    private  String genero;

    //contructor
    public Jogo(String nome, String fabricante, float preco, int id, int faixaEtaria,String genero) {
        super(nome, fabricante, preco, id, faixaEtaria);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Genero: " + this.genero);
        System.out.println("------------------------");
    }
}
