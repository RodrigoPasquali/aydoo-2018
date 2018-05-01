package ar.edu.untref.aydoo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;	
	
public class TestSuscripcion {

	@Test
	public void precioAlMesDeberiaSer30() {
		Suscripcion revista = new Suscripcion(15, 2);
		double valorEsperado = 30;
		
		double valorObtenido = revista.precioAlMes();
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}
