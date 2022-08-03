package metodosDefault;

import java.util.function.Consumer;

public class MostraCliente implements Consumer<Pessoa>{

	@Override
	public void accept(Pessoa c) {
		System.out.println(c.getNome());
		System.out.println(c.getSenha());
	}
}
