package metodosDefault;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TesteStream {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("michelli", true, "123", 5);
		Cliente c2 = new Cliente("maria", true, "456", 10);
		Cliente c3 = new Cliente("josé", true, "789", 20);

		List<Cliente> clientes = Arrays.asList(c1, c2, c3);

		// Impressão da lista original
		clientes.forEach(c -> System.out.println(c));
		System.out.println();

		// Streams são utilizadas apenas para realizar operações lógicas com List<>
		// Stream<Cliente> stream = clientes.stream().filter(c -> c.getPontos() > 5);

		// Agora, para eu modificar essa List, para deixa-la apenas com os objetos de
		// pontos maior que 5, devo utilizar o Collectors
//		List<Cliente> pontosMaiorCinco = stream.collect(Collectors.toList());
//		
//		//Impressão da lista modificada
//		pontosMaiorCinco.forEach(p -> {
//			System.out.println(p.getNome());
//			System.out.println(p.isStatus());
//			System.out.println(p.getSenha());
//			System.out.println(p.getPontos() + " \n");
//			System.out.println(p);
//		});

		// Forma simplificada de modificar uma List usando Stream e Collectors
		List<Cliente> stream = clientes.stream().filter(c -> c.getPontos() > 5).collect(Collectors.toList());
		//É possível transformar uma list em um set ou Iterator
		Set<Cliente> stream2 = clientes.stream().filter(c -> c.getPontos() > 5).collect(Collectors.toSet());
		stream.forEach(c -> System.out.println(c));
	}
}
