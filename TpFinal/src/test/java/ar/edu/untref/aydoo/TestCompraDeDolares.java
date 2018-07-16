package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import excepciones.ExcepcionCotizacionDolarIncorrecta;
import excepciones.ExcepcionMontoMenorACotizacionDolar;

public class TestCompraDeDolares {
	@Test
	public void realizarLaCompraDeDolaresCon1000PesosCotizacionInicial20CotizacionFinal28DeberiaDevolverGananciaDe400() {	  
		CompraDeDolares comprarDolares = new CompraDeDolares(1000, 20, 28);
		double valorEsperado = 400;
		
		double valorObtenido = comprarDolares.calcularGanancia();
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarLaCompraDeDolaresCon10PesosCotizacionInicial20DeberiaLanzarExcepcionMontoMenorACotizacionDolar() {	  
		CompraDeDolares comprarDolares = new CompraDeDolares(10, 20, 28);
		
		try {
			comprarDolares.calcularGanancia();
		}catch (ExcepcionMontoMenorACotizacionDolar e){

	    }		
	}
	
	@Test
	public void realizarLaCompraDeDolaresConCotizacionInicial0DeberiaLanzarExcepcionCotizacionDolarIncorrecta() {	  
		CompraDeDolares comprarDolares = new CompraDeDolares(10, 0, 28);
		
		try {
			comprarDolares.calcularGanancia();
		}catch (ExcepcionCotizacionDolarIncorrecta e){

	    }		
	}
	
	@Test
	public void realizarLaCompraDeDolaresConCotizacionFinal0DeberiaLanzarExcepcionCotizacionDolarIncorrecta() {	  
		CompraDeDolares comprarDolares = new CompraDeDolares(10, 0, 28);
		
		try {
			comprarDolares.calcularGanancia();
		}catch (ExcepcionCotizacionDolarIncorrecta e){

	    }		
	}
}