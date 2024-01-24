package eCommerce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import eCommerce.controller.ContaController;
import eCommerce.controller.ProdutoController;
import eCommerce.model.ContaCliente;
import eCommerce.model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		// Criando Objeto da Classe ContaControlller
		ContaController contas = new ContaController();
		ProdutoController produtos = new ProdutoController();
		
		Produto computador = new Produto(produtos.gerarNumero(), "Computador", 2000f);
		
		produtos.adicionar(computador);
		
		Scanner ler = new Scanner(System.in);

		int opcao, numeroProduto;
		long id, idade, cpf;
		String titular, sobrenome, endereco;
		
		do {
			System.out.println("\n\n-----------------------------------------");
			System.out.println("\n\tBem vindo ao E-Commerce");
			System.out.println("\n-----------------------------------------");
			System.out.println("\n1: Comprar");
			System.out.println("\n2: Listar produtos disponiveis");
			System.out.println("\n3: Criar conta");
			System.out.println("\n4: Minhas informações");
			System.out.println("\n5: Atualizar minhas informações");
			System.out.println("\n6: Sair");
			System.out.println("\n-----------------------------------------");
			System.out.println("\n*Para comprar é nescessário uma conta*");
			System.out.println("\n-----------------------------------------");

			System.out.println("\nDigite a sua opção: ");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1 -> {
					System.out.println("\nDigite o ID da sua conta: ");
					id = ler.nextInt();
					
					if (contas.procurarPorNumero(id) == true) {
						do {
							System.out.println("\n\n-----------------------------------------");
							System.out.println("\n\t\tCompras");
							System.out.println("\n-----------------------------------------");
							System.out.println("\n1: Listar produtos disponiveis");
							System.out.println("\n2: Meu carrinho");
							System.out.println("\n3: Adicionar produto ao carrinho");
							System.out.println("\n4: Remover produto do carrinho");
							System.out.println("\n5: Finalizar meus pedidos");
							System.out.println("\n0: Voltar");
							System.out.println("\n-----------------------------------------");

							System.out.println("\nDigite a sua opção: ");
							opcao = ler.nextInt();

							switch (opcao) {
								case 1 -> {
									System.out.println("\n\nProdutos disponiveis: ");
									produtos.listarProdutos();
									
									System.out.println("\n-----------------------------------------");
									keyPress();
								}
					
								case 2 -> {
									System.out.println("\n\nSeu Carrinho");
									
									try {
										System.out.println("\nDigite o ID da conta:");
										id = ler.nextLong();
										
										contas.listarCarrinho(id);
																
									} catch(ArithmeticException e) {
										System.err.println(e);
										System.out.println("\nDigite um número inteiro!!");
									}
									
									keyPress();
								}
					
								case 3 -> {
									System.out.println("\n\n-----------------------------------------");
									System.out.println("\n\nAdicionar produto ao carrinho");
									
									System.out.println("\nDigite o id da sua conta:");
									id = ler.nextLong();
									
									System.out.println("\n-----------------------------------------");
									
									produtos.listarProdutos();
									
									ler.nextLine();
									
									System.out.println("\nDigite o numero do produto");
									numeroProduto = ler.nextInt();
									
									Produto item = produtos.buscarNaCollection(numeroProduto);
									
									contas.adicionar(id, item);
									
									keyPress();
								}
					
								case 4 -> {
									System.out.println("\n\n-----------------------------------------");
									System.out.println("\n\nRemover produto do carrinho");
									
									System.out.println("\nDigite o id da sua conta:");
									id = ler.nextLong();
									
									contas.listarCarrinho(id);
									
									ler.nextLine();
									
									System.out.println("\nDigite o número do produto no carrinho");
									numeroProduto = ler.nextInt();
									
									contas.remover(id, numeroProduto);
									keyPress();
								}
					
								case 5 -> {
									System.out.println("\n\n-----------------------------------------");
									System.out.println("\n\nLimpar os produtos do carrinho");
									
									System.out.println("\nDigite o id da sua conta:");
									id = ler.nextLong();
									
									contas.finalizar(id);
								}
								
								case 0 -> {
									System.out.println("\n\n-----------------------------------------");
									System.out.println("\n\n*Voltar*");
									keyPress();
									
									opcao = 0;
									break;
								}
					
								default -> {
									System.out.println("\n\nOpção inválida!");
								}
							}

						} while (opcao != 0);
						
					} else {
						break;
					}
					
					keyPress();
				}
	
				case 2 -> {
					System.out.println("\n\n-----------------------------------------");
					System.out.println("\n\nProdutos disponiveis: ");
					produtos.listarProdutos();
					
					keyPress();
				} 
	
				case 3 -> {
					System.out.println("\n\n-----------------------------------------");
					System.out.println("\n\nCriação de conta");
					
					System.out.println("\nDigite o id pra sua conta:");
					id = ler.nextLong();
					System.out.println("Obs: não o perca!!!");
					
					ler.nextLine();
					
					System.out.println("\nDigite o nome do titular:");
					titular = ler.nextLine();
					
					ler.nextLine();
					
					System.out.println("\nDigite o seu sobrenome:");
					sobrenome = ler.nextLine();
					
					ler.nextLine();
					
					System.out.println("\nDigite a sua idade:");
					idade = ler.nextLong();
					
					ler.nextLine();
					
					System.out.println("\nDigite o seu CPF:");
					cpf = ler.nextLong();
					
					ler.nextLine();
					
					System.out.println("\nDigite o seu endereço:");
					endereco = ler.nextLine();
					
					contas.cadastrar(new ContaCliente(id, titular, sobrenome, idade, cpf, endereco));
					
					keyPress();
				}
	
				case 4 -> {
					System.out.println("\n\n-----------------------------------------");
					
					try {
						System.out.println("\nDigite o ID da conta:");
						id = ler.nextLong();
						
						contas.visualizarConta(id);
												
					} catch(ArithmeticException e) {
						System.err.println(e);
						System.out.println("\nDigite um número inteiro!!");
					}
					keyPress();
				}
				
				case 5 -> {
					System.out.println("\n\n-----------------------------------------");
					System.out.println("Atualizar dados da Conta\n\n");
					
					System.out.println("Digite o ID da conta: ");
					id = ler.nextLong();
					
					var buscaConta = contas.buscarNaCollection(id);
					
					if (buscaConta != null) {
						
						ler.nextLine();
						
						System.out.println("\nDigite o novo nome do titular:");
						titular = ler.nextLine();
						
						ler.nextLine();
						
						System.out.println("\nDigite o seu novo sobrenome:");
						sobrenome = ler.nextLine();
						
						ler.nextLine();
						
						System.out.println("\nDigite a sua nova idade:");
						idade = ler.nextLong();
						
						ler.nextLine();
						
						System.out.println("\nDigite o seu novo CPF:");
						cpf = ler.nextLong();
						
						ler.nextLine();
						
						System.out.println("\nDigite o seu novo endereço:");
						endereco = ler.nextLine();
						
						contas.atualizar(new ContaCliente(id, titular, sobrenome, idade, cpf, endereco));
		
					} else {
						System.out.println("\nA conta não foi encontrada!");
					}

					keyPress();
				}
	
				case 6 -> {
					System.out.println("\n\n-----------------------------------------");
					System.out.println("\nObrigado por utilizar o nosso e-commerce <3");
					sobre();
					ler.close();
					System.exit(0);
				}
	
				default -> {
					System.out.println("\nOpção inválida!");
				}
			
			}
			
		} while (opcao != 6);

	}

	public static void sobre() {
		System.out.println("\n*****************************************");
		System.out.println("Projeto Desenvolvido por: Leonardo Duarte");
		System.out.println("Email: leonardo.r.s.duarte@gmail.com");
		System.out.println("github.com/LeoDuarte37/projeto-java");
		System.out.println("*****************************************");
	}

	public static void keyPress() {

		try {
			System.out.println("\nPressione a tecla enter para continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("\nVocê pressionou uma tecla diferente do enter!");
		}
	}

}
