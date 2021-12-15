package lambdas;

import java.util.function.Predicate;

public class PredicadosLambdas {
	
	public static void main(String[] args) {
		
		//https://mkyong.com/java8/java-8-predicate-examples/
		//https://www.ecodeup.com/entendiendo-paso-a-paso-las-expresiones-lambda-en-java/
		//https://www.adictosaltrabajo.com/2015/12/04/expresiones-lambda-con-java-8/
		//https://www.geeksforgeeks.org/java-8-predicate-with-examples/
		
		Predicate<String> cadenaDeTexto = (c1) -> c1.length() > 5;
		
		System.out.println(cadenaDeTexto.test("Este es un texto!"));
		
		
		System.out.println("-------------------------------------------");
	
		Predicate<String> cadenaDeTexto02 = (cadena01) -> cadena01.length() > 5;
		
		System.out.println(
				cadenaDeTexto02.test("Esto es una texto")
				|| cadenaDeTexto02.test("Esto es otro texto") 
				);
		
		System.out.println("-------------------------------------------");
		
		
		
		Predicate<String> cadenaDeTexto03 = 
				(cadena01) -> 
							cadena01.length() > 5
							|| cadena01.length() < 5;
		
		
		
		System.out.println(cadenaDeTexto03.test("dasdasad"));
		
		

		
		
		System.out.println("---------------------------------------------");
		
		Predicate<Integer> numero02 = n1 -> (n1 > 12);
		
		System.out.println(numero02.test(10));
		
		
		Predicate<Integer> numero03 = n1 -> (n1 > 12);
		
		System.out.println(numero03.test(10) || numero03.test(7));
		
	
		
	
		
	}

}
