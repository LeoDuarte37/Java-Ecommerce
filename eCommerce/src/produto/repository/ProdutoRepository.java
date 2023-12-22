package produto.repository;

import eCommerce.produtos.Produto;

public interface ProdutoRepository {
	
	public void adicionar(Produto produto);
	
	public void deletar(int numero);
}
