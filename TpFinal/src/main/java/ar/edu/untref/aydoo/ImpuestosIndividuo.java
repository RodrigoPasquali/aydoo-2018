package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Map;

public class ImpuestosIndividuo {
	private Map<Integer[], Double> tablaImpuestos;

	public ImpuestosIndividuo() {
		Integer[] limiteGanancias1 = {0, 50000};
		Integer[] limiteGanancias2 = {50000, 100000};
		Integer[] limiteGanancias3 = {100000, 500000};
		Integer[] limiteGanancias4 = {500000, 99999999};
		this.tablaImpuestos = new HashMap<Integer[], Double>();
		this.tablaImpuestos.put(limiteGanancias1, 0d);
		this.tablaImpuestos.put(limiteGanancias2, 5d);
		this.tablaImpuestos.put(limiteGanancias3, 8d);
		this.tablaImpuestos.put(limiteGanancias4, 10d);		
	}
	
	public double aplicarImpuesto(double ganancia) {
		double impuestoAPagar = 0;
		for (Map.Entry<Integer[], Double> entry : this.tablaImpuestos.entrySet()) {
			Integer valorMinimo = entry.getKey()[0];
			Integer valorMaximo = entry.getKey()[1];
			if((valorMinimo <= ganancia) && (ganancia < valorMaximo)) {
				impuestoAPagar = impuestoAPagar + ganancia * (entry.getValue() / 100);
			}
		}
		return impuestoAPagar;
	}
	
	public void agregarNuevoLimiteGanancia(Integer valorMinimo, Integer valorMaximo, Double porcentajeImpuesto) {
		Integer[] nuevoLimiteGanancia = {valorMinimo, valorMaximo};
		this.tablaImpuestos.put(nuevoLimiteGanancia, porcentajeImpuesto);
	}
}
