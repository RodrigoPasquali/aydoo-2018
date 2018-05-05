package ar.edu.untref.aydoo;

import java.io.IOException;

public class SalidaConsola extends Salida{	

	public SalidaConsola(String cadena, String salidaSolcitadaIngersada) {
		super(cadena, salidaSolcitadaIngersada);
		this.salidaSiguiente = new SalidaArchivo(cadena, salidaSolcitadaIngersada);
	}

	@Override
	public void aplicarSalida() throws IOException {
		this.setSiguienteSalida(this.salidaSiguiente);
		if(getFormatoSalida().equals("")) {
			System.out.println(this.getCadenaSalida());
			this.getCadenaSalida();
		} else {
			this.getSiguienteSalida().aplicarSalida();
		}
		
	}
	
}
