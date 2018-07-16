package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestPlazoFijoPrecancelable {	
	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver12500DeGananciaCuandoElMontoEs5000YElInteresEs25() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable();
		double valorEsperado = 12500;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia(100, 100, 25, 50000);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test
	public void realizarUnPlazoFijoPrecancelableDeberiaDevolver6250DeGananciaCuandoElMontoEs5000ElInteresEs25PlazoReal30() {	  
		PlazoFijoPrecancelable plazoFijoPrecancelable = new PlazoFijoPrecancelable();
		double valorEsperado = 12500;
		
		double valorObtenido = plazoFijoPrecancelable.calcularGanancia(100, 30, 25, 50000);
		
		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

}
