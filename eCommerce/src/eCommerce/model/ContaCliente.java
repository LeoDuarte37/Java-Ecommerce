package eCommerce.model;

import java.util.ArrayList;

public class ContaCliente extends Conta {
	
	// Atributos
	private String sobrenome, endereco;
	private long cpf, idade;
	
	
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	
	// Construtor
	public ContaCliente(long id, String titular, String sobrenome, long idade, long cpf, String endereco) {
		super(id, titular);
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	// Métodos
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("-----------------------------------------");
	}
	
	public void listarItens() {
		System.out.println("\n\n-----------------------------------------");
		for (Produto item : carrinho) {
			System.out.println("\n" + item.getNumero() + " - " + item.getNome() + " R$" + item.getValor());

		}
		
	}
	
	
	
	public void finalizarCarrinho() {
		carrinho.clear();
	}
	
	public void adicionarItem(Produto produto) {
		carrinho.add(produto);
	}
	
	public void removerItem(int index) {
		carrinho.remove(index);
	}

	// Getters and Setters
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

			
	
}
