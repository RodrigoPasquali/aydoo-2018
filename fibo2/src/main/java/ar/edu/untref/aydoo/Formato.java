package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.List;

public class Formato {
	
	private String cadenaSucecion;
	private String orientacion;
	private String direccion;
		
	public Formato(String orientacionIngresada, String direccionIngresada) {
		this.orientacion = orientacionIngresada;
		this.direccion = direccionIngresada;
	}

	public void aplicarFormato(List<Integer> listaNumeros){
		this.cadenaSucecion = "fibo<" +listaNumeros.size() + ">: ";
		this.aplicarDireccion(listaNumeros);
		for(int i = 0; i < listaNumeros.size(); i++){
			//cadenaSucecion = cadenaSucecion + listaNumeros.get(i).toString() + " ";
			this.aplicarOrientacion(listaNumeros, i);
		}
	}
	
	private void aplicarOrientacion(List<Integer> listaNumeros, int posicion) {
		if(this.orientacion.equals("v")) {
			this.aplicarOrientacionVertical(listaNumeros, posicion);
		} else {
			this.aplicarOrientacionHorizontal(listaNumeros, posicion);
		}
	}
	
	private void aplicarOrientacionHorizontal(List<Integer> listaNumeros, int posicion) {
		this.cadenaSucecion = this.cadenaSucecion + listaNumeros.get(posicion).toString() + " ";
	}
	
	private void aplicarOrientacionVertical(List<Integer> listaNumeros, int posicion) {
		this.cadenaSucecion = this.cadenaSucecion + "\r\n" +  listaNumeros.get(posicion).toString();
	}
	
	private void aplicarDireccion(List<Integer> listaNumeros) {
		if(this.direccion.equals("i")) {
			Collections.reverse(listaNumeros);
		}
	}	
	
	public String getSucesion(){
		return cadenaSucecion;
	} 

}
