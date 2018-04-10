package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;



public class TestTablero {

	@Test
	public void enLosCasillerosNoDeberiaHaberBarcos() {
		Tablero tablero = new Tablero();
		
		for(int columna = 1; columna < tablero.obtenerCantidadColumnas(); columna++) {
			for(int fila = 1; fila < tablero.obtenerCantidadFilas(); fila++) {
				Assert.assertFalse(tablero.hayBarcoEnPosicion(columna, fila));
			}
		}
	}
 
	@Test
	public void deberiaHaberUnBArcoEnElCasillero23(){
		int tamanioBarco = 1;
		int columna = 2;
		int fila = 3;
		Barco barco = new Barco(tamanioBarco);
		Tablero tablero = new Tablero();
		tablero.ubicarBarco(barco, columna, fila);

		Assert.assertTrue(tablero.hayBarcoEnPosicion(2, 3));;
	}
}
