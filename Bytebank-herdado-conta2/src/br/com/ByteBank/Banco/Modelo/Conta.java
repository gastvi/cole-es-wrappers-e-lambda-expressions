package br.com.ByteBank.Banco.Modelo;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		total++;
		System.out.println(total + "º conta criada");
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou crinado uma conta com a agencia:" + agencia + " e com o numero:" + numero);
	}

	public abstract void depositar(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new ExcecaoDeSaldoInsuficiente(
					"saldo:" + this.saldo + ", valor a sacar:" + valor + ", logo nao foi possivel sacar");
		}
		this.saldo -= valor;
		System.out.println("saque feito com sucesso.");
		System.out.println("saldo atual:"+this.saldo);
	}

	public void transferir(double valor, Conta destino) {
		this.saca(valor);
		destino.depositar(valor);

	}
	
	@Override
	public String toString() {
	    return "Numero: " + this.numero + ", Agencia: " + this.agencia; 
	}
	
	
	@Override
	public boolean equals(Object ref){

	    Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}
	
	
	@Override
	public int compareTo(Conta outra) {
	        return Double.compare(this.saldo, outra.saldo);
	}
	
	

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
}