package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

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
	
	@Test
	public void laPrimeraInversionDeLaListaDeInversionesDeberiaContenerUnPft() {	  
		String[] argumentos = {"ind", "pft,90,10,2000", "pfp,90,30,10,4000"};
		ManejadorArgumentosEntrada manejador = new ManejadorArgumentosEntrada(argumentos);
		List<String[]> listaInversiones = new LinkedList<String[]>();
		String[] inversionPft = {"pft","90","10","2000"};		
		String[] inversionPfp = {"pfp","90","30","10","4000"};
		listaInversiones.add(inversionPft);
		listaInversiones.add(inversionPfp);
		String[] valorEsperado = {"pft", "90", "10", "2000"};		
		
		manejador.separarArgumentos();
		List<String[]> listaObtenida = manejador.getListaInversiones();
		String[] valorObtenido = listaObtenida.get(0);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void laSegundaInversionDeLaListaDeInversionesDeberiaContenerUnPfp() {	  
		String[] argumentos = {"ind", "pft,90,10,2000", "pfp,90,30,10,4000"};
		ManejadorArgumentosEntrada manejador = new ManejadorArgumentosEntrada(argumentos);
		List<String[]> listaInversiones = new LinkedList<String[]>();
		String[] inversionPft = {"pft","90","10","2000"};		
		String[] inversionPfp = {"pfp","90","30","10","4000"};
		listaInversiones.add(inversionPft);
		listaInversiones.add(inversionPfp);
		String[] valorEsperado = {"pfp","90","30","10","4000"};		
		
		manejador.separarArgumentos();
		List<String[]> listaObtenida = manejador.getListaInversiones();
		String[] valorObtenido = listaObtenida.get(1);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
