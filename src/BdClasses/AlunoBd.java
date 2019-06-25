package BdClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Banco.Conexao;
import model.Aluno;

public class AlunoBd {
	
	private Connection connection = null;
	
	public void AlunoDb() {
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
	}
	
	public void inserirAlunos(Aluno aluno) throws SQLException {
		//adicionados o insert aluno
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
		
		String sql = "insert into Alunos (nome_aluno,data_nascimento,sexo,cor,data_matricula) values('"+aluno.getNome().toString()+
					 "','"+aluno.getDataNascimento().toString()+"',"+aluno.getSexo()+","+aluno.getCor()+","+aluno.getDataMatricula()+")";
		try {
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute(sql);
		System.out.println("certo");
		}catch(Exception ex) {
			System.out.println("Deu ruim: "+ex);
		}
		
	}
	
	private ArrayList<Aluno> buscaAlunos() throws SQLException{
		String sql = "select * from Alunos";		
		ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
		Aluno aluno = new Aluno();
		
		Statement statement = (Statement) connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			aluno.setNome(rs.getString("nome_aluno"));
			aluno.setDataNascimento(rs.getString("data_nascimento"));
			lista_alunos.add(aluno);
		}
		
		return lista_alunos;
	}

}
