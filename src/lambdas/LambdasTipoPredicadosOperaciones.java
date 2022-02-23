package lambdas;

import java.util.function.Predicate;

public class LambdasTipoPredicadosOperaciones {
	
	public static void main(String[] args) {
		
		


		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Decimal (Double) =========");
		System.out.println("==================================================\n");
		
		
	
	
		
		System.out.println("\n--- Operar sobre un Número y Comparar su Igualdad---");
		
		
		Predicate<Double> decimal04 = n1 -> (n1.sum(n1, 22.2) == 123.2);
		
		// (12 + 22.2)  = 34.2
		System.out.println(decimal04.test(12.0));
		
		// (101.0 + 22.2) = 123.2 
		System.out.println(decimal04.test(101.0));
		
		

		
		System.out.println("\n--- Comparamos sobre 1 Número y luego Comparamos el resultado de Una Operacion--");
		
		
		Predicate<Double> decimal05 = n1 -> (n1.compare(n1, 12.2) == (1.2 + 1.3) );
		
		// La Primera Comparacion es true pero cuando se compara con la suma no lo es
		System.out.println(decimal05.test(12.2));
		
		

		System.out.println("\n--- Comparamos el maximo de 2 Números con Otro--");
		
		
		Predicate<Double> decimal06 = n1 -> (n1.max(n1, 2.2) > 12.2);
		
	
		System.out.println(decimal06.test(3.2));
		
		System.out.println(decimal06.test(13.2));
		
		

		
		
		
		
		
	}

}
