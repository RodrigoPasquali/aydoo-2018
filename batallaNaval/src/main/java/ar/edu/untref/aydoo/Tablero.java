package ar.edu.untref.aydoo;


/*
 * FALTA INICIALIZAR CADA CASILLERO, RECORRIENDO LA MATRIZ Y HACIENDO NEW*/


public class Tablero {

	private final int columnas = 5;
	private final int filas = 5;
	private Casillero[][] casilleros;
	
	public Tablero() {
		this.casilleros = new Casillero[columnas][filas];
		for(int columna = 1; columna < this.columnas; columna++) {
			for(int fila = 1; fila < this.filas; fila++) {
				this.casilleros[columna][fila] = new Casillero();
			}
		}
	}
	
	public int obtenerCantidadColumnas() {
		return columnas;
	}

	public int obtenerCantidadFilas() {
		return filas;
	}

	public boolean hayBarcoEnPosicion(int columna, int fila) {
		return this.casilleros[columna][fila].hayBarco();
	}

	public void ubicarBarco(Barco barco, int columna, int fila) {
		this.casilleros[columna][fila].ponerBarco(barco);
	}
	
	

}
