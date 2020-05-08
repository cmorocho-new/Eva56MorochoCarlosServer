package ec.edu.ups.servicio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.Igestor.ILibreriaONL;
import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dto.LibroDTO;


@SuppressWarnings("serial")
@WebServlet("/buscarLibro")
public class WebServicioLibro extends HttpServlet {
	
	@Inject
	private ILibreriaONL libreriaON;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String codigo = (String) req.getAttribute("codigo");
		PrintWriter doc = resp.getWriter();
		doc.append("<h4> -- -- -- -- -- -- -- -- -- -- <h4>");
		try {
			LibroDTO libro = libreriaON.buscarLibro(codigo);
		    doc.append("<h5>" + libro.toString( )+ "<h5>");
		}catch (GeneralExeption e) {
			doc.append("<h5> LIBRO NO ENCONTRADO <h5>");
		}
		doc.append("<h4> -- -- -- -- -- -- -- -- -- -- <h4>");
	}
}
