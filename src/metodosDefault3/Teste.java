package metodosDefault3;

import java.util.Arrays;
import java.util.List;

public class Teste {
	public static void main(String [] args) {
		Cliente c1 = new Cliente("Reinaldo", "Av Padre Wendel", 21);
		Cliente c2 = new Cliente("João", "Av Anhanguera", 25);
		
		List<Cliente> lista = Arrays.asList(c1,c2);
		
		lista.forEach((Cliente c) -> System.out.println(c.getNome()));
		
		
	}
}
