package ar.edu.untref.aydoo;

import java.util.List;

public class Formato {
	
	String cadenaSucecion;
		
	public void aplicarFormato(List<Integer> listaNumeros){
		cadenaSucecion = "fibo<" +listaNumeros.size() + ">: ";
		for(int i = 0; i < listaNumeros.size(); i++){
			cadenaSucecion = cadenaSucecion + listaNumeros.get(i).toString() + " ";
		}
	}

	public String getSucesion(){
		return cadenaSucecion;
	}

}
