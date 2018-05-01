package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;	
	
public class TestSuscripcion {

	@Test
	public void precioAlMesDeberiaSer30() {
		int anio = 2018;
		int mes = 1;
		int dia = 1;
		int vecesAlMes = 2;
		Suscripcion revista = new Suscripcion(15, vecesAlMes, anio, mes, dia);
		double valorEsperado = 30;
		
		double valorObtenido = revista.getPrecioAlMes();
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}
