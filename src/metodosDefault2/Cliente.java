package metodosDefault2;

public class Cliente {

	private Integer id;
	private String nome;
	private Integer diaNasc;
	
	public Cliente() {
		super();
	}
	
	public Cliente(Integer id, String nome, Integer diaNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.diaNasc = diaNasc;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getDiaNasc() {
		return diaNasc;
	}
	
	public void setDiaNasc(Integer diaNasc) {
		this.diaNasc = diaNasc;
	}
	
	
}
