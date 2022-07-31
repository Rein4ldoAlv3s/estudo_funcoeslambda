package metodosDefault;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TesteStream {

	public static void main(String [] args) {
		Cliente c1 = new Cliente("michelli", true, "123", 5);
		Cliente c2 = new Cliente("maria", true, "456", 10);
		Cliente c3 = new Cliente("josé", true, "789", 20);
		
		List<Cliente> clientes = Arrays.asList(c1,c2,c3);
		
		clientes.forEach(c -> System.out.println(c.getPontos()));
		
		Stream<Cliente> stream = clientes.stream().filter(c -> c.getPontos() > 5);
		
		Stream<Integer> stream1 = clientes.stream().map(c -> c.getPontos());	
	}
}
