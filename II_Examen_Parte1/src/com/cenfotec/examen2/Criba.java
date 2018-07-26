package com.cenfotec.examen2;

public class Criba {
	public int[] generaCriba(int tope){
		int i,j;
		if (tope >= 2){
			
			int dim = tope+1;
			
			boolean[] primo = rellenarArreglo(dim);

			int cuenta = contadorPrimos(dim, primo);
			
			int[] primos = obtenerArregloConPrimos(dim, cuenta, primo);
			
			return primos;
		} else {
			return new int[0];
		}
	}

	private int[] obtenerArregloConPrimos(int dim, int cuenta, boolean[] primo) {
		int[] primos = new int[cuenta];
		for (int i = 0,j=0; i < dim; i++){
			if (primo[i])
				primos[j++] = i;
		}
		return primos;
	}
	
	private int contadorPrimos(int dim, boolean[] primo) {
		int i;
		int cuenta = 0;
		
		for (i = 0; i < dim; i++){
			if (primo[i])
				cuenta++;
		}
		return cuenta;
	}
	
	private boolean[] rellenarArreglo(int dim) {

		int i,j;
		
		boolean[] primo = new boolean[dim];
		
		for (i = 0; i < dim; i++){
			
			if(i > 1) {
				primo[i] = true;
			}else {
				primo[i] = false;	
			}
		}

		for (i = 2; i < Math.sqrt(dim) + 1; i++){
			if (primo[i]){
				for (j = 2*i; j < dim; j+=i){
					primo[j] = false;
				}
			}
		}
		return primo;
		
		
	}
}
