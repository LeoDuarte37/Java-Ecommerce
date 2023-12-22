package eCommerce;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\tMenu E-Commerce");
			System.out.println("\n-------------------------------");
			System.out.println("\n1: Listar produtos disponiveis");
			System.out.println("\n2: Meu carrinho");
			System.out.println("\n3: Adicionar produto ao carrinho");
			System.out.println("\n4: Finalizar meus pedidos");
			System.out.println("\n5: Minhas informações");
			System.out.println("\n6: Atualizar minhas informações");
			System.out.println("\n7: Sair");
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
	
					keyPress();
				}
	
				case 6 -> {
	
					keyPress();
				}
	
				case 7 -> {
					System.out.println("\nObrigado por utilizar o nosso e-commerce <3");
					sobre();
					ler.close();
					System.exit(0);
				}
	
				default -> {
					System.out.println("\nOpção inválida!");
				}
			}

		} while (opcao != 7);

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
