package ec.edu.ups.Igestor;

import javax.ejb.Local;

import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dto.LibroDTO;

@Local
public interface ILibreriaONL {
   
	public LibroDTO buscarLibro(String codigo) throws GeneralExeption;
	
}
