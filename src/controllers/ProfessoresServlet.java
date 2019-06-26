package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Professor;

@WebServlet(name = "Professores", urlPatterns = "/SalvarProfessor")
public class ProfessoresServlet  extends HttpServlet{

	Professor professor = new Professor();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}
	
	private void montarProfessor() {
		
	}
	
}
