package eCommerce.controller;

import java.util.ArrayList;

import eCommerce.model.Conta;
import eCommerce.model.ContaCliente;
import eCommerce.model.Produto;
import eCommerce.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<ContaCliente> listaContas = new ArrayList<ContaCliente>();

	long id = 0;

	// Contas
	@Override
	public boolean procurarPorNumero(long numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.visualizar();
			return true;
			
		} else {
			System.out.println("\nA conta número: " + numero + " não foi encontrada!");
			return false;
		}

	}
	
	@Override
	public void visualizarConta(long id) {
		var conta = buscarNaCollection(id);

		if (conta != null) {
			conta.visualizar();
			
		} else {
			System.out.println("\nA conta número: " + id + " não foi encontrada!");
			
		}
	}
	
	@Override
	public void cadastrar(ContaCliente conta) {
		listaContas.add(conta);
		System.out.println("\nA conta ID: " + conta.getId() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(ContaCliente conta) {
		var buscaConta = buscarNaCollection(conta.getId());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA conta ID: " + conta.getId() + " foi atualizada com sucesso!");

		} else {
			System.out.println("\nA conta ID: " + conta.getId() + " não foi encontrada!");
		}

	}

	@Override
	public void deletar(long id) {
		var conta = buscarNaCollection(id);

		if (conta != null) {
			if (listaContas.remove(conta) == true) {
				System.out.println("\nA conta número: " + id + " foi deletada com sucesso!");

			} else {
				System.out.println("\nA conta número: " + id + " não foi encontrada!");
			}
		}

	}
	
	public ContaCliente buscarNaCollection(long id) {
		for (var conta : listaContas) {
			if (conta.getId() == id) {
				return conta;
			}
		}

		return null;
	}
	
	// Carrinhos
	@Override
	public void listarCarrinho(long id) {
		var conta = buscarNaCollection(id);

		if (conta != null) {
			conta.listarItens();
			
		} else {
			System.out.println("\nA conta: " + conta + " está com o carrinho vazio!");
		}
	
		
		System.out.println("\n-----------------------------------------");
	}
	
	
	@Override
	public void adicionar(long id, Produto produto) {
		var conta = buscarNaCollection(id);
		
		if (conta != null) {
			conta.adicionarItem(produto);
			System.out.println("\nO produto: " + produto.getNome() + " foi adicionado com sucesso!");
			
		} else {
			System.out.println("\nConta não encontrada!");
		}
	}
		
	
	@Override
	public void remover(long id, int indexCarrinho) {
		var conta = buscarNaCollection(id);

		if (conta != null) {
			conta.removerItem(indexCarrinho);
			System.out.println("\nO item " + indexCarrinho + " foi deletado com sucesso!");

		} else {
			System.out.println("\nO item " + indexCarrinho + " não foi encontrado no carrinho!");
		}
	}
	
	
	@Override
	public void finalizar(long id) {
		var conta = buscarNaCollection(id);
		
		if (conta != null) {
			conta.finalizarCarrinho();
			System.out.println("\nCarrinho limpo!");
			
		} else {
			System.out.println("\nConta não encontrada!");
		}
	}
	

}
