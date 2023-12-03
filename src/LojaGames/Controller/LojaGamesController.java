package LojaGames.Controller;

import LojaGames.model.Produto;
import LojaGames.repository.LojaGamesRepository;

import java.util.ArrayList;

public class LojaGamesController implements LojaGamesRepository {

    private ArrayList <Produto> listaProdutos = new ArrayList<Produto>();
    int id = 0; //Define o valor aonde inicia o indice

    @Override
    public void criar(Produto produto) {
        listaProdutos.add(produto);

    }

    @Override
    public void listarTodos() {//Criar um for each para listar todos os produtos os : servem para percorrer a lista
        for(var item : listaProdutos){
            item.visualizar();
        }

    }

    @Override
    public Produto buscarPorId(int id) {
        for (var item : listaProdutos){
            if(item.getId() == id ){
            item.visualizar();
            return item;
            }

        }
        System.out.println("Produto não cadastrado");
        return null;
    }

    @Override

    public Produto atualizar(int id, Produto produto) {
      for (Produto item:listaProdutos){
          if(item.getId() == id){
              return listaProdutos.set(listaProdutos.indexOf(item),produto);
          }
      }
        System.out.println("O ID não foi encontrado!");
        return  null;
    }


    @Override
    public void deletar(int id) {
        for (Produto item : listaProdutos){
            if (item.getId() == id){
                listaProdutos.remove(item);
                return;
                }

        }
        System.out.println("Produto não cadastrado!!!");

    }

    public int gerarId(){
        return ++ id;
    }
}
