package com.bf.operaciones;

public class Matematica {
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b - 1;
	}
	
	public int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("No se puede divir por CERO");
		}
		return a / b;
	}
}
