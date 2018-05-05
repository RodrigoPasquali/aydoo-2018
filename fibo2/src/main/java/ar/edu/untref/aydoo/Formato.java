package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.List;

public class Formato {
	
	private String cadenaSucecion;
	private String direccion;
	private List<Integer> listaNumeros;
		
	public Formato(String orientacionIngresada, String direccionIngresada) {
		this.direccion = direccionIngresada;
	}

	public void aplicarFormato(List<Integer> listaNumerosIngresada) {
		this.listaNumeros = listaNumerosIngresada;
		this.aplicarDireccion(this.listaNumeros);
	}
	
	private void aplicarDireccion(List<Integer> listaNumeros) {
		if(this.direccion.equals("i")) {
			Collections.reverse(listaNumeros);
		}
	}	
	
	public String getSucesion(){
		return cadenaSucecion;
	} 
	
	public List<Integer> getListaNumeros() {
		return this.listaNumeros;
	}

}
