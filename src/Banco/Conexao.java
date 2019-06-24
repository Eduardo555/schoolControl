package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String host = "192.168.99.100";
	private String banco = "School";
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
			System.out.println("Erro ao realizar conexão!");
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
	
	
}
