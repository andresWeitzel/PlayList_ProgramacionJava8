package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasTipoConsumidorasListasStreamRecorridosCompras {

	public static void main(String[] args) {

		Compras compra01 = new Compras(1, "Electrodomesticos", "Televisor Philips 42 pulgadas ", 1, 60000);

		Compras compra02 = new Compras(2, "Hogar", "Manteles", 4, 12000);

		Compras compra03 = new Compras(3, "Electrodomesticos", "Televisor Samsung HD 32 pulgadas ", 1, 45000);

		Compras compra04 = new Compras(4, "Deportes", "Musculosa de Lycra", 1, 9000);

		Compras compra05 = new Compras(5, "Deportes", "Zapatillas Running Número 43", 1, 18000);

		Compras compra06 = new Compras(6, "Hogar", "Set de Cubiertos Finos", 3, 12000);
		
		Compras compra07 = new Compras(7, "Deportes", "Pelota de Basquet Molten", 2, 20000);
		
		Compras compra08 = new Compras(8, "Electrodomesticos", "Ventilador Liliana", 5, 47000);
		

		List<Compras> listaCompras = new ArrayList();

		listaCompras.add(compra01);
		listaCompras.add(compra02);
		listaCompras.add(compra03);
		listaCompras.add(compra04);
		listaCompras.add(compra05);
		listaCompras.add(compra06);
		listaCompras.add(compra07);
		listaCompras.add(compra08);

		System.out.println("\n== Lista de Compras con Java7 (forEach) ==");

		// Recorrido con forEach convencional
		for (Compras lista : listaCompras) {

			System.out.println(lista.toString());

		}

		// Recorrido con Java 8
		// Debemos trabajar con Streams, un stream es una estructura de dato como
		// una lista, la diferencia es que es más eficiente en memoria con mucha
		// cantidad de objetos, ademas de que convierte los objetos en flujos de bytes

		System.out.println("\n== Lista de Compras con Java8 (streams y lambdas) ==");
		System.out.println("\n--Recorrido lambda Explicita--");
		// Aplicamos lambdas explicita dentro del forEach
		listaCompras.stream().forEach(objetoLista -> System.out.println(objetoLista.toString()));

		System.out.println("\n--Recorrido lambda Implicita--");
		// Aplicamos labdas implicita dentro del forEach
		listaCompras.stream().forEach(System.out::println);

		
		
		
		
		System.out.println("\n================");
		System.out.println("== CATEGORIA ==");
		System.out.println("================");

		
		
		// PODEMOS APLICAR RECORRIDO POR CAMPOS CON FOREACHS TAMBIEN, PERO NOS VAMOS
		// A CENTRAR CON JAVA8
		//USAREMOS FILTERS, QUE NOS SERVIRAN PARA COMPARAR VALORES DE CAMPOS
		
		System.out.println("\n== Lista de Compras Cuya Categoria sea Electrodomesticos ==");

		
		System.out.println("\n--Recorrido lambda Explicita--");
		// Aplicamos lambdas explicita dentro del forEach
		listaCompras
			.stream()
			.filter(objetoLista -> objetoLista.getCategoria() == "Electrodomesticos")
			.forEach(objetoLista -> System.out.println(objetoLista.toString()));

		System.out.println("\n--Recorrido lambda Implicita--");
		// Aplicamos labdas implicita dentro del forEach
		listaCompras
			.stream()
			.filter(objetoLista -> objetoLista.getCategoria() == "Electrodomesticos")
			.forEach(System.out::println);
		
		
		
		// A MENOS QUE NO SE INCLUYA OTRO METODO DENTRO DEL FOREACH TRABAJAREMOS CON LAMBDAS
		//IMPLICITAS PARA EL MISMO

		System.out.println("\n== Lista de Compras Cuya Categoria sea Hogar ==");

		listaCompras
			.stream()
			.filter(objetoLista -> objetoLista.getCategoria() == "Hogar")
			.forEach(System.out::println);

		
		

		System.out.println("\n================");
		System.out.println("==== CANTIDAD ====");
		System.out.println("================");

		

		System.out.println("\n== Lista de Compras Cuyas Cantidades de Productos "
				+ "sean Mayores a 2 ==");

		listaCompras
			.stream()
			.filter(objetoLista -> objetoLista.getCantidad() > 2)
			.forEach(System.out::println);
				
		
		System.out.println("\n== Lista de Compras Cuyas Cantidades de Productos "
				+ "sean Mayores a 3 ==");

		listaCompras
			.stream()
			.filter(objetoLista -> objetoLista.getCantidad() > 3)
			.forEach(System.out::println);
		
		
		System.out.println("\n== ID y CANTIDAD de la Lista Cuyas Cantidades de Productos "
				+ "sean Mayores a 3 ==");

		//SI NOS PIDEN UNA RESPUESTA DIFERENTE A UN TOSTRING USAREMOS LAMBDAS 
		//EXPLICITAS EN EL FOREACH
		listaCompras
			.stream()
			.filter(objetoLista -> objetoLista.getCantidad() > 3)
			.forEach(objetoLista-> System.out.println(
					"ID "+objetoLista.getId() + " | CANTIDAD " + objetoLista.getCantidad()));
				
		
		
		System.out.println("\n============================");
		System.out.println("==== CATEGORIA Y CANTIDAD ====");
		System.out.println("===============================");

		
		System.out.println("\n== Lista de Compras Cuyas Cantidades de Productos "
				+ "Comprados sean 1 y pertenezcan a la Categoria Electrodomesticos ==");

		listaCompras
			.stream()
			.filter(objetoLista -> (objetoLista.getCantidad() == 1
					&& objetoLista.getCategoria() == "Electrodomesticos"))
			.forEach(System.out::println);
		
		
		System.out.println("\n== Lista de Compras Cuyas Cantidades de Productos "
				+ "Comprados sean Mayores o Iguales a 1 y pertenezcan a la "
				+ "Categoria Deportes ==");

		listaCompras
			.stream()
			.filter(objetoLista -> (objetoLista.getCantidad() >= 1
					&& objetoLista.getCategoria() == "Deportes"))
			.forEach(System.out::println);
				
				
		System.out.println("\n== ID, PRODUCTO Y CANTIDAD de la Lista de Compras "
				+ "Cuyas Cantidades de Productos "
				+ "Comprados sean Mayores o Iguales a 1 y pertenezcan a la "
				+ "Categoria Deportes ==");

		listaCompras
			.stream()
			.filter(objetoLista -> (objetoLista.getCantidad() >= 1
					&& objetoLista.getCategoria() == "Deportes"))
			.forEach(objetoLista-> System.out.println(
					"ID : " + objetoLista.getId()
					+ " | PRODUCTO : " + objetoLista.getProducto() 
					+" | CANTIDAD : " + objetoLista.getCantidad()));
				
				

		
		System.out.println("\n====================================");
		System.out.println("==== CATEGORIA, CANTIDAD Y PRECIO ====");
		System.out.println("======================================");
		

		System.out.println("\n== Lista de Compras Cuyas Cantidades de Productos "
				+ "Comprados Mayores a 2, pertenezcan a la Categoria Electrodomesticos"
				+ "y su precio sea Mayor a 35000 ==");

		listaCompras
			.stream()
			.filter(objetoLista -> (objetoLista.getCantidad() > 2
					&& objetoLista.getCategoria() == "Electrodomesticos"
					&& objetoLista.getPrecio() > 35000))
			.forEach(System.out::println);
		
		
		System.out.println("\n== TABLA CON ID, CATEGORIA, PRODUCTO , CANTIDAD "
				+ "Y PRECIO de la "
				+ "Lista de Compras Cuyas Cantidades de Productos "
				+ "Comprados sean Mayores o iguales que 1, pertenezcan a la "
				+ "Categoria Electrodomesticos"
				+ "y su precio sea Mayor a 20000 ==");

		System.out.println("\n| ID |     CATEGORIA     |   PRODUCTO     |  CANTIDAD  |    PRECIO  |");
		System.out.println("------------------------------------------------------------------");
		listaCompras
			.stream()
			.filter(objetoLista -> (objetoLista.getCantidad() >= 1
					&& objetoLista.getCategoria() == "Electrodomesticos"
					&& objetoLista.getPrecio() > 20000))
			.forEach(objetoLista-> System.out.println(
					" | " 
					+ objetoLista.getId() + " | "
					+ objetoLista.getCategoria() + " | "
					+ objetoLista.getProducto() + " | "
					+ objetoLista.getCantidad() + " | "
					+ objetoLista.getPrecio() + " | "
					));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

class Compras {

	int id;
	String categoria;
	String producto;
	int cantidad;
	double precio;

	public Compras(int id, String categoria, String producto, int cantidad, double precio) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Compras() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Compras [id=" + id + ", categoria=" + categoria + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

}
