package metodosDefault;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Teste {
	public static void main(String [] args) {
		Cliente c1 = new Cliente("michelli", true, "123");
		Cliente c2 = new Cliente("reinaldo", true, "456");
		c1.autenticaSenha("123");
		c2.autenticaSenha("852");
		
		//listar com Interface Funcional (Funcao Lambda)
		List<Cliente> clientes = Arrays.asList(c1,c2);
		
		clientes.forEach(c -> System.out.println(c.getNome()));
		
		//listar com classe anonima
//		List<Cliente> clientes = Arrays.asList(c1, c2);
//		Consumer<Cliente> consumidor = new Consumer<Cliente>() {
//			public void accept(Cliente c) {
//				System.out.println(c.getNome());
//			}
//		}; 
//		clientes.forEach(consumidor);
		
		//listar com forEach
//		List<Cliente> clientes = Arrays.asList(c1, c2);
//		MostraCliente mc = new MostraCliente();
//		clientes.forEach(mc);
	
//		List<Cliente> clientes = Arrays.asList(c1, c2);
//		
//		clientes.forEach((Cliente c) -> {
//			System.out.println(c.getNome());
//			System.out.println(c.isStatus());
//			System.out.println(c.getSenha());
//			System.out.println(c.autenticaSenha(c.getSenha()));
//		});
		
		
	}
}
