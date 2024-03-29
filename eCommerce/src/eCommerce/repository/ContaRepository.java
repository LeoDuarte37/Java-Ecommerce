package eCommerce.repository;

import eCommerce.model.Conta;
import eCommerce.model.ContaCliente;
import eCommerce.model.Produto;

public interface ContaRepository {

	// CRUD da Conta
	public void cadastrar(ContaCliente conta);
	
	public void visualizarConta(long id);

	public void atualizar(ContaCliente conta);

	public boolean procurarPorNumero(long id);
	
	public void deletar(long id);
	
	// Métodos carrinho
	public void remover(long id, int index);
	
	public void adicionar(long id, Produto produto);
	
	public void listarCarrinho(long id);
	
	public void finalizar(long id);
	
	
	
}
