package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Map;

import excepciones.ExcepcionUsuarioNoValido;

public class ImpuestosEmpresa extends Impuesto{
	private Map<Integer[], Double> tablaImpuestos;

	public ImpuestosEmpresa(String impuestoIngresado) {
		super(impuestoIngresado);
	}
	
	public double aplicarImpuesto(double ganancia) {
		if(this.getTipoCliente().equals("emp")) {
			this.crearTablaImpuestoInicial();
			double impuestoAPagar = 0;
			for (Map.Entry<Integer[], Double> entry : this.tablaImpuestos.entrySet()) {
				Integer valorMinimo = entry.getKey()[0];
				Integer valorMaximo = entry.getKey()[1];
				if((valorMinimo <= ganancia) && (ganancia < valorMaximo)) {
					impuestoAPagar = impuestoAPagar + ganancia * (entry.getValue() / 100);
				}
			}
			return impuestoAPagar;			
		} else {
			throw new ExcepcionUsuarioNoValido();
		}
	}
	
	private void crearTablaImpuestoInicial() {
		Integer[] limiteGanancias1 = {0, 20000};
		Integer[] limiteGanancias2 = {20000, 50000};
		Integer[] limiteGanancias3 = {50000, 100000};
		Integer[] limiteGanancias4 = {100000, 500000};
		Integer[] limiteGanancias5 = {500000, 99999999};
		this.tablaImpuestos = new HashMap<Integer[], Double>();
		this.tablaImpuestos.put(limiteGanancias1, 0d);
		this.tablaImpuestos.put(limiteGanancias2, 5d);
		this.tablaImpuestos.put(limiteGanancias3, 10d);
		this.tablaImpuestos.put(limiteGanancias4, 15d);		
		this.tablaImpuestos.put(limiteGanancias5, 20d);				
	}
}
