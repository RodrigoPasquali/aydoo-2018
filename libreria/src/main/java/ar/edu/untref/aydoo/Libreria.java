package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Libreria {
	List<Descuento> listaDescuentos;
	
	public Libreria() {
		this.listaDescuentos = new LinkedList<Descuento>();
	}
	
	public double cobrarMontoMesCliente(Cliente cliente, Descuento descuento, int anio, int mes) {
		mes--;
		return this.aplicarDescuentoEnUnMes(descuento, cliente, anio, mes);
	}
	
	private double aplicarDescuentoEnUnMes(Descuento descuento,Cliente cliente, int anio, int mes) {
		double montoTotal = 0;
		montoTotal = descuento.aplicarDescuento(cliente, anio, mes);
		return montoTotal;
	}
	
}
