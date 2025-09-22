package conta_bancaria.model;

public class Conta {
	
	// Atributos da Classe
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Métodos Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Métodos Get e Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	// Método sacar
	public boolean sacar(float valor) {
		if(this.saldo < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		
		this.saldo = this.saldo - valor;
		return true;
	}
	
	// Método depositar
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	// Método para visualizar todos os dados da Conta
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1 -> tipo = "Conta Corrente";
		case 2 -> tipo = "Conta Poupança";
		default -> tipo = "Desconhecido";			
		}
		
		System.out.println("\n*****************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("*****************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Numero da Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo da Conta: " + this.saldo);
	}
}