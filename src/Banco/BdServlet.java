package Banco;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;


@WebServlet(urlPatterns = {"/BdServlet"} ) 
public class BdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BdServlet() {
        super();


    }




	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Conexao conn = new Conexao();
		conn.getConexao();
		/*Aluno aluno = new Aluno();
		aluno.setNome("Julio");
		aluno.setDataNascimento("2000-05-13");

		
		try {
			conn.inserir(aluno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		doGet(request, response);
	}

}
