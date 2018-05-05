package ar.edu.untref.aydoo;

import java.io.FileWriter;
import java.io.IOException;

public class SalidaArchivo extends Salida{

	public SalidaArchivo(String cadenaSalida, String salidaSolicitadaIngresada) {
		super(cadenaSalida, salidaSolicitadaIngresada);
	}

	@Override
	public void aplicarSalida() throws IOException {
		String formatoSalida = this.getFormatoSalida();
		if(formatoSalida.contains("-f=")) {
			String directorio  = formatoSalida.substring(3, formatoSalida.length());
			this.escribirArchivo(directorio, this.getCadenaSalida());
		}
	}
	
	private void escribirArchivo(String directorio, String texto) throws IOException {
		FileWriter fichero = null;
        fichero = new FileWriter(directorio);
        fichero.write(texto);
	    fichero.close();
	}
	

}
