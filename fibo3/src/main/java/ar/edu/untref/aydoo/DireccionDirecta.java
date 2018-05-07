package ar.edu.untref.aydoo;

import java.util.List;

public class DireccionDirecta extends Direccion{
	
	private Direccion direccionSiguiente;
	
	public DireccionDirecta(List<Integer> listaNumerosIngresada, String direccionIngresada) {
		super(listaNumerosIngresada, direccionIngresada);
		this.direccionSiguiente = new DireccionInversa(listaNumerosIngresada, direccionIngresada);
	}

	@Override
	public List<Integer> aplicarDireccion() {
		this.setSiguienteDireccion(this.direccionSiguiente);
		if(!this.direccion.equals("d")) {
			return this.getSiguienteDireccion().aplicarDireccion();
		} else {
			return this.listaNumeros;
		}
	}
	
}
