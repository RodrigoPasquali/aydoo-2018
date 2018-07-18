package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestManejadorArgumentosEntrada {
	@Test
	public void elTipoDeClienteDeberiaSerInd() {	  
		String[] argumentos = {"ind", "pft,90,10,2000", "pfp,90,30,10,4000"};
		ManejadorArgumentosEntrada manejador = new ManejadorArgumentosEntrada(argumentos);
		String valorEsperado = "ind";
		
		manejador.separarArgumentos();
		String valorObtenido = manejador.getTipoCliente();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
