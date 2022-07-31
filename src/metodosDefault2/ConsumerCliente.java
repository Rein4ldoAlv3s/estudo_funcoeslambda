package metodosDefault2;

import java.util.function.Consumer;

public class ConsumerCliente implements Consumer<Cliente>{

	@Override
	public void accept(Cliente t) {
		System.out.println(t.getNome());
		System.out.println(t.getDiaNasc());
		
	}

	
	

}
