package metodosDefault4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteExec {

	public static void main(String[] args) {
		//Criação dos objetos
//		Pessoa p1 = new Pessoa("Reinaldo", 21, 1.78f);
//		Pessoa p2 = new Pessoa("Michelli", 26, 1.58f);
//		Pessoa p3 = new Pessoa("Karol", 23, 1.60f);
//		
//		//Converte os objetos do tipo Pessoa em uma lista
//		List<Pessoa> pessoas = Arrays.asList(p1,p2,p3);
//		
//		//Imprime a lista de pessoas e pula uma linha
//		pessoas.forEach(pessoa -> System.out.println(pessoa));
//		System.out.println();
//		
//		//Converte a lista em stream e filtra com a idade maior que 21. Logo dps, transforma em List
//		pessoas = pessoas.stream().filter(pessoa -> pessoa.getIdade() > 21).collect(Collectors.toList());
//		
//		pessoas.forEach(p -> System.out.println(p));
		
		
		Pessoa p1 = new Pessoa("Reinaldo", 21, 1.78f);
		Pessoa p2 = new Pessoa("Michelli", 26, 1.58f);
		Pessoa p3 = new Pessoa("Karol", 20, 1.60f);
		Pessoa p4 = new Pessoa("Joao", 19, 1.64f);
		Pessoa p5 = new Pessoa("Loiane", 22, 1.80f);
		Pessoa p6 = new Pessoa("Augusto", 21, 1.78f);
		Pessoa p7 = new Pessoa("Silvio", 25, 1.73f);
		Pessoa p8 = new Pessoa("Silvioo", 25, 1.73f);
		
		List<Pessoa> pessoas = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
		List<Pessoa> pessoasFiltradas = pessoas.stream().filter(p -> p.getIdade() > 21).collect(Collectors.toList());
		pessoasFiltradas.forEach(p -> System.out.println(p));
	}

}
