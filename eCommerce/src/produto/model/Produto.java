package produto.model;

public class Produto {

	// Atributos
	private int numero;
	private String nome;
	private float valor;

	// Construtor
	public Produto(int numero, String nome, float valor) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.valor = valor;
	}

	// Métodos
	public void visualizar() {
		System.out.println("\n\n-----------------------------------------");
		System.out.println("\n" + numero + " - Nome: " + this.nome + " - Valor: " + this.valor);
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

	public long getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
