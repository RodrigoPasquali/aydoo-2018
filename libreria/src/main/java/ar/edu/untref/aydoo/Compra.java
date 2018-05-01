package ar.edu.untref.aydoo;

import java.util.Calendar;

public class Compra {

	private Producto producto;
	private Calendar fecha;

	public Compra(Producto productoComprado, int año, int mes, int dia) {
		this.producto = productoComprado;
		this.fecha = Calendar.getInstance();
		this.fecha.set(año, mes, dia);;
	}

}
