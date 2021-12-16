package lambdas;

import java.util.function.Consumer;

public class ConsumidoresLambdas {
	
	//https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples/?ref=gcse
	
	public static void main(String[] args) {
		
		System.out.println("***************************************************************");
		System.out.println("** LAS LAMBDA DE TIPO CONSUMIDORES SON EXPRESIONES");
		System.out.println("QUE ACEPTAN UN SOLO VALOR Y NO DEVUELVEN VALOR ALGUNO");
		System.out.println("***************************************************************\n");
		
		
		System.out.println("\n--- Imprimir Números---");
		
		Consumer<Integer> numero = n1 -> System.out.println(n1);
		
		numero.accept(12);
		numero.accept(444);
		
		
	}

}
