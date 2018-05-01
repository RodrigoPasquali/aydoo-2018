package ar.edu.untref.aydoo;

import java.util.Calendar;

public class Suscripcion {

	private double precio;
	private int vecesAlMes;
	private Calendar fecha;

	public Suscripcion(double precioSuscripcion, int vecesAlMesSuscripcion, int anio, int mes, int dia) {
		this.precio = precioSuscripcion;
		this.vecesAlMes = vecesAlMesSuscripcion;
		this.fecha = Calendar.getInstance();
		this.fecha.set(anio, mes-1, dia);
	}

	public double getPrecio() {
		return this.precio;
	}
	
	public int getPeriodicidadEnElMes() {
		return this.vecesAlMes;
	}
	
	public double getPrecioAlMes() {
		return this.precio * this.vecesAlMes;
	}
	
	public Calendar getFecha() {
		return this.fecha;
	}
}
