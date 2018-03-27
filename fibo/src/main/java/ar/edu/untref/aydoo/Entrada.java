package ar.edu.untref.aydoo;

public class Entrada {
	
	public int getNumero(String cadena[]) throws Exception {
		String argumento;
		int numeroObtenido = 0;
		for (int i = 0; i < cadena.length; i++) {
			argumento = cadena[i];
			try {
				numeroObtenido = Integer.parseInt(argumento);

		       	} catch (NumberFormatException nfe) {
		       		throw new Exception("Debe introducir el numero de suceciones");
		   	}
		}
	    return numeroObtenido;
   }

}
