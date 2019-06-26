package BdClasses;

import java.sql.Connection;
import java.sql.SQLException;

import Banco.Conexao;
import model.Professor;

public class ProfessorBd {

	private Connection connection = null;
	
	public void InserirProfessor(Professor professor) throws SQLException{
		
		Conexao conn = new Conexao();	
		connection = conn.getConexao();
		
		String Querry = "INSERT INTO Professores (nome, cod_materia, data_nascimento, data_admissao, grau_escolaridade, email, sexo, telefone) "
						+ "VALUES ('"+professor.getNome()+"', '"+professor.getMateria()+"', '"+professor.getDataNascimento()+"', '"+professor.getDataAdmissao()+"', '"+professor.getGrauEscolaridade()+"', '"+professor.getEmail()+"', '"+professor.getSexo()+"', '"+professor.getTelefone()+"')";
		try 
		{
			java.sql.PreparedStatement statement = connection.prepareStatement(Querry);
			statement.execute(Querry);
			System.out.println("Salvo comsucesso!");
		}
		catch (Exception e) {
			System.out.println("Treta: "+e);
		}
	}
	
	
	
	
}
