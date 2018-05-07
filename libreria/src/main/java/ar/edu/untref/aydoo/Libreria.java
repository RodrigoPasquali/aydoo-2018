package ar.edu.untref.aydoo;

public class Libreria {
	
	public double cobrarMontoMesCliente(Cliente cliente, Descuento descuento, int anio, int mes) {
		mes--;
		return this.aplicarDescuentoEnUnMes(descuento, cliente, anio, mes);
	}
	
	private double aplicarDescuentoEnUnMes(Descuento descuento,Cliente cliente, int anio, int mes) {
		double montoTotal = 0;
		montoTotal = descuento.aplicarDescuento(cliente, anio, mes);
		return montoTotal;
	}

	public double cobrarMontoAnioCliente(Cliente cliente, Descuento descuento, int anio) {
		double montoTotal = 0;
		for(int mes = 1; mes <= 12; mes ++) {
			montoTotal = montoTotal + cobrarMontoMesCliente(cliente, descuento, anio, mes);
		}
		return montoTotal;
	}
	
}
