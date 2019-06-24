package Banco;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "BdServlet" , urlPatterns = {"/BdServlet"} ) 
public class BdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BdServlet() {
        super();
        Conexao conn = new Conexao();
		conn.getConexao();
    }




	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
