package ar.edu.untref.aydoo;

import java.io.IOException;

public class SalidaConsola extends Salida{	

	public SalidaConsola(String cadena, String salidaSolcitadaIngersada) {
		super(cadena, salidaSolcitadaIngersada);
	}

	@Override
	public void aplicarSalida() throws IOException {
			System.out.println(this.getCadenaSalida());
			this.getCadenaSalida();
	}

}
