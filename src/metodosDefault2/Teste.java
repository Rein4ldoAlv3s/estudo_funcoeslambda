package metodosDefault2;

import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Reinaldo", 17);
		Cliente c2 = new Cliente(2, "Hellen", 12);
		
		List<Cliente> lista = Arrays.asList(c1, c2);
		//ConsumerCliente cc = new ConsumerCliente();
		//lista.forEach(cc);

		lista.forEach( (Cliente t) -> {
			System.out.println(t.getNome());
			System.out.println(t.getDiaNasc());
		});
	}

}
