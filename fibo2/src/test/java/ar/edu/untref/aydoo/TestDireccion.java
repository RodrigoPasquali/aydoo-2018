package ar.edu.untref.aydoo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestDireccion {

	@Test
	public void cuandoNoSeIngresaDireccionDeberiaDevovlerDirecccionDirecta() {
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
		List<Integer> valorEsperado = listaNumeros;
		String direccionIngreasada = "";
		Direccion direccion = new DireccionDirecta(listaNumeros, direccionIngreasada);
		
		List<Integer> valorObtenido = direccion.aplicarDireccion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void cuandoSeIngresaDireccion_D_DeberiaDevovlerDirecccionDirecta() {
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
		List<Integer> valorEsperado = listaNumeros;
		String direccionIngreasada = "d";
		Direccion direccion = new DireccionDirecta(listaNumeros, direccionIngreasada);
		
		List<Integer> valorObtenido = direccion.aplicarDireccion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void cuandoSeIngresaDireccion_I_DeberiaDevovlerDirecccionInversa() {
		List<Integer> listaNumeros = new LinkedList<Integer>();
		listaNumeros.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
		List<Integer> valorEsperado = listaNumeros;
		Collections.reverse(valorEsperado);
		String direccionIngreasada = "";
		Direccion direccion = new DireccionDirecta(listaNumeros, direccionIngreasada);
		
		List<Integer> valorObtenido = direccion.aplicarDireccion();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
