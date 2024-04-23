package examen20230423maven.banco.controllers;

import examen20230423maven.banco.entites.Contrato;

public class ControladorContrato extends SuperControladorJPA{
	
private static ControladorContrato instance = null;
	
	
	public ControladorContrato() {
		super("contrato", Contrato.class); 
	}
	
	/**
	 * 
	 * @return
	 */
	public static ControladorContrato getInsctance() {
		if(instance == null) {
			instance = new ControladorContrato();
		}
		return instance;
	}

}
