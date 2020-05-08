package ec.edu.ups.gestor;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.Igestor.ILibreriaONL;
import ec.edu.ups.Igestor.ILibreriaONR;
import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.dto.AutorDTO;
import ec.edu.ups.dto.LibroDTO;

@Stateless
public class LibreriaON implements ILibreriaONR, ILibreriaONL{
	
    @Inject
	private AutorDAO autorDAO;
    
    @Inject
 	private LibroDAO libroDAO;
    
	public void guardarLibro(LibroDTO libro) throws GeneralExeption {
		libroDAO.guardarLibro(libro);
	}
	
	public LibroDTO buscarLibro(String codigo) throws GeneralExeption {
		return libroDAO.buscarLibro(codigo);
	}
	
	public List<AutorDTO> listarAutores() throws GeneralExeption {
		return autorDAO.listarAutores();
	}
	
}
