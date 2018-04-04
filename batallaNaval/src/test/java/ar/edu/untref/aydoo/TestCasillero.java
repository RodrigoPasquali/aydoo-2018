package ar.edu.untref.aydoo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestCasillero {
	
	@Test
	public void casilleroVacioDeberiaEstarVacio() {
		Casillero casillero = new Casillero();
		
		Assert.assertTrue(casillero.estaVacio());
	}

}
