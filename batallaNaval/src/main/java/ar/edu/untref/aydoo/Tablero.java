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
		return !this.casilleros[columna][fila].estaVacio();
	}

	public void ubicarBarco(Barco barco, int columna, int fila, Orientacion orientacion) throws Exception {
		this.verificarLimitesTablero(columna, fila);
		this.verificarPosicion(columna, fila, orientacion);
		this.casilleros[columna][fila].ponerBarco(barco);
		if(barco.obtenerTamanio() < 1) {
			if (orientacion.equals(Orientacion.VERTICAL)) {
				fila++;
				this.verificarLimitesTablero(columna, fila);
				this.verificarPosicion(columna, fila, orientacion);
				this.casilleros[columna][fila].ponerBarco(barco);
			}else if(orientacion.equals(Orientacion.HORIZONTAL)){
				columna++;
				this.verificarLimitesTablero(columna,fila);
				this.verificarPosicion(columna, fila, orientacion);
				this.casilleros[columna][fila].ponerBarco(barco);
				}
			}
	}
	
	private void verificarPosicion(int columna, int fila, Orientacion orientacion) throws Exception {
		if(this.hayBarcoEnPosicion(columna, fila)) {
			throw new Exception("No se puede colocar barco en esta posicion");
		}
	}
	
	private void verificarLimitesTablero(int columna, int fila) throws Exception {
		if(fila > this.filas || columna > this.columnas) {
			throw new Exception("Debe ubicar el barco dentro de los limites permitidos por el tablero");
		}
	}
}
