package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import model.Aluno;

public class Conexao {

	private String host = "192.168.99.100";
	//private String host = "localhost";
	private String banco = "SchoolControl";
	private String usuario = "root";
	private String senha = "password";
	private String url = "jdbc:mysql://"+host+"/"+banco;
	private Connection connection = null;
	
	
	public Connection getConexao() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, usuario, senha);
			
		}catch (Exception ex) {
			System.out.println("Erro:"+ex.getMessage());
		}
		if(connection != null) {
			System.out.println("Conectado!");
		} else {
			System.out.println("Erro ao realizar conex�o!");
		}
		
		return connection;
	}
	
	public boolean fechaConexao() {
		try {
			connection.close();
			return true;
		} catch (Exception ex) {
			System.out.println("Erro:"+ex.getMessage());
		}
		return false;
	}
	
	public void inserir(Aluno aluno) throws SQLException {
		String sql = "insert into Alunos (nome_aluno,data_nascimento) values('"+aluno.getNome().toString()+"','"+aluno.getDataNascimento().toString()+"')";
		try {
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		//Statement statement = (Statement) connection.createStatement();
		statement.execute(sql);
		System.out.println("certo");
		}catch(Exception ex) {
			System.out.println("Deu ruim: "+ex);
		}
		
	}
	
	
}
