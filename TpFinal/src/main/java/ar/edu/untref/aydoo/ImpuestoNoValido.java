package ar.edu.untref.aydoo;

import excepciones.ExcepcionUsuarioNoValido;

public class ImpuestoNoValido extends Impuesto{

	public ImpuestoNoValido(String impuestoIngresado) {
		super(impuestoIngresado);
	}

	@Override
	public double aplicarImpuesto(double ganancia) {
		throw new ExcepcionUsuarioNoValido();
	}
}
