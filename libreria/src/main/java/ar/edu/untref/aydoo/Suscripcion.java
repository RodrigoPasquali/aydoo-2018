package ar.edu.untref.aydoo;

public class Suscripcion {

	private double precio;
	private int vecesAlMes;

	public Suscripcion(double precioSuscripcion, int vecesAlMesSuscripcion) {
		this.precio = precioSuscripcion;
		this.vecesAlMes = vecesAlMesSuscripcion;
	}

	public double getPrecio() {
		return this.precio;
	}
	
	public int periodicidadEnElMes() {
		return this.vecesAlMes;
	}
	
	public double precioAlMes() {
		return this.precio * this.vecesAlMes;
	}
}
