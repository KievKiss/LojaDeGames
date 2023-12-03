package LojaGames.model;

import LojaGames.model.Produto;
import LojaGames.Controller.LojaGamesController;
import LojaGames.model.Console;
import LojaGames.model.Jogo;

import java.util.Scanner;

public class Testa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        LojaGamesController produto = new LojaGamesController();
        String nome,fabricante,genero = null;
        float preco,armazenamento = 0;
        int id,faixaEtaria,opcao,tipo;


        do{
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                   Game Store          	             ");
            System.out.println("               GamePlay Avançada                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Produto                    ");
            System.out.println("            2 - Listar todos os produtos             ");
            System.out.println("            3 - Buscar produto por ID                ");
            System.out.println("            4 - Atualizar produto                    ");
            System.out.println("            5 - Apagar produto                       ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("*****************************************************");
            System.out.println("\tEntre com a opção desejada:                        ");
            System.out.println("                                                     ");

            opcao = leia.nextInt();

            switch (opcao){
                case 1:

                    do {
                        System.out.println("Dite o tipo do produto (1 - console ou 2 para jogo) : ");
                        tipo = leia.nextInt();
                        leia.nextLine();
                    }while (tipo <1 && tipo >2);

                    switch (tipo){
                        case 1 ->{
                            System.out.println("Adicionando um novo Console a loja!");
                            System.out.println("Digite o nome do console:");
                            nome = leia.nextLine();
                            System.out.println("Digite o Fabricante");
                            fabricante = leia.nextLine();
                            System.out.println("Digite o preço do console");
                            preco = leia.nextInt();
                            System.out.println("Digite a faixa etaria do produto:");
                            faixaEtaria = leia.nextInt();
                            System.out.println("Digite a capacidade de armazenamento do console:");
                            armazenamento = leia.nextFloat();
                            produto.criar(new Console(nome,fabricante,preco, produto.gerarId(),faixaEtaria,armazenamento));
                        }
                        case 2 ->{
                            System.out.println("Adicionando um novo Jogo ao estoque!");
                            System.out.println("Digite o nome do produto:");
                            nome = leia.nextLine();
                            System.out.println("Digite o fabricante do produto");
                            fabricante = leia.nextLine();
                            System.out.println("Digite o preço do produto:");
                            preco = leia.nextInt();
                            System.out.println("Digite a faixa etaria do produto");
                            faixaEtaria = leia.nextInt();
                            System.out.println("Digite o genero do jogo");
                            genero = leia.nextLine();
                            produto.criar(new Jogo(nome,fabricante,preco, produto.gerarId(), faixaEtaria,genero));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Listar todos os produtos");
                    produto.listarTodos();
                    break;
                case 3:
                    System.out.println("Consultando produto por id");
                    id = leia.nextInt();
                    produto.buscarPorId(id);

                    break;
                case 4:
                    System.out.println("Atulizar Produto");
                    System.out.println("Digite o id do produto que deseja atualizar:");
                    id = leia.nextInt();
                    System.out.println("Confirmando produto a ser atualizado:");
                    var buscaProduto = produto.buscarPorId(id);

                    if(buscaProduto != null){
                        tipo = buscaProduto.getId();
                        do {
                            System.out.println("Dite o tipo do produto (1 - console ou 2 para jogo) : ");
                            tipo = leia.nextInt();
                            leia.nextLine();
                        }while (tipo <1 && tipo >2);

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Adicionando um novo Console a loja!");
                                System.out.println("Digite o nome do console:");
                                nome = leia.nextLine();
                                System.out.println("Digite o Fabricante");
                                fabricante = leia.nextLine();
                                System.out.println("Digite o preço do console");
                                preco = leia.nextInt();
                                System.out.println("Digite a faixa etaria do produto:");
                                faixaEtaria = leia.nextInt();
                                System.out.println("Digite a capacidade de armazenamento do console:");
                                armazenamento = leia.nextFloat();
                                produto.atualizar(id,new Console(nome, fabricante, preco, produto.gerarId(), faixaEtaria, armazenamento));
                            }
                            case 2 -> {
                                System.out.println("Adicionando um novo Jogo ao estoque!");
                                System.out.println("Digite o nome do produto:");
                                nome = leia.nextLine();
                                System.out.println("Digite o fabricante do produto");
                                fabricante = leia.nextLine();
                                System.out.println("Digite o preço do produto:");
                                preco = leia.nextInt();
                                System.out.println("Digite a faixa etaria do produto");
                                faixaEtaria = leia.nextInt();
                                System.out.println("Digite o genero do jogo");
                                genero = leia.nextLine();
                                produto.atualizar(id,new Jogo(nome, fabricante, preco, produto.gerarId(), faixaEtaria, genero));
                            }
                            default -> {
                                System.out.println("Produt não cadastrado!");
                            }

                        }
                    }else System.out.println("Produto não cadastrado!");
                    break;
                case 5:
                    System.out.println("Apagar produto");
                    System.out.println("Digite o id");
                    id = leia.nextInt();

                    produto.deletar(id);
                case 0:
                    System.out.println("Fechando programa");
                    break;
                default:
                    System.out.println("Opção invalida");
                    System.out.println("");
                    break;
            }

        }while(opcao != 0);{
            sobre();
            System.exit(0);
        }
    }
    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por:Kevin Oliveira              ");
        System.out.println("github.com/KievKiss/LojaGames                        ");
        System.out.println("***************************************************  ");
    }
}
