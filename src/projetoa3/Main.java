package projetoa3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        boolean continuar = true;
        
        Estoque meuEstoque = new Estoque();
  
        while(continuar == true){
            
            System.out.println("\n----------------------\n" +
                               "Escolha uma das opções:\n" +
                               "\n1 - adicionar produto" +
                               "\n2 - remover produto" +
                               "\n3 - atualizar produto" +
                               "\n4 - visualizar estoque" +
                               "\n5 - encerrar" + 
                               "\n----------------------\n"
                               );
            
            String entradaOpcao = teclado.nextLine(); 
            
            byte opcoes = Byte.parseByte(entradaOpcao);
            
            switch(opcoes){
                
                case 1:
                    System.out.println("--- Adicionando Novo Produto ---");

                    System.out.print("Nome: ");
                    String addNome = teclado.nextLine();

                    System.out.print("Descrição: ");
                    String addDesc = teclado.nextLine();

                    System.out.print("Preço: ");
                    float addPreco = Float.parseFloat(teclado.nextLine());

                    System.out.print("Cor: ");
                    String addCor = teclado.nextLine();

                    System.out.print("Quantidade: ");
                    int addQtd = Integer.parseInt(teclado.nextLine());

                    meuEstoque.Inserir(addNome,addDesc,addPreco,addCor, addQtd);
                break;
                
                case 2: 
                    System.out.println("Removendo produto...\n");
                    
                break;
                
                case 3:
                    
                    System.out.println("--- Atualizar Produto ---");
                    
                    System.out.println("Digite o Id do produto que deseja atualizar: ");
                    int atuId = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("----------------------\n" +
                               "Escolha uma das op��es:\n" +
                               "\n1 - Nome" +
                               "\n2 - Descrição" +
                               "\n3 - Preço" +
                               "\n4 - Cor" +
                               "\n5 - Quantidade" + 
                               "\n----------------------\n"
                               );
                    
                    int escolha = Integer.parseInt(teclado.nextLine());
                    
                    String novoValor;
                    
                    switch(escolha){
                        
                        case 1:
                            System.out.print("Nome: ");
                            novoValor = teclado.nextLine();
                            meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                        break;
                        
                        case 2:
                            System.out.print("Descrição: ");
                            novoValor = teclado.nextLine();
                            meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                        break;
                        
                        case 3:
                            System.out.print("Preço: ");
                            novoValor = teclado.nextLine();
                            meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                        break;
                        
                        case 4:
                            System.out.print("Cor: ");
                            novoValor = teclado.nextLine();
                            meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                        break;
                        
                        case 5:
                            System.out.print("Quantidade: ");
                            novoValor = teclado.nextLine();
                            meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                        break;
                        
                        default:
                            System.out.println("Nenhuma op��o valida selecionada.");
                    }
                    
                break;
                
                case 4: 
                    System.out.println("--- Visualizar Estoque ---\n");
                    meuEstoque.VisualizarEstoque();
                break;
                
                case 5: 
                    System.out.println("Encerrando...");
                    continuar = false;
                break;
                
                default:
                    System.out.println("Nenhuma das opções validas selecionadas.\n");
                    
            }        
        
        }
        
        teclado.close();
        
    }
        
}
