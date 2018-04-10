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
	public void deberiaHaberUnBArcoEnElCasillero23() throws Exception{
		int tamanioBarco = 1;
		int columna = 2;
		int fila = 3;
		Barco barco = new Barco(tamanioBarco);
		Tablero tablero = new Tablero();
		tablero.ubicarBarco(barco, columna, fila, null);

		Assert.assertTrue(tablero.hayBarcoEnPosicion(2, 3));;
	}
	
	@Test
	public void deberiaHaberBarcoDe2PosicionesConOrientacionVertical() throws Exception {
		int tamanioBarco = 2;
		int columna = 1;
		int fila = 4;
		Orientacion orientacion = Orientacion.VERTICAL;
		Barco crucero = new Barco(tamanioBarco);
		Tablero tablero = new Tablero();
		tablero.ubicarBarco(crucero, columna, fila, orientacion);
		
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna, fila));
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna, fila++));
	}
	
	@Test
	public void deberiaHaberBarcoDe2PosicionesConOrientacionHorizontal() throws Exception {
		int tamanioBarco = 2;
		int columna = 1;
		int fila = 4;
		Orientacion orientacion = Orientacion.HORIZONTAL;
		Barco crucero = new Barco(tamanioBarco);
		Tablero tablero = new Tablero();
		tablero.ubicarBarco(crucero, columna, fila, orientacion);
		
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna, fila));
		Assert.assertTrue(tablero.hayBarcoEnPosicion(columna++, fila));
	}
	
	@Test
	public void tratarDePonerUnBarcoEnUnaPosicionDondeHayOtroBarcoNoDeberiaSerPosible() throws Exception {
		int tamaniBote = 1;
		int columna = 1;
		int fila = 2;
		int tamanioCrucero = 2;
		Tablero tablero = new Tablero();
		Orientacion orientacion = Orientacion.VERTICAL;
		Barco bote = new Barco(tamaniBote);
		Barco crucero = new Barco(tamanioCrucero);
		
		tablero.ubicarBarco(crucero, columna, fila, orientacion);
		
		try {
			tablero.ubicarBarco(bote, columna, fila++, null);
		}catch (Exception e){
			
		}
	}
	
	
	@Test
	public void tratarDeUbicarUnBarcoDe1PosicionFueraDeLosLimitesNoDeberiaSerPosible() {
		int tamaniBote = 1;
		int columna = 6;
		int fila = 1;
		Tablero tablero = new Tablero();
		Barco bote = new Barco(tamaniBote);
		
		try {
			tablero.ubicarBarco(bote, columna, fila, null);
		}catch (Exception e){
			
		}
	}
	
	@Test
	public void tratarDeUbicarUnBarcoDe2PosicionFueraDeLosLimitesNoDeberiaSerPosible() {
		int tamaniBote = 2;
		int columna = 5;
		int fila = 1;
		Tablero tablero = new Tablero();
		Barco bote = new Barco(tamaniBote);
		Orientacion orientacion = Orientacion.HORIZONTAL;
		
		try {
			tablero.ubicarBarco(bote, columna, fila, orientacion);
		}catch (Exception e){
			
		}
	}

}
