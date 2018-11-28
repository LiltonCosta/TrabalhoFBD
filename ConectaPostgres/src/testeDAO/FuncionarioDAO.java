package testeDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import teste.Funcionario;

public class FuncionarioDAO {
	private Connection con =  Conecta.criarConexao();
	
	public boolean cadastrarFuncionario(Funcionario fuc) {
	String sql = "insert into  funcionario ( nome, cpf, end) values (?, ?, ?)";
	try {
		PreparedStatement prep = con.prepareStatement(sql);
			prep.setString(1, fuc.getNome());
			prep.setString(2, fuc.getCpf());
			prep.setString(3,fuc.getEnd());
			
			prep.execute();
			prep.close();
			
			return true;
			
	}catch(SQLException e){
		System.out.println(e.getMessage());
	}
	return false;
  }
}
