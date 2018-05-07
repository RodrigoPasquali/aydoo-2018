package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestCliente {
	
	@Test
	public void deberiaDevolverListaDeCompra() {
		Cliente pedro = new Cliente("Pedro", "Cochabamba 1242");
		Producto lapicera = new Producto(20);
		Producto cuaderno = new Producto(50);
		Compra compraLapicera = new Compra(lapicera, 2018, 1, 1);
		Compra compraCuaderno = new Compra(cuaderno, 2018, 1, 1);
		pedro.realizarComprar(compraCuaderno);
		pedro.realizarComprar(compraLapicera);
		List<Compra> valorEsperado = new LinkedList<Compra>();
		valorEsperado.add(compraCuaderno);
		valorEsperado.add(compraLapicera);
		
		List<Compra> valorObtenido = pedro.getListaCompras();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
