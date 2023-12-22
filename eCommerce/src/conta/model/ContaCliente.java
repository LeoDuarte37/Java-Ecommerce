package conta.model;

import java.util.ArrayList;

import eCommerce.produtos.Produto;

public class ContaCliente extends Conta {
	
	// Atributos
	private String sobrenome, endereco;
	private long cpf, idade;
	
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
		System.out.println("\n**********************************************");
	}
	
	public void listarCarrinho() {
		
	}
	
	public void adicionarItemCarrinho(Produto produto) {
		
	}
	
	public void removerItemCarrinho(String nome) {
		
	}
	
	public void finalizarCarrinho(Produto produto) {
		
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
