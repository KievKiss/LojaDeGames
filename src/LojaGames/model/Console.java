package LojaGames.model;

public class Console extends Produto{
    //atributos
    private float armazenamento;
    public Console(String nome, String fabricante, float preco, int id, int faixaEtaria,float armazenamento) {
        super(nome, fabricante, preco, id, faixaEtaria);
        this.armazenamento = armazenamento;
    }
// Getter e setter
    public float getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(float armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Armazenamento: " + this.getArmazenamento() + "GB");
        System.out.println("------------------------");
    }
}
