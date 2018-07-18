package ar.edu.untref.aydoo;

import java.util.List;

public class Programa {
	public static final void main(String arg[]) throws Exception {
		ManejadorArgumentosEntrada manejador = new ManejadorArgumentosEntrada(arg);
		manejador.separarArgumentos();
		List<String[]> listaInversiones = manejador.getListaInversiones();
		Inversor inversor = new Inversor();
		for(int i = 0; i < listaInversiones.size(); i++) {
			Inversion inversion = new PlazoFijoTradicional(listaInversiones.get(i));
			inversor.realizarInversion(inversion);
		}
		double gananciaObtenida = inversor.calcularGananciasObtenidas();
		Impuesto impuesto = new ImpuestosIndividuo(manejador.getTipoCliente());
		double impuestoObtenido = impuesto.aplicarImpuesto(gananciaObtenida);
		Salida salida = new Salida(gananciaObtenida, impuestoObtenido);
		System.out.println(salida.generarSalida());
	}
}
