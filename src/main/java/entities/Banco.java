package entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	
	public void getClientes() {
		 for(Conta conta : contas) {
			 System.out.println(conta.getCliente().getNome());
		 }
	}
	
}
