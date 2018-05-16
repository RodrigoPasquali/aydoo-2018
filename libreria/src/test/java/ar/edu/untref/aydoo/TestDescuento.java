package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDescuento {

	@Test
	public void aplicarDescuentoNuloNoModificaElTotal() {
		Cliente laura = new Cliente("Laura", "Calle falsa 123");
		Producto cuaderno = new Producto(100);
		int anio = 2018;
		int mes = 1;
		int dia = 1;
		Compra compraCuaderno = new Compra(cuaderno, anio, mes, dia);
		laura.realizarComprar(compraCuaderno);
		Descuento descuento = new DescuentoNulo();
		double valorEsperado = 100;
		
		double valorObtenido = descuento.aplicarDescuento(laura, anio, mes-1);
	
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void aplicarDescuentoParaClienteRegistradoOtorgaUnDescuentoDe5PorCiento() {
		Cliente laura = new Cliente("Laura", "Calle falsa 123");
		Producto cuaderno = new Producto(100);
		int anio = 2018;
		int mes = 1;
		int dia = 1;
		Compra compraCuaderno = new Compra(cuaderno, anio, mes, dia);
		laura.realizarComprar(compraCuaderno);
		Descuento descuento = new DescuentoClienteRegistrado();
		double valorEsperado = 95;
		
		double valorObtenido = descuento.aplicarDescuento(laura, anio, mes-1);
	
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void aplicarDescuentoPorSuscripcionAnualOtorgaun20PorcientoDeDescuento() {
		Cliente laura = new Cliente("Laura", "Calle falsa 123");
		int anio = 2018;
		int mes = 1;
		int dia = 1;
		Descuento descuento = new DescuentoSuscripcionAnual();
		Periodicidad periodo = Periodicidad.ANUAL;
		Suscripcion revista = new Suscripcion(25, 4, anio, mes, dia, periodo);
		laura.realizarSuscripcion(revista);
		double valorEsperado = 80;
		
		double valorObtenido = descuento.aplicarDescuento(laura, anio, mes-1);
	
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}

