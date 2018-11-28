package Principal;

import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;
import teste.Cliente;
import testeDAO.ClienteDAO;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ClienteDAO clientedao = new ClienteDAO();
		Cliente cliente = null;
		boolean sair = false;
		String nome;
		String cpf;
		String data;
		String telefone;
		String endereco;
		
		while (!sair) {
			System.out.print("Informeum comando>> ");
			int opcao = scan.nextInt();
			scan.nextLine();
			
			switch (opcao) {
			case 0: 
				sair = true; 
			break;
			case 1: clientedao.cadastrarPessoa(cliente); 
				
			break;
			case 2: System.out.println("CPF : ");
					cpf = scan.nextLine();
					if(clientedao.buscarPorCpf(cpf).equals(cpf)) {
						System.out.println("" + cpf);
					}else {
						System.out.println("cpf nao encontrado");
					}
					break;
			case 3: System.out.println(" " + clientedao.listar()); 
				break;
				
				
				
			}
		}
	}

}
