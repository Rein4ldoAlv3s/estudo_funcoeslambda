package metodosDefault3;

public class Cliente {

	private String nome;
	private String logradouro;
	private Integer idade;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String logradouro, Integer idade) {
		super();
		this.nome = nome;
		this.logradouro = logradouro;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
	
	
}
