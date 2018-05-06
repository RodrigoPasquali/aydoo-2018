package ar.edu.untref.aydoo;

public class Entrada {
	
	private String[] cadena;
	private String orientacion;
	private String direccion;
	private int numero;
	private String formatoSalida;
	
	public Entrada(String cadenaEntrada[]) {
		this.cadena = cadenaEntrada;
		this.orientacion = "h";
		this.direccion = "d";
		this.formatoSalida = "";
	}
	
	public void procesarParametros() throws Exception {
		this.verificarNumero();
		this.getFormato();
		this.setFormatoSalida();
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
	
	private void getFormato() throws Exception {
		String formato;
		for(int i = 0; i< this.cadena.length; i++) {
			formato = this.cadena[i];
			if(formato.contains("-o=")) {
				this.orientacion = formato.substring(3,4);
				this.direccion = formato.substring(4,5);
				if(!this.direccion.equals("d") && !this.direccion.equals("i")) {
					this.direccion = "Opciones no validas";
				}
			}
		}
	}
	
	public String getOrientacion() {
		return this.orientacion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	private void setFormatoSalida() throws Exception {
		String salida;
		for(int i = 0; i< this.cadena.length; i++) {
			salida = this.cadena[i];
			if(salida.contains("-f=")) {
				this.formatoSalida = salida;
			}
		}
	}
	
	public String getFormatoSalida() {
		return this.formatoSalida;
	}
}
