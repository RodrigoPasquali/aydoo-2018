package ar.edu.untref.aydoo;

import java.util.List;

public class FuncionamientoSumatoria {
		
	public int calcularSumatoria(List<Integer> listaDeNumeros){
		int total = 0;
		for(int i = 0; i < listaDeNumeros.size(); i++) {
			total = total + listaDeNumeros.get(i);
		}
		return total;
	}	
	
}
