package lambdas;

import java.util.function.Predicate;

public class LambdasTipoPredicados {
	
	public static void main(String[] args) {
		
		
		System.out.println("***************************************************************");
		System.out.println("** LAS LAMBDA DE TIPO PREDICADOS SON EXPRESIONES");
		System.out.println("QUE ACEPTAN UN PARÁMETRO O VARIOS Y DEVUELVEN UN VALOR LÓGICO");
		System.out.println("***************************************************************\n");
		
		
		
		//https://mkyong.com/java8/java-8-predicate-examples/
		//https://www.ecodeup.com/entendiendo-paso-a-paso-las-expresiones-lambda-en-java/
		//https://www.adictosaltrabajo.com/2015/12/04/expresiones-lambda-con-java-8/
		//https://www.geeksforgeeks.org/java-8-predicate-with-examples/
		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo String =========");
		System.out.println("==================================================\n");

		System.out.println("n--- Comparar Longitud una Cadena ---");
		
		
		Predicate<String> cadenaDeTexto = (c1) -> c1.length() > 5;
		
		System.out.println(cadenaDeTexto.test("Este es un texto!"));
		
		
		System.out.println("n--- Comparar Longitud de 2 Cadenas con Comparador OR ---");
		
		Predicate<String> cadenaDeTexto02 = (cadena01) -> cadena01.length() > 5;
		
		System.out.println(
				cadenaDeTexto02.test("Esto es una texto")
				|| cadenaDeTexto02.test("Esto es otro texto") 
				);
		
		

		System.out.println("\n--- Comparar Longitud de 1 Cadena con Comparador OR en Predicado---");
		
		
		Predicate<String> cadenaDeTexto03 = 
				(cadena01) -> 
							cadena01.length() > 5
							|| cadena01.length() < 5;
		
		
		
		System.out.println(cadenaDeTexto03.test("dasdasad"));
		
		
		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Integer =========");
		System.out.println("==================================================\n");
		
		int numControl = 12;
		int numComparar = 10;

		System.out.println("\n--- Comparamos 2 Números ---");
		
		Predicate<Integer> num02 = n1 -> (n1 > numControl);

		System.out.println(num02.test(numComparar));
		
		
		
		System.out.println("\n--- Comparamos 2 Números con Comparador OR ---");
		
		Predicate<Integer> num03 = n1 -> (n1 > numControl);

		System.out.println(num03.test(30) || num03.test(32));
		
		
		
		System.out.println("\n--- Comparamos 2 Números con Comparador AND ---");
		
		Predicate<Integer> num04 = n1 -> (n1 < numControl);

		System.out.println(num04.test(30) && num04.test(32));
		


		System.out.println("\n--- Comparamos 2 Números con 2 Expresiones Función OR ---");
		

		System.out.println(num03.or(num02).test(30));

	

		System.out.println("\n--- Comparamos 2 Números con 2 Expresiones Función AND ---");
		

		System.out.println(num03.and(num04).test(30));


		
		//====================================================================
		
		
		


		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Decimal (Double) =========");
		System.out.println("==================================================\n");
		
		System.out.println("\n--- Comparar 2 Número---");
		
		
		Predicate<Double> decimal01 = n1 -> (n1 > 5.8);
		
		System.out.println(decimal01.test(3.4));
		
		
		
		
		
		
		
		
		System.out.println("\n--- Comparar la Igualdad de Objetos---");
		
		
		Predicate<Double> decimal02 = n1 -> (n1.equals(9.78));
		
		System.out.println(decimal02.test(9.78));
		
		System.out.println(decimal02.test(9.79));
	
	
		
		System.out.println("\n--- Comparar la Igualdad de Objetos---");
		
	
		Predicate<Double> decimal03 = n1 -> (n1 == 0.0);
		
		System.out.println(decimal03.test(0.0));
		
		System.out.println(decimal03.test(0.22));
	
	
		
		System.out.println("\n--- Comparar la Desigualdad de Objetos---");
		
		
		Predicate<Double> decimal04 = n1 -> (n1 != 0.0);
		
		System.out.println(decimal04.test(0.0));
		
		System.out.println(decimal04.test(0.22));
		
		
		
		System.out.println("\n--- Comparar la Igualdad Negada de Objetos---");
		
		
		Predicate<Double> decimal05 = n1 -> (n1 == 0.0);
		
		// Invertimos el valor logico, si el resultado es true, la operacion es false
		System.out.println(decimal04.negate().test(0.0));
		
		
		System.out.println(decimal04.negate().test(0.22));
		
		
		
		
		
		
		
		
		
		

		
	}

}
