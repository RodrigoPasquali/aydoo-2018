package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import excepciones.ExcepcionFuncionamientoInvalido;

public class FuncionamientoSumatoria extends Funcionamiento {
		
	public FuncionamientoSumatoria(int numeroSucesiones, String funcionamientoIngresado) {
		super(numeroSucesiones, funcionamientoIngresado);
	}


	@Override
	public List<Integer> aplicarFuncionamiento() {
		if(this.funcionamiento.equals("s")) {
			this.calcularSumatoria(this.getListaNumeros());
			return this.getListaNumeros();
		} else {
	        throw new ExcepcionFuncionamientoInvalido();
		}
	}	
	
	public void calcularSumatoria(List<Integer> listaDeNumeros){
		int total = 0;
		List<Integer> sumatoria = new LinkedList<Integer>();
		for(int i = 0; i < listaDeNumeros.size(); i++) {
			total = total + listaDeNumeros.get(i);
		}
		sumatoria.add(total);
		this.setListaNumeros(sumatoria);
	}
	
}
