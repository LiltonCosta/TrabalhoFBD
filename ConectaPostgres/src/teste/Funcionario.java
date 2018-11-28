package teste;

import java.sql.Date;
import javax.xml.crypto.Data;

public class Funcionario {
	private int id_func;
	private String nome;
	private String cpf;
	private String end;
	private Date data_nasc;
	private int id_trem;

	public Funcionario(int id_func, String nome, String cpf, String end, Date data_nasc, int id_trem) {
		super();
		this.id_func = id_func;
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		this.data_nasc = data_nasc;
		this.id_trem = id_trem;
	}

	public Funcionario(int id_func, String nome, String cpf, String end, int id_trem) {
		super();
		this.id_func = id_func;
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		// this.data_nasc = data_nasc;
		this.id_trem = id_trem;
	}

	public int getId_func() {
		return id_func;
	}

	public void setId_func(int id_func) {
		this.id_func = id_func;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public int getId_trem() {
		return id_trem;
	}

	public void setId_trem(int id_trem) {
		this.id_trem = id_trem;
	}

	@Override
	public String toString() {
		return "Funcionario [id_func=" + id_func + ", nome=" + nome + ", cpf=" + cpf + ", end=" + end + ", data_nasc="
				+ data_nasc + ", id_trem=" + id_trem + "]";
	}

}
