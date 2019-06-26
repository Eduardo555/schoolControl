package BdClasses;

import java.sql.Connection;
import java.sql.SQLException;

import Banco.Conexao;
import model.Materia;

public class MateriaBd {

	private Connection connection = null;
	
	public void InserirMateria(Materia materia) throws SQLException{
		
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
		
		String Querry = "INSERT INTO Materias (nome_materia, descricao) "
						+ "VALUES ('" + materia.getNome() + "', '" + materia.getDescricao() + "')";
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
