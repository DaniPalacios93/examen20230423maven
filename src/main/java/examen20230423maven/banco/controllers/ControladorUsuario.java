package examen20230423maven.banco.controllers;

import examen20230423maven.banco.entites.Usuario;


public class ControladorUsuario extends SuperControladorJPA{
	
private static ControladorUsuario instance = null;
	
	
	public ControladorUsuario() {
		super("usuario", Usuario.class); 
	}
	
	/**
	 * 
	 * @return
	 */
	public static ControladorUsuario getInsctance() {
		if(instance == null) {
			instance = new ControladorUsuario();
		}
		return instance;
	}

}
