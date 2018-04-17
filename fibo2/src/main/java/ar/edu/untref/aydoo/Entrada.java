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
	
	private void getFormato() throws Exception {
		String formato;
		for(int i = 0; i< this.cadena.length; i++) {
			formato = this.cadena[i];
			if(formato.contains("-o=")) {
				this.verificarOrientacion(formato.substring(3,4));
				this.verificarDireccion(formato.substring(4,5));
			}
		}
	}
	
	public String getOrientacion() {
		return this.orientacion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	private void verificarOrientacion(String orientacionIngresada) throws Exception {
		if(orientacionIngresada.equals("h")  || orientacionIngresada.equals("v") ) {
			this.orientacion = orientacionIngresada;
		}else {
			throw new Exception("Opcion no valida");
		}
	}
	
	private void verificarDireccion(String direccionIngresada) throws Exception {
		if(direccionIngresada.equals("d" )|| direccionIngresada.equals("i")) {
			this.direccion = direccionIngresada;
		}else {
			throw new Exception("Opcion no valida");
		}
	}

}
