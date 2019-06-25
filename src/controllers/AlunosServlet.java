package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BdClasses.AlunoBd;
import model.Aluno;

@WebServlet(urlPatterns = "/SalvarAlunos")
public class AlunosServlet extends HttpServlet{
	
	Aluno aluno = new Aluno();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Monta objeto aluno em memoria conforme o form.
		MontarAluno(req);
		
		// Salva novo.

		if(req.getParameter("TxtCodigo") == "") {
			try {
				SalvarNovoAluno();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else {
			AtualizarAluno();
		}
		
	}
	
	private void MontarAluno(HttpServletRequest req) {
		// pegar atributos e monstar objeto.
				
				aluno.setNome(req.getParameter("TxtNome"));
				aluno.setDataNascimento(req.getParameter("TxtDataNascimento"));
				aluno.setSexo(req.getParameter("TxtSexo"));
				aluno.setCor(req.getParameter("TxtCor"));
				aluno.setDataMatricula(req.getParameter("TxtDataMatricula"));
				aluno.setStatus(req.getParameter("TxtStatus"));
				aluno.setDesligamento(req.getParameter("TxtMotivoDesligamento"));
				aluno.setDataDesligamento(req.getParameter("TxtDataDesligamento"));
	}
	
	private void SalvarNovoAluno() throws SQLException {
		// Realizar Insert.
		AlunoBd bd = new AlunoBd();
		bd.inserirAlunos(aluno);
		
	}
	
	private void AtualizarAluno() {
		// Buscar correspondete pelo id no banco de dados.
		// Alterar para o presente no form.
		// Realizar update.
	}
	
}
