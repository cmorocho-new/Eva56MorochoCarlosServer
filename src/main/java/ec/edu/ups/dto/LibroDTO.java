package ec.edu.ups.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.edu.ups.common.GeneralDTO;

@Entity
@Table(name = "libros")
public class LibroDTO extends GeneralDTO implements Serializable {

	private static final long serialVersionUID = -21976438339776878L;
    
    @Column(length = 20)
	private String codigo;
    
    @Column(length = 100)
	private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private AutorDTO autor;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AutorDTO getAutor() {
		return autor;
	}

	public void setAutor(AutorDTO autor) {
		this.autor = autor;
	}
    
	@Override
	public String toString() {
		return "[ " + codigo + " ] - " + nombre;
	}

}
