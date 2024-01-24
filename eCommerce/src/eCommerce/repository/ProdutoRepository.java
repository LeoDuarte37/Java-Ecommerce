package eCommerce.repository;

import eCommerce.model.Produto;

public interface ProdutoRepository {
	
	public void adicionar(Produto produto);
	
	public void deletar(int numero);
}
