package ec.edu.ups.Igestor;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dto.AutorDTO;
import ec.edu.ups.dto.LibroDTO;

@Remote
public interface ILibreriaONR {
	
	public void guardarLibro(LibroDTO libro) throws GeneralExeption;
	
	public List<AutorDTO> listarAutores() throws GeneralExeption;
	
}
