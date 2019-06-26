package BdClasses;

import java.sql.Connection;

import Banco.Conexao;

public class TurmasBd {
	
	private Connection connection = null;
	
	public TurmasBd() {
		Conexao conn = new Conexao();
		
		connection = conn.getConexao();
	}
	
	public void inserirTurma() {
		
	}

}
