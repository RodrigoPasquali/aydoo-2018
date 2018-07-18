package ar.edu.untref.aydoo;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestManejadorArgumentosEntrada {
	@Test
	public void sdsdfsdsdfsdff() {	  
		String[] argumentos = {"ind.", "pft,90,10,2000.", "pfp,90,30,10,4000."};
		ManejadorArgumentosEntrada manejador = new ManejadorArgumentosEntrada(argumentos);
		
		manejador.separarArgumentos();
		List<String[]> lista = manejador.getListaInversiones();
		for(int i = 0; i < lista.size(); i++) {
			for(int x = 0; x < lista.get(i).length; x++) {
				System.out.println(lista.get(i)[x]);
			}
		}
//		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}
}
