package eCommerce.produtos;

public class Produto {

	// Atributos
	private String nome;
	private float valor;

	// Construtor
	public Produto(String nome, float valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	// Métodos
	public void visualizar() {
		System.out.println("\n**********************************************");
		System.out.println("Nome: " + this.nome + " - Valor: " + this.valor);
		System.out.println("\n");
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
