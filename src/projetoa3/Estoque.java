package projetoa3;

public class Estoque {
    
    Produto[] estoque = new Produto[1];
    int tamanhoEstoque = 0;

    public void Inserir(String addNome, String addDesc, float addpreco, String addCor, int addQtd) {

        if (estoque.length == tamanhoEstoque) {

            System.out.println("\nSem espaço, aumentando o estoque...");

            int novoTamanho = tamanhoEstoque * 2;

            Produto[] novoEstoque = new Produto[novoTamanho];

            for(int i = 0; i < tamanhoEstoque; i++) {

                novoEstoque[i] = estoque[i];

            }

            estoque = novoEstoque;
        }

        Produto produto = new Produto(addNome, addDesc, addpreco, addCor, addQtd);

        estoque[tamanhoEstoque] = produto;

        tamanhoEstoque++;

        System.out.println("\nProduto " + produto.getNome() + " foi Adicionado com sucesso!\n");
        System.out.println("Tamanho estoque: " + estoque.length);

    }

    public void Remover(int id) {
        int posicao = BuscarPorId(id);

        if(posicao != 99999){
            estoque[posicao] = null;
            System.out.println("Produto foi removido");
        }
    }

    public void AtualizarLista(int atuId, int escolha, String novoValor) {

        Produto p = estoque[BuscarPorId(atuId)];

        switch (escolha) {
            case 1:
                p.setNome(novoValor);
                System.out.println("Nome atualizado com sucesso!");
                break;

            case 2:
                p.setDescricao(novoValor);
                System.out.println("Descrição atualizada com sucesso!");
                break;

            case 3:
                Float atuPreco = Float.parseFloat(novoValor);
                p.setPreco(atuPreco);
                System.out.println("Preço atualizado com sucesso!");
                break;

            case 4:
                p.setCor(novoValor);
                System.out.println("Cor atualizada com sucesso!");
                break;

            case 5:
                int atuqtd = Integer.parseInt(novoValor);
                p.setqtdEstoque(atuqtd);
                System.out.println("Cor atualizada com sucesso!");
                break;

            default:
                System.out.println("Nenhuma das op��es validas selecionadas.\n");
        }

        System.out.println("\nProduto " + p.getNome() + " foi atualizado com sucesso!\n");

    }

    public void VisualizarEstoque() {

        if (tamanhoEstoque == 0) {
            System.out.println("Estoque est� vazio.");
        } else {

            System.out.println("Tamanho estoque: " + estoque.length);

            for (int i = 0; i < tamanhoEstoque; i++) {

                Produto p = estoque[i];

                System.out.println("\n�ndice [" + i + "]: ID: " + p.getId() +
                        " | Nome: " + p.getNome() +
                        " | Descri��o: " + p.getDescricao() +
                        " | Pre�o: " + p.getPreco() +
                        " | Cor: " + p.getCor() +
                        " | Quantidade: " + p.getqtdEstoque());
            }
        }
    }

    public int BuscarPorId(int id) {
        int localizador;
        boolean flag = false;

        for (localizador = 0; localizador < estoque.length; localizador++) {

            if (id == estoque[localizador].getId()) {
                flag = true;
            }
        }

        return localizador;
    }

}
