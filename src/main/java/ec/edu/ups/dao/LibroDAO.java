package ec.edu.ups.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dto.LibroDTO;

@Stateless
public class LibroDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void guardarLibro(LibroDTO libro) throws GeneralExeption {
		try {
		    em.persist(libro);
		}catch (PersistenceException e) {
			throw new GeneralExeption("ERORR: " + e.getMessage());
		}
	}
	
	public LibroDTO buscarLibro(String codigo) throws GeneralExeption {
		try {
			return em.createQuery("SELECT l FROM LibroDTO l WHERE codigo = :codigo", LibroDTO.class)
					.setParameter("codigo", codigo).getSingleResult();
		}catch (PersistenceException e) {
			throw new GeneralExeption("ERORR: " + e.getMessage());
		}
	}
}
