package eCommerce;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int opcao;
		
		do {
			System.out.println("\tBem vindo ao E-Commerce");
			System.out.println("\n-------------------------------");
			System.out.println("\n1: Comprar");
			System.out.println("\n2: Listar produtos disponiveis");
			System.out.println("\n3: Criar conta");
			System.out.println("\n4: Minhas informações");
			System.out.println("\n5: Atualizar minhas informações");
			System.out.println("\n6: Sair");
			System.out.println("\n-------------------------------");
			System.out.println("\n*Para comprar é nescessário uma conta*");
			System.out.println("\n-------------------------------");

			System.out.println("\nDigite a sua opção: ");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1 -> {
					System.out.println("\nDigite o ID da sua conta: ");
					
					if (id) {
						do {
							System.out.println("\tCompras");
							System.out.println("\n-------------------------------");
							System.out.println("\n1: Listar produtos disponiveis");
							System.out.println("\n2: Meu carrinho");
							System.out.println("\n3: Adicionar produto ao carrinho");
							System.out.println("\n4: Finalizar meus pedidos");
							System.out.println("\n5: Voltar");
							System.out.println("\n-------------------------------");

							System.out.println("\nDigite a sua opção: ");
							opcao = ler.nextInt();

							switch (opcao) {
								case 1 -> {
					
									keyPress();
								}
					
								case 2 -> {
					
									keyPress();
								}
					
								case 3 -> {
					
									keyPress();
								}
					
								case 4 -> {
					
									keyPress();
								}
					
								case 5 -> {
									System.out.println("\n*Voltar*");
									keyPress();
									
									break;
								}
					
								default -> {
									System.out.println("\nOpção inválida!");
								}
							}

						} while (opcao != 5);
						
					} else {
						System.out.println("\nEssa conta não existe");
						break;
					}
					
					keyPress();
				}
	
				case 2 -> {
					System.out.println("\nProdutos disponiveis: ");
					
					keyPress();
				}
	
				case 3 -> {
					System.out.println("\nCriar conta");
					
					keyPress();
				}
	
				case 4 -> {
					System.out.println("\nMinhas informações");
					keyPress();
				}
				
				case 5 -> {
					System.out.println("\nAtualizar minhas informações");
					keyPress();
				}
	
				case 6 -> {
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
