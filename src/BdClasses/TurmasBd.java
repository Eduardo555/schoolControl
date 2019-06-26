package BdClasses;

import java.sql.Connection;

import Banco.Conexao;
import model.Turma;

public class TurmasBd {
	
	private Connection connection = null;
	
	public TurmasBd() {
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
	}
	
	public void inserirTurma(Turma turma) {
		
		//adicionados o insert turma
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
		
		String sql = "insert into Turmas(cod_turma,cod_aluno,cod_materia,cod_professor) values("+turma.getCodTurma()+","+turma.getCodAluno()+
					 ","+turma.getCodMateria()+","+turma.getCodProfessor()+")";
		try {
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute(sql);
		System.out.println("certo");
		conn.fechaConexao();
		}catch(Exception ex) {
			System.out.println("Deu ruim: "+ex);
		}
		
	}

}
