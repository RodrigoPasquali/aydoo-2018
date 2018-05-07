package ar.edu.untref.aydoo;

import java.util.List;

public class FuncionamientoLista extends Funcionamiento{
	
	public FuncionamientoLista(int numeroSucesiones, String funcionamientoIngresado) {
		super(numeroSucesiones, funcionamientoIngresado);
		this.siguienteFuncionamiento = new FuncionamientoSumatoria(numeroSucesiones, funcionamientoIngresado);
	}

	@Override
	public List<Integer> aplicarFuncionamiento() {
		this.setSiguienteFuncionamiento(this.siguienteFuncionamiento);
		if(this.funcionamiento.equals("l") || this.funcionamiento.equals("")) {
			return this.getListaNumeros();
		} else {
			return this.getSiguienteFuncionamiento().aplicarFuncionamiento();
		}
	}	
	
}
