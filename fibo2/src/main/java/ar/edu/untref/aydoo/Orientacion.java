package ar.edu.untref.aydoo;

import java.util.List;

public abstract class Orientacion {
	private Orientacion orientacionSiguiente;
	protected String orientacion;
	protected List<Integer> listaNumeros;
	protected String cadenaSalida;
	
	public Orientacion(List<Integer> listaNumerosIngresada, String orientacionIngresada) {
		this.orientacion = orientacionIngresada;
		this.listaNumeros = listaNumerosIngresada;
		this.cadenaSalida = "fibo<" +listaNumerosIngresada.size() + ">: ";
	}
	
	public abstract String aplicarOrientacion();
	
	protected void setSiguienteOrientacion(Orientacion orientacionIngresado) {
		this.orientacionSiguiente = orientacionIngresado;
	}
	
	protected Orientacion getSiguienteOrientacion() {
		return this.orientacionSiguiente;
	}
}
