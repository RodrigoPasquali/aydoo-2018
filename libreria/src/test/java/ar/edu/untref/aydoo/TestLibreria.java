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
	
	@Test
	public void elCobroDelMesDeberiaSerDe150CuandoSeCompraron2ProductosEnEnero2018() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(100);
		Producto lapicera = new Producto(50);
		CuentaCorriente cuentaCorrienteJuan = new CuentaCorriente();
		juan.setCuentaCorriente(cuentaCorrienteJuan);
		Compra compraDeLapicera = new Compra(libro, 2018, 1, 2); 
		Compra compraDeLibro = new Compra(lapicera, 2018, 1, 2);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		double valorEsperado = 150;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, 2018, 1);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elCobroDelMesDeberiaSerDe100CuandoSeCompraron2ProductosEnEnero2018yUnoEnMarzo() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(50);
		Producto lapicera = new Producto(50);
		Producto goma = new Producto(10);
		CuentaCorriente cuentaCorrienteJuan = new CuentaCorriente();
		juan.setCuentaCorriente(cuentaCorrienteJuan);
		Compra compraDeLapicera = new Compra(libro, 2018, 1, 2); 
		Compra compraDeLibro = new Compra(lapicera, 2018, 1, 2);
		Compra compraGoma = new Compra(goma, 2018, 3, 12);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		juan.realizarComprar(compraGoma);
		double valorEsperado = 100;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, 2018, 1);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	
}
