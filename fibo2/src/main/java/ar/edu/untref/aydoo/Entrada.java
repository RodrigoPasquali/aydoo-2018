package ar.edu.untref.aydoo;

public class Entrada {
	
	private String[] cadena;
	private char orientacion;
	private char direccion;
	private int numero;
	
	public Entrada(String cadenaEntrada[]) {
		this.cadena = cadenaEntrada;
	}
	
	public int getNumero() throws Exception {
		String argumento;
		int numeroObtenido = 0;
		for (int i = 0; i < this.cadena.length; i++) {
			argumento = this.cadena[i];
			try {
				numeroObtenido = Integer.parseInt(argumento);

		       	} catch (NumberFormatException nfe) {
		       		throw new Exception("Debe introducir el numero de suceciones");
		   	}
		}
	    return numeroObtenido;
	}
	
	public boolean tieneFormato() {
		String formato;
		boolean hayFormato = false;
		for(int i = 0; i< this.cadena.length; i++) {
			formato = this.cadena[i];
			if(formato.contains("-o=")) {
				this.orientacion = formato.charAt(3);
				this.direccion = formato.charAt(4);
				hayFormato = true;
			}
		}
		return hayFormato;
	}
	
	public char getOrientacion() {
		return this.orientacion;
	}
	
	public char getDireccion() {
		return this.direccion;
	}

}
