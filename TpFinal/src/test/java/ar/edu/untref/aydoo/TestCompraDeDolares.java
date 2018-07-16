package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestCompraDeDolares {
	@Test
	public void realizarLaCompraDeDolaresCon1000PesosCotizacionInicial20CotizacionFinal28DeberiaDevolverGananciaDe400() {	  
		CompraDeDolares comprarDolares = new CompraDeDolares();
		double valorEsperado = 400;
		
		double valorObtenido = comprarDolares.calcularGanancia(1000, 20, 28);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}
