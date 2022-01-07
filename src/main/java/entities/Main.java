package entities;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(new Cliente("Karla"));
		Conta cp = new ContaPoupanca(new Cliente("Julia"));
		List<Conta> contas = new LinkedList<>();
		contas.add(cp);
		contas.add(cc);

		cc.depositar(100);
		cc.transferir(80, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		System.out.println("\n=-=-=- CADASTRO DE CLIENTES =-=-=-");
		Banco banco = new Banco();
		banco.setContas(contas);
		banco.getClientes();

	}
}
