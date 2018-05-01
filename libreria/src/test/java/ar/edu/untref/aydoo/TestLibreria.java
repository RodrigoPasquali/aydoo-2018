package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestLibreria {
	
	@Test
	public void elCobroDelMesDeJuanDeberiaSerDe200() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(200);
		CuentaCorriente cuentaCorrienteJuan = new CuentaCorriente();
		juan.setCuentaCorriente(cuentaCorrienteJuan);
		Compra compraDelMes = new Compra(libro, 2018, 1, 2); 
		juan.realizarComprar(compraDelMes);
		double valorEsperado = 200;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, 2018, 1);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

}
