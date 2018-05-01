package ar.edu.untref.aydoo;

import java.util.Calendar;
import java.util.List;

public class Libreria {
	
	public double cobrarMontoMesCliente(Cliente cliente, int anio, int mes) {
		mes--;
		List<Compra> listaDeCompras = cliente.getListaCompras();
		double montoDelMes = 0;
		for(int i = 0; i < listaDeCompras.size(); i++) {
			Calendar fecha = listaDeCompras.get(i).getFecha();
			if((fecha.MONTH == mes) && (fecha.YEAR == anio)) {
				montoDelMes = montoDelMes + listaDeCompras.get(i).getPrecio();
			}
		}
		return montoDelMes;
	}

}
