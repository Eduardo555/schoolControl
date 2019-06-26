package BdClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Banco.Conexao;
import model.Aluno;
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
	
	public ArrayList<Materia> CarregarComboboxMaterias() throws SQLException{
		
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
		
		String sql = "SELECT *FROM Materias";
		ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
		Materia materia = new Materia();
		
		Statement statement = (Statement) connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		
		while (rs.next()) {
			materia.setCodMateria(Integer.parseInt(rs.getString("cod_materia")));
			materia.setDescricao(rs.getString("descricao"));
			materia.setNome(rs.getString("nome_materia"));
			listaMaterias.add(materia);
		}
		return listaMaterias;
	}
	
}
