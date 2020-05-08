package ec.edu.ups.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import ec.edu.ups.common.GeneralDTO;
import ec.edu.ups.common.Genero;

@Entity
@Table(name = "autores")
public class AutorDTO extends GeneralDTO implements Serializable {

	private static final long serialVersionUID = 2192746806740216557L;
	
	@Column(length = 100)
	private String nombre;
	
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@Override
	public String toString() {
		return nombre;
	}


}
