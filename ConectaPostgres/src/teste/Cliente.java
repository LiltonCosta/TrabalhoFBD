package teste;



public class Cliente {
	private int id;
	private String cpf;
	private String nome;
	private String telefone;
	private String end;
	
	
	public Cliente() {
		
	}
	
	
	public Cliente( String nome, String cpf , String telefone, String end) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.end = end;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", end=" + end
				+ "]";
	}
	


	
}
