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
		tablero.ubicarBarco(barco, columna, fila, null);

		Assert.assertTrue(tablero.hayBarcoEnPosicion(2, 3));;
	}
	
	@Test
	public void deberiaHaberBarcoDe2PosicionesConOrientacionVertical() {
		int tamanioBarco = 2;
		int columna = 1;
		int fila = 4;
		Orientacion orientacion = Orientacion.VERTICAL;
		Barco barco = new Barco(tamanioBarco);
		Tablero tablero = new Tablero();
		tablero.ubicarBarco(barco, columna, fila, orientacion);
		
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna, fila));
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna, fila++));
	}
	
	@Test
	public void deberiaHaberBarcoDe2PosicionesConOrientacionHorizontal() {
		int tamanioBarco = 2;
		int columna = 1;
		int fila = 4;
		Orientacion orientacion = Orientacion.HORIZONTAL;
		Barco barco = new Barco(tamanioBarco);
		Tablero tablero = new Tablero();
		tablero.ubicarBarco(barco, columna, fila, orientacion);
		
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna, fila));
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna++, fila));
	}
}
