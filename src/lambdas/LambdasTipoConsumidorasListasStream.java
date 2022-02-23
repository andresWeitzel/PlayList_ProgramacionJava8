package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdasTipoConsumidorasListasStream {
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("\n--- Imprimir Lista de Números Enteros---");
		
		List<Integer> numeros = new ArrayList();
		
		numeros.add(12);
		numeros.add(6);
		numeros.add(4545);
		numeros.add(22);
		
		
		
		// Los stream representan flujos de datos infinito que se las asocia a una coleccion
		// que definamos, ArrayList, List, etc
		
		Consumer <List<Integer>> listaNumeros = 
				lista -> lista
				.stream()
				.forEach(numero ->System.out.println(numero));;
				
	
		
		listaNumeros.accept(numeros);

		
		
		
		
		
		System.out.println("\n--- Imprimir Lista de Números Decimales---");
		
		List<Double> decimales = new ArrayList();
		
		decimales.add(9.8);
		decimales.add(5.5);
		decimales.add(99.3);
		
		
		Consumer <List<Double>> listaDecimales = 
				list -> list
				.stream()
				.forEach(num ->System.out.println(num));;
				
		listaDecimales.accept(decimales);
		
				
		
	}

}
