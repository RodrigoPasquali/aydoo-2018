package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


public class TestLibreria {
	
	@Test
	public void elCobroDelMesDeJuanDeberiaSerDe200() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(200);
		Descuento descuento = new DescuentoNulo();
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDelMes = new Compra(libro, anio, mes, dia); 
		juan.realizarComprar(compraDelMes);
		double valorEsperado = 200;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio, mes);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelMesDeberiaSerDe150CuandoSeCompraron2ProductosEnEnero2018() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(100);
		Producto lapicera = new Producto(50);
		Descuento descuento = new DescuentoNulo();
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDeLapicera = new Compra(lapicera, anio, mes, dia); 
		Compra compraDeLibro = new Compra(libro, anio, mes, dia);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		double valorEsperado = 150;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio, mes);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elCobroDelMesDeberiaSerDe100CuandoSeCompraron2ProductosEnEnero2018yUnoEnMarzo() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(50);
		Producto lapicera = new Producto(50);
		Producto goma = new Producto(10);
		Descuento descuento = new DescuentoNulo();
		int anio1 = 2018;
		int mes1 = 1;
		int dia1 = 2;
		int anio2 = 2018;
		int mes2 = 3;
		int dia2 = 12;
		Compra compraDeLapicera = new Compra(lapicera, anio1, mes1, dia1); 
		Compra compraDeLibro = new Compra(libro, anio1, mes1, dia1);
		Compra compraGoma = new Compra(goma, anio2, mes2, dia2);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		juan.realizarComprar(compraGoma);
		double valorEsperado = 100;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio1, mes1);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelMesDeberiaSerDe20CuandoHayUnaSuscripcionQuincenalEnEnero2018() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Descuento descuento = new DescuentoNulo();
		int anio = 2018;
		int mes = 4;
		int dia = 1;
		int periodicidadAlMes = 2;
		Periodicidad periodo = Periodicidad.NULA;
		Suscripcion revista = new Suscripcion(10, periodicidadAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(revista);
		double valorEsperado = 20;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio, mes);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void elCobroDelMesDeberiaSerDe211CuandoSeCompra1Articulo1ProductoYHayUnaSuscripcion() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(50);
		Producto lapicera = new ArticuloDeLibreria(100);
		Descuento descuento = new DescuentoNulo();
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDeLapicera = new Compra(lapicera, anio, mes, dia); 
		Compra compraDeLibro = new Compra(libro, anio, mes, dia);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		int vecesAlMes = 4;
		Periodicidad periodo = Periodicidad.NULA;
		Suscripcion diario = new Suscripcion(10, vecesAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(diario);
		double valorEsperado = 211;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio, mes);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelMesDeberiaSerDe211CuandoSeCompra1Articulo1ProductoYHayDescuentoPorClienteRegistrado() {
		Libreria libreria = new Libreria();
		Descuento descuento = new DescuentoClienteRegistrado();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(50);
		Producto lapicera = new ArticuloDeLibreria(100);
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDeLapicera = new Compra(lapicera, anio, mes, dia); 
		Compra compraDeLibro = new Compra(libro, anio, mes, dia);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		int vecesAlMes = 4;
		Periodicidad periodo = Periodicidad.NULA;
		Suscripcion diario = new Suscripcion(10, vecesAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(diario);
		double valorEsperado = 200.45;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio, mes);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelMesDeberiaSerDe80CuandoSeRealizaUnaSuscripcionAnual() {
		Libreria libreria = new Libreria();
		Descuento descuento = new DescuentoSuscripcionAnual();
		Cliente juan = new Cliente("Juan","San juan 2890");
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		int vecesAlMes = 4;
		Periodicidad periodo = Periodicidad.ANUAL;
		Suscripcion diario = new Suscripcion(25, vecesAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(diario);
		double valorEsperado = 80;
		
		double valorObtenido = libreria.cobrarMontoMesCliente(juan, descuento, anio, mes);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelAñoDeberiaSerDe201CuandoSeCompra1Articulo1ProductoYHayUnaSuscripcion() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(50);
		Producto lapicera = new ArticuloDeLibreria(100);
		Descuento descuento = new DescuentoNulo();
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDeLapicera = new Compra(lapicera, anio, mes, dia); 
		mes = 5;
		Compra compraDeLibro = new Compra(libro, anio, mes, dia);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		int vecesAlMes = 2;
		Periodicidad periodo = Periodicidad.NULA;
		mes = 10;
		Suscripcion diario = new Suscripcion(15, vecesAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(diario);
		double valorEsperado = 201;
		
		double valorObtenido = libreria.cobrarMontoAnioCliente(juan, descuento, anio);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelAñoDeberiaSerDe195CuandoSeCompra1Articulo1ProductoYHayUnaSuscripcionAnual() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(50);
		Producto lapicera = new ArticuloDeLibreria(100);
		Descuento descuento = new DescuentoSuscripcionAnual();
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDeLapicera = new Compra(lapicera, anio, mes, dia); 
		mes = 5;
		Compra compraDeLibro = new Compra(libro, anio, mes, dia);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		int vecesAlMes = 2;
		Periodicidad periodo = Periodicidad.ANUAL;
		mes = 12;
		Suscripcion diario = new Suscripcion(15, vecesAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(diario);
		double valorEsperado = 195;
		
		double valorObtenido = libreria.cobrarMontoAnioCliente(juan, descuento, anio);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void elCobroDelAñoDeberiaSerDe190CuandoSeCompra1Articulo1ProductoHaySuscripcionYCienteEstaRegistrado() {
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan","San juan 2890");
		Producto libro = new Producto(59);
		Producto lapicera = new ArticuloDeLibreria(100);
		Descuento descuento = new DescuentoClienteRegistrado();
		int anio = 2018;
		int mes = 1;
		int dia = 2;
		Compra compraDeLapicera = new Compra(lapicera, anio, mes, dia); 
		mes = 5;
		Compra compraDeLibro = new Compra(libro, anio, mes, dia);
		juan.realizarComprar(compraDeLibro);
		juan.realizarComprar(compraDeLapicera);
		int vecesAlMes = 2;
		Periodicidad periodo = Periodicidad.NULA;
		mes = 12;
		Suscripcion diario = new Suscripcion(10, vecesAlMes, anio, mes, dia, periodo);
		juan.realizarSuscripcion(diario);
		double valorEsperado = 190;
		
		double valorObtenido = libreria.cobrarMontoAnioCliente(juan, descuento, anio);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}
