package LojaGames.repository;

import LojaGames.model.Produto;

public interface LojaGamesRepository {
    //CrudDaConta
    public void criar(Produto produto);
    public void listarTodos();
    public Produto buscarPorId(int id);
    public Produto atualizar(int id,Produto produto);
    public void deletar(int id);

}
