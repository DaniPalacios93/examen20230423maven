package examen20230423maven.banco.views;

import java.util.List;

import examen20230423maven.banco.controllers.ControladorContrato;
import examen20230423maven.banco.entites.Contrato;


public class DatosTablaContrato {
	
	public static String[] getTitulosColumnas() {
		return new String[] {
				"Id",
				"Descripcion",
				"Saldo",
				"Limite",
				"Fecha_Firma",
				"idUsuario",
				"idTipoCotrato"};
	}
	
	
	public static Object[][] getDatosDeTabla(){
		
		List<Contrato> contratos = (List<Contrato>) ControladorContrato.getInsctance().findAll();
		Object[][] datos = new Object[contratos.size()][getTitulosColumnas().length];
		
		for (int i = 0; i < contratos.size(); i++) {
			
			Contrato contrato = contratos.get(i);
			
			datos[i][0] = contrato.getId();
			datos[i][1] = contrato.getDescripcion();
			datos[i][2] = contrato.getSaldo();
			datos[i][3] = contrato.getLimite();
			datos[i][4] = contrato.getFechaFirma();
			datos[i][5] = contrato.getUsuario().getId();
			datos[i][6] = contrato.getTipoContrato().getId();
		}	
		return datos;
	}

}
