package ar.edu.untref.aydoo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestFormato {
	
	@Test
	public void formatoDeberiaSerDirectoCuandoHayParametros(){
		Formato formateador = new Formato("", "");
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		formateador.aplicarFormato(listaNumeros);
		
		List<Integer> valorObtenido = formateador.getListaNumeros();
		List<Integer> valorEsprado = new LinkedList<Integer>();
		valorEsprado.addAll(Arrays.asList(0, 1, 1, 2, 3));
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}

	@Test
	public void formatoDeberiaDevolverFormatoDirectoCuandoArgumentoEsD() {
		String direccion = "d";
		Formato formateador = new Formato("", direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		List<Integer> valorObtenido = formateador.getListaNumeros();
		List<Integer> valorEsprado = new LinkedList<Integer>();
		valorEsprado.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
	
	@Test
	public void formatoDeberiaDevolverFormatoIndirectoCuandoArgumentoEsI() {
		String posicion = "v";
		String direccion = "i";
		Formato formateador = new Formato(posicion, direccion);
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.add(0 , 0);
		listaNumeros.add(1 , 1);
		listaNumeros.add(2 , 1);
		listaNumeros.add(3 , 2);
		listaNumeros.add(4 , 3);
		listaNumeros.add(5 , 5);
		listaNumeros.add(6 , 8);
		listaNumeros.add(7 , 13);
		
		formateador.aplicarFormato(listaNumeros);
		
		List<Integer> valorObtenido = formateador.getListaNumeros();
		List<Integer> valorEsprado = new LinkedList<Integer>();
		valorEsprado.addAll(Arrays.asList(13, 8, 5, 3, 2, 1, 1, 0));
		
		Assert.assertEquals(valorEsprado, valorObtenido);
	}
}
