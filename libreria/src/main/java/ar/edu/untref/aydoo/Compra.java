package ar.edu.untref.aydoo;

import java.util.Calendar;

public class Compra {

	private Producto producto;
	private Calendar fecha;

	public Compra(Producto productoComprado, int anio, int mes, int dia) {
		this.producto = productoComprado;
		this.fecha = Calendar.getInstance();
		this.fecha.set(anio, mes-1, dia);
	}
	
	public Calendar getFecha() {
		return this.fecha;
	}
	
	public double getPrecio() {
		return this.producto.getPrecio();
	}
}
