package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BdClasses.MateriaBd;
import model.Materia;

@WebServlet(name="MATERIAS", urlPatterns = "/SalvarMaterias")
public class MateriasServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	Materia materia = new Materia();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Monta OBjeto Materia.
		MontarMateria(req);
		
		// Salva ou altera banco de dados.
		if(materia.getCodMateria().equals(0)) {
			try {
				Salvar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			Atualizar();
		}
	}
	
	private void MontarMateria(HttpServletRequest req) {
		materia.setCodMateria(Integer.parseInt(req.getParameter("TxtCodigo")));
		materia.setNome(req.getParameter("TxtNome"));
		materia.setDescricao(req.getParameter("TxtDescricao"));
	}
	
	private void Salvar() throws SQLException{
		
		MateriaBd materiaDb = new MateriaBd();
		materiaDb.InserirMateria(materia);
	}
	
	private void Atualizar() {
		
	}
}
