package BdClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Banco.Conexao;
import model.Aluno;

public class AlunoBd {
	
	private Connection connection = new Conexao().getConexao();
	
	public void AlunoDb() {
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
	}
	
	public void inserirAlunos(Aluno aluno) throws SQLException {
		//adicionados o insert aluno
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
		
		String sql = "insert into Alunos (nome_aluno,data_nascimento,sexo,cor,data_matricula,status,desligamento,data_desligamento) values('"+aluno.getNome().toString()+
					 "','"+aluno.getDataNascimento().toString()+"','"+aluno.getSexo()+"','"+aluno.getCor()+"','"+aluno.getDataMatricula()+"',"+
					 "'"+aluno.getStatus()+"','"+aluno.getDesligamento()+"','"+aluno.getDataDesligamento()+"')";
		try {
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute(sql);
		System.out.println("certo");
		conn.fechaConexao();
		}catch(Exception ex) {
			System.out.println("Deu ruim: "+ex);
		}
		
	}
	
	public ArrayList<Aluno> buscaAlunos() throws SQLException{
		String sql = "select * from Alunos";		
		ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
		Aluno aluno = new Aluno();
		
		Statement statement = (Statement) connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			aluno.setNome(rs.getString("nome_aluno"));
			aluno.setDataNascimento(rs.getString("data_nascimento"));
			aluno.setSexo(rs.getString("sexo"));
			aluno.setCor(rs.getString("cor"));
			aluno.setDataMatricula(rs.getString("data_matricula"));
			aluno.setStatus(rs.getString("status"));
			aluno.setDesligamento(rs.getString("desligamento"));
			aluno.setDataDesligamento(rs.getString("data_desligamento"));
			lista_alunos.add(aluno);
		}

		
		return lista_alunos;
	}

}
