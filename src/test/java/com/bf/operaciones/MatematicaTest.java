package com.bf.operaciones;

import org.junit.Assert;
import org.junit.Test;

public class MatematicaTest {
	@Test
	public void sumaTest() {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de una suma", 10, matematica.suma(4, 6));
	}
	
	@Test
	public void restaTest() {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de una resta", 10, matematica.resta(20, 10));
	}
	
	@Test
	public void divideTest() throws Exception {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de una divison", 10, matematica.divide(100, 10));
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividePorCeroTest() throws Exception {
		Matematica matematica = new Matematica();
		Assert.assertEquals("Verifico el resultado de una divison", 10, matematica.divide(100, 0));
	}
}
