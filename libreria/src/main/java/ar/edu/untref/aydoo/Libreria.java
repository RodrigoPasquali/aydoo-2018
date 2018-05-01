package ar.edu.untref.aydoo;

import java.util.Calendar;
import java.util.List;

public class Libreria {
	
	public double cobrarMontoMesCliente(Cliente cliente, int anio, int mes) {
		mes--;
		List<Compra> listaDeCompras = cliente.getListaCompras();
		List<Suscripcion> listaSuscripciones = cliente.getListaSuscripciones();
		double montoDelMes = 0;
		for(int i = 0; i < listaDeCompras.size(); i++) {
			Calendar fechaCompra = listaDeCompras.get(i).getFecha();
			if((fechaCompra.get(Calendar.MONTH) == mes) && (fechaCompra.get(Calendar.YEAR) == anio)) {
				montoDelMes = montoDelMes + listaDeCompras.get(i).getPrecio();
			}
		}
		for(int j = 0; j < listaSuscripciones.size(); j++) {
			Calendar fechaSuscripcion = listaSuscripciones.get(j).getFecha();
			if((fechaSuscripcion.get(Calendar.MONTH) == mes) && (fechaSuscripcion.get(Calendar.YEAR) == anio)) {
				montoDelMes = montoDelMes + listaSuscripciones.get(j).getPrecioAlMes();
			}
		}
		return montoDelMes;
	}
	
}
