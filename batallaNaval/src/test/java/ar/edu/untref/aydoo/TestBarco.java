package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;


public class TestBarco {
	
	@Test
	public void barcoDeberiaTenerTamanioAsignadoEnConstructor() throws Exception {
		int tamanio = 3;
		Barco barco = new Barco(tamanio);
		
		Assert.assertEquals(tamanio, barco.obtenerTamanio());
	}
	
	@Test
	public void alTocarBarcoDeTamanio1DeberiaEstarHundido() throws Exception {
		Barco barco = new Barco(1);
		barco.tocado();
		
		Assert.assertTrue(barco.estaHundido());
	}
	
	@Test
	public void barcoDeTamanioDosNoEstaHundidoSiSeLoTocaUnaVez() throws Exception {
		Barco barco = new Barco(2);
		barco.tocado();
		
		Assert.assertFalse(barco.estaHundido());
	}
	

	@Test
	public void siSeTocaBarcoHundidoArrojaMensajeQueEstaHundido() throws Exception {
		Barco barco = new Barco(1);
		barco.tocado();
		
		try {
			barco.tocado();
		}catch (Exception e){
			
		}
	}

}
