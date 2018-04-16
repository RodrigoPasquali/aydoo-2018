package ar.edu.untref.aydoo;

public class Entrada {
	
	private String[] cadena;
	private String orientacion;
	private String direccion;
	private int numero;
	
	public Entrada(String cadenaEntrada[]) {
		this.cadena = cadenaEntrada;
		this.orientacion = "h";
		this.direccion = "d";
	}
	
	public void procesarParametros() throws Exception {
		this.verificarNumero();
		this.getFormato();
	}
	
	private void verificarNumero() throws Exception {
		String argumento;
		argumento = this.cadena[this.cadena.length-1];
		try {
			this.numero = Integer.parseInt(argumento);
		} catch (Exception e) {
	       	throw new Exception("Debe introducir el numero de suceciones");
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private void getFormato() {
		String formato;
		for(int i = 0; i< this.cadena.length; i++) {
			formato = this.cadena[i];
			if(formato.contains("-o=")) {
				//this.orientacion = formato.charAt(3);
				//this.direccion = formato.charAt(4);
				this.orientacion = formato.substring(3,4);
				this.direccion = formato.substring(4,5);
			}
		}
	}
	
	public String getOrientacion() {
		return this.orientacion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}

}
