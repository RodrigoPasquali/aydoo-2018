package ar.edu.untref.aydoo;

import excepciones.ExcepcionInversionNoValida;

public class InversionNoValida extends Inversion{

	public InversionNoValida(String[] inversionIngresada) {
		super(inversionIngresada);
	}

	@Override
	public double calcularGanancia() {
		throw new ExcepcionInversionNoValida();
	}

}
