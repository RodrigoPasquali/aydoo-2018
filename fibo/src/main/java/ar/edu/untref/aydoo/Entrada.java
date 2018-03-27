package ar.edu.untref.aydoo;

public class Entrada {
	
	public int getNumero(String cadena) throws Exception {
		try {
   			int numeroObtenido = Integer.parseInt(cadena);
   			return numeroObtenido;
       	} catch (NumberFormatException nfe) {
       		throw new Exception("Debe introducir el numero de suceciones");
   		}
   }

}
