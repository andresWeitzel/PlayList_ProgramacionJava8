package lambdas;

import java.util.function.Predicate;

public class PredicadosLambdas {
	
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
		
		System.out.println("\n--- Comparar 1 Número---");
		
		int numControl = 12;
		int numComparar = 10;
		
		Predicate<Integer> numero02 = n1 -> (n1 > numControl);
		
		System.out.println(numero02.test(numComparar));
		

		System.out.println("\n--- Comparar 2 Números Comparador OR---");
		
		
		Predicate<Integer> numero03 = n1 -> (n1 > numControl);
		
		System.out.println(numero03.test(17) || numero03.test(7));
		

		System.out.println("\n--- Comparar 2 Números Comparador AND---");
		
		
		Predicate<Integer> numero04 = n1 -> (n1 > numControl);
		
		System.out.println(numero04.test(17) && numero04.test(98));
		
		
		System.out.println("\n--- Comparar  Números Función OR y AND---");
		
		
		int numControl02 = numControl + 3;
		
		
		Predicate<Integer> numero05 = n1 -> (n1 > numControl02);
		
		Predicate<Integer> numero06 = n2 -> (n2 > 22);
		
		System.out.println(numero05.or(numero06).test(17));
		
		System.out.println(numero05.and(numero06).test(17));
		
		System.out.println(
				numero05.and(numero06).test(17) 
				|| numero05.and(numero06).test(36)
				);
		
		

		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Decimal (Double) =========");
		System.out.println("==================================================\n");
		
		System.out.println("\n--- Comparar 1 Número---");
		
		
		Predicate<Double> decimal01 = n1 -> (n1 > 5.8);
		
		System.out.println(decimal01.test(3.4));
		
		
		System.out.println("\n--- Igualdad de Objetos---");
		
		
		Predicate<Double> decimal02 = n1 -> (n1 > 5.8);
		
		System.out.println(decimal02.equals(decimal01));
		
		System.out.println(decimal01);
		System.out.println(decimal02);
		
		System.out.println("--------------------------");
		
		System.out.println(decimal01.toString());
		System.out.println(decimal02.toString());
		
		
		System.out.println("\n--- Negacion de Comparacion de  1 Número---");
		
		Predicate<Double> decimal03 = n1 -> (n1 > 5.8);
		
		// El valor del resultado lo negamos
		System.out.println(decimal03.negate().test(6.8));
		
		
	
		
	
		
	}

}
