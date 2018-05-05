package ar.edu.untref.aydoo;

import java.util.List;

public abstract class Salida {
	private String cadenaSalida;
	private List<Integer> listaNumeros;

	public Salida(List<Integer> listaNumerosIngresada) {
		this.listaNumeros = listaNumerosIngresada;
		this.cadenaSalida = "fibo<" +listaNumerosIngresada.size() + ">: ";
	}

	public abstract void aplicarSalida();

	protected void setCadenaSalida(String cadena) {
		this.cadenaSalida = cadena;
	}
	
	protected String getCadenaSalida() {
		return this.cadenaSalida;
	}
	
	protected List<Integer> getListaNumeros() {
		return this.listaNumeros;
	}
}
