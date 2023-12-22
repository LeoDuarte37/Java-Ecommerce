package conta.repository;

import conta.model.Conta;
import eCommerce.produtos.Produto;

public interface ContaRepository {

	// CRUD da Conta
	public void cadastrar(Conta conta);

	public void atualizar(Conta conta);

	public void deletar(long id);

	
}
