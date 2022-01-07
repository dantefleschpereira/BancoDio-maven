package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n-=-=-= Extrato Conta Corrente =-=-=-");
		imprimirInfosComuns();

	}

}
