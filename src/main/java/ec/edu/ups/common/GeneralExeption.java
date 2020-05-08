/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.common;

/**
 *
 * @author Carlos
 */
public class GeneralExeption extends Exception {
	
	private static final long serialVersionUID = -8463945768577469792L;
    public GeneralExeption(String descripcion){
        super(descripcion);
    }
    
}
