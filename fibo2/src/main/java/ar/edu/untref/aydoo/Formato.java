package ar.edu.untref.aydoo;

import java.util.List;

public class Formato {
	
	String cadenaSucecion;
	private String orientacion;
		
	public Formato(String orientacionSeleccionada) {
		this.orientacion = orientacionSeleccionada;
	}

	public void aplicarFormato(List<Integer> listaNumeros){
		this.cadenaSucecion = "fibo<" +listaNumeros.size() + ">: ";
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
	public String getSucesion(){
		return cadenaSucecion;
	} 

}
