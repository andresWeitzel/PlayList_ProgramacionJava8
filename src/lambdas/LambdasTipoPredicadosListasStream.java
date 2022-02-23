package lambdas;

import java.util.function.Predicate;

public class LambdasTipoPredicadosListasStream {
	
	public static void main(String[] args) {
		
		Notebook notebookHP = new Notebook(1,"HP DELIRON");
		
		
		Predicate<String> notebook = 
				nombre -> (nombre == notebookHP.getNombre()); 
				
		
		System.out.println(notebook.test("HP DELIR"));
		System.out.println(notebook.test("HP DELIRON"));
		
	}

}


class Notebook{
	
	int id;
	String nombre;
	
	
	public Notebook(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public Notebook() {
		super();
	}

	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Notebook [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}