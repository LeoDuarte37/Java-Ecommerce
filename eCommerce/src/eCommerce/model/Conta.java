package eCommerce.model;

public abstract class Conta {
	
	// Atributos
	private long id;
	private String titular;
	
	// Construtor
	public Conta(long id, String titular) {
		super();
		this.id = id;
		this.titular = titular;
	}
	
	// Métodos
	public void visualizar() {
		System.out.println("\n\n-----------------------------------------");
		System.out.println("\n\t\tDados da Conta:");
		System.out.println("\n-----------------------------------------");
		System.out.println("ID da conta: " + this.id);
		System.out.println("Titular: " + this.titular);
	}

	// Getters and Setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
