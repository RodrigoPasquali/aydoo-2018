package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProducto {
	
	@Test
	public void productoArticuloDeLibreriaDeberiaDevolverPrecioConIva() {
		Producto articuloLibreria = new ArticuloDeLibreria(100);
		double valorEsperado = 121;
				
		double valorObtenido = articuloLibreria.getPrecio();
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

}
