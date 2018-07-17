package ar.edu.untref.aydoo;

import java.util.Map;

public abstract class Impuesto {
	private Map<Integer[], Double> tablaImpuestos;
	private String tipoCliente;
	protected Impuesto impuestoSiguiente;
	
	public Impuesto(String impuestoIngresado) {
		this.tipoCliente = impuestoIngresado;
	}
	
	public String getTipoCliente() {
		return this.tipoCliente;
	}

	public Impuesto getImpuestoSiguiente() {
		return impuestoSiguiente;
	}

	public void setImpuestoSiguiente(Impuesto impuestoSiguiente) {
		this.impuestoSiguiente = impuestoSiguiente;
	}

	public abstract double aplicarImpuesto(double ganancia);

	public void modificarTablaDeImpuestos(Map<Integer[], Double> nuevaTablaImpuestos) {
		this.tablaImpuestos = nuevaTablaImpuestos;
	}
	
	public Map<Integer[], Double> getTablaImpuestos() {
		return this.tablaImpuestos;
	}
}

