package examen20230423maven.banco.controllers;

import examen20230423maven.banco.entites.TipoContrato;


public class ControladorTipoContrato extends SuperControladorJPA {

private static ControladorTipoContrato instance = null;
	
	
	public ControladorTipoContrato() {
		super("tipocontrato", TipoContrato.class); 
	}
	
	/**
	 * 
	 * @return
	 */
	public static ControladorTipoContrato getInsctance() {
		if(instance == null) {
			instance = new ControladorTipoContrato();
		}
		return instance;
	}
	
}
