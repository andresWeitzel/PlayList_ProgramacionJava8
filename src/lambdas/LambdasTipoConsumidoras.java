package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTipoConsumidoras {
	
	//https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples/?ref=gcse
	
	public static void main(String[] args) {
		
		System.out.println("***************************************************************");
		System.out.println("** LAS LAMBDA DE TIPO CONSUMIDORES SON EXPRESIONES");
		System.out.println("QUE ACEPTAN UN SOLO VALOR Y NO DEVUELVEN VALOR ALGUNO");
		System.out.println("***************************************************************\n");
		
		
		System.out.println("\n--- Imprimir Número Entero---");
		
		Consumer<Integer> numero = n1 -> System.out.println(n1);
		
		numero.accept(12);
		numero.accept(444);
		
		
		
		
		System.out.println("\n--- Imprimir Número Decimal---");
		
		Consumer<Double> num01 = n1 -> System.out.println(n1);
		Consumer<Float> num02 = n1 -> System.out.println(n1);
		
		num01.accept(5.5);
		num02.accept(7.99f);
		
		
		
		System.out.println("\n--- Imprimir Cadena---");
		
		Consumer<String> texto = n1 -> System.out.println(n1);
		
		
		texto.accept("La casa de Papel");
		
		
		

		
		
	}

}
