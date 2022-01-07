package entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	@Override
	public void sacar(double valor) {

		if (this.saldo >= valor) {
			saldo -= valor;
		} else {
			System.err.println("Saldo insuficiente!");
		}

	}

	@Override
	public void depositar(double valor) {

		if (valor >= 0) {
			saldo += valor;
		} else {
			System.err.println("Valor inv�lido!");
		}

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {

		if (valor >= 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.err.println("Valor inv�lido!");
		}

	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		// System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
	}

}
