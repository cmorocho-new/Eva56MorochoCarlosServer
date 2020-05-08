package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dto.AutorDTO;


@Stateless
public class AutorDAO {
	
	@PersistenceContext
	private EntityManager em;
	

	public List<AutorDTO> listarAutores() throws GeneralExeption {
		try {
			return em.createQuery("SELECT a FROM AutorDTO a", AutorDTO.class).getResultList();
		}catch (PersistenceException e) {
			throw new GeneralExeption("ERORR: " + e.getMessage());
		}
	}
}
