package ar.edu.untref.aydoo;

import java.util.List;

public class SalidaConsola extends Salida{	

	public SalidaConsola(List<Integer> listaNumerosIngresada) {
		super(listaNumerosIngresada);
	}

	@Override
	public void aplicarSalida() {
		String cadenaFianl = this.getCadenaSalida() + this.imprimirEnConsola(this.getCadenaSalida());
		this.setCadenaSalida(cadenaFianl);
		System.out.println(this.getCadenaSalida());
	}
	
	private String imprimirEnConsola(String cadena) {
		String respuestaGenerada = "";
		for(int i = 0; i < this.getListaNumeros().size(); i++){
			respuestaGenerada = respuestaGenerada + this.getListaNumeros().get(i).toString() + " ";
		}
		System.out.println(cadena);
		return respuestaGenerada;
	}

}
