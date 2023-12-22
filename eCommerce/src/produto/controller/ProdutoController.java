package produto.controller;

import java.util.ArrayList;
import eCommerce.produtos.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList <Produto> produtos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void adicionar(Produto produto) {
		produtos.add(produto);
		System.out.println("\nO produto: " + produto.getNumero() + " foi adicionado com sucesso!");
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (produtos.remove(produto) == true) {
				System.out.println("\nO produto numero: " + numero + " foi deletada com sucesso!");

			} else {
				System.out.println("\nO produto numero: " + numero + " não foi encontrada!");
			}
		}
	}
	
	public void listarProdutos() {
		for (var produto : produtos) {
			produto.visualizar();
		}
	}
	
	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int numero) {
		for (var produto : produtos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}

		return null;
	}

}
