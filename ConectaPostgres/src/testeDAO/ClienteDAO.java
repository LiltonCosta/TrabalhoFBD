package testeDAO;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import teste.Cliente;

public class ClienteDAO {
	Scanner scan = new Scanner(System.in);
	private Connection con = Conecta.criarConexao();
	
	public void cadastrarPessoa(Cliente pessoa){
        String sql = "insert into pessoa (nome,cpf,telefone, endereco)"
                + " values (?,?,?,?)";
        Connection con = null;
        PreparedStatement prep = null;
        
        try {
        	con = Conecta.criarConexao();
            prep = con.prepareStatement(sql);
            prep.setString(1, pessoa.getNome());
            prep.setString(2, pessoa.getCpf());
            prep.setString(3, pessoa.getTelefone());
            prep.setString(4, pessoa.getEnd());
            prep.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (prep != null) {
                    prep.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	 public Cliente buscarPorCpf(String cpf){
	        String sql = "select * from usuario where cpf = ?";
	        Connection con = null;
	        PreparedStatement prep = null;
	        ResultSet rset = null;
	        Cliente pessoa = null;
	        try{
	            con = Conecta.criarConexao();
	            prep = con.prepareStatement(sql);
	            prep.setString(1, cpf);
	            rset = prep.executeQuery();
	            while(rset.next()){
	                pessoa = new Cliente();
	                pessoa.setCpf(rset.getString("cpf"));
	                pessoa.setNome(rset.getString("nome"));
	                
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(rset!=null){
	                    rset.close();
	                }
	                if(prep!=null){
	                    prep.close();
	                }
	                if(con!=null){
	                    con.close();
	                }
	            }catch(SQLException e){
	                e.printStackTrace();
	            }
	        }
	        return pessoa;
	    }
	  public ArrayList<Cliente> buscarPorNome(String nome){
	        String sql = "select * from pessoa where nome = ?";
	        Connection con = null;
	        PreparedStatement prep = null;
	        ResultSet rset = null;
	        ArrayList<Cliente> pessoas = new ArrayList<Cliente>();
	        try{
	        	 con = Conecta.criarConexao();
	            prep = con.prepareStatement(sql);
	            prep.setString(1, nome);
	            rset = prep.executeQuery();
	            while(rset.next()){
	                Cliente pessoa = new Cliente();
	                pessoa.setCpf(rset.getString("cpf"));
	                pessoa.setNome(rset.getString("nome"));
	                pessoas.add(pessoa);
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(rset != null){
	                    rset.close();
	                }
	                if(prep != null){
	                    prep.close();
	                }
	                if(con != null){
	                    con.close();
	                }
	            }catch(SQLException e){
	                e.printStackTrace();
	            }
	        }
	        return pessoas;
	    }
	    
	    public ArrayList<Cliente> listar(){
	        String sql = "select * from pessoa";
	        Connection con = null;
	        PreparedStatement prep = null;
	        ResultSet rset = null;
	        ArrayList<Cliente> pessoas = new ArrayList<>();
	        try{
	        	 con = Conecta.criarConexao();
	            prep = con.prepareStatement(sql);
	            rset = prep.executeQuery();
	            while(rset.next()){
	                Cliente pessoa = new Cliente();
	                pessoa.setCpf(rset.getString("cpf"));
	                pessoa.setNome(rset.getString("nome"));
	                pessoas.add(pessoa);
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(rset!=null){
	                    rset.close();
	                }
	                if(prep!=null){
	                    prep.close();
	                }
	                if(con!=null){
	                    con.close();
	                }
	            }catch(SQLException e){
	                e.printStackTrace();
	            }
	        }
	        return pessoas;
	    }
	    
	    public void deletarPessoaPorCpf(String cpf){
	        String sql = "delete from pessoa where cpf = ?";
	        Connection con = null;
	        PreparedStatement prep = null;
	        try{
	        	 con = Conecta.criarConexao();
	            prep = con.prepareStatement(sql);
	            prep.setString(1, cpf);
	            prep.execute();
	        }catch(SQLException e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(prep!=null){
	                    prep.close();
	                }
	                if(con!=null){
	                    con.close();
	                }
	            }catch(SQLException e){
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    public void atualizarNomePorCpf(String nome, String cpf){
	        String sql = "update pessoa set nome = ? where cpf = ?";
	        Connection con = null;
	        PreparedStatement prep = null;
	        try{
	        	 con = Conecta.criarConexao();
	            prep = con.prepareStatement(sql);
	            prep.setString(1, nome);
	            prep.setString(2, cpf);
	            prep.execute();
	        }catch(SQLException e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(prep!=null){
	                    prep.close();
	                }
	                if(con!=null){
	                    con.close();
	                }
	            }catch(SQLException e){
	                e.printStackTrace();
	            }
	        }
	    }
}
