package metodosDefault;

public class Pessoa implements Autentica{

	private String nome;
	private boolean status;
	private String senha;
	private int pontos;
	
	public Pessoa(String nome, boolean status, String senha, int pontos) {
		super();
		this.nome = nome;
		this.status = status;
		this.senha = senha;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public boolean isStatus() {
		return status;
	}

	public String getSenha() {
		return senha;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public boolean autenticaSenha(String senha) {
		if(this.senha != senha) {
			System.out.println("Não autenticado!");
			return false;
		}
		System.out.println("Autenticado!");
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", status=" + status + ", senha=" + senha + ", pontos=" + pontos + "]";
	}
	
	
	
}
