package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido, 
	static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	/**	 
	 * Para ejecutar el método main se debe hacer boton derecho sobre la clase
	 * "Run As --> Java Application" 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** inicializando datos ****");
		
		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));
	
		System.out.println("**** inicializacion exitosa ****");

		// EJERCICIO 4.1: explicar salidas y sugerir mejoras
		informacion(lista1, 10);
		
		// EJERCICIO 4.2: corregir el metodo
		List<Integer> union = unionListas(lista1, lista2);
		System.out.println("union: " + union.toString());
		
		// EJERCICIO 4.3: implementar
		List<Integer> interseccion = interseccionListas(lista1, lista2);
		System.out.println("interseccion: " + interseccion.toString());
		
		// EJERCICIO 4.4: implementar
		List<Integer> orden1 = ordenaListaAscendente(lista1);
		System.out.println("orden asc: " + orden1);
		
		// EJERCICIO 4.5: implementar
		List<Integer> orden2 = ordenaListaDescendente(lista2);
		System.out.println("orden desc: " + orden2);

		// EJERCICIO 4.6: implementar
		boolean b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);
		
	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		// TODO: explicar salidas de los system out y sugerir alguna mejora a la implementacion
		
		int pares = 0;
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1; // Se van contando la cantidad de pares
			}
		}
		
		// Se podria mostrar cuales son los pares(como esta hecho con los impares) y
		// ser mas clara la informacion con leyendas como "Pares: "		
		System.out.println("... " + pares); // Se muestran por consola la cantidad de pares
		
		List<Integer> impares = new ArrayList<Integer>();
		for (Integer n: lista1) {
			if (n % 2 != 0) {
				impares.add(n); // Se van agregando en una lista
				// Se podria recorrer la lista de numeros original e ir mostrando los pares,
				//sin necesidad de crear la lista 'impares'
			}
		}
		
		// Se podria mostrar la cantidad de impares(como esta hecho con los pares) y
		// ser mas clara la informacion con leyendas como "Impares: "
		System.out.println("... " + impares.toString()); // Se muestran por consola la lista de impares
		
		int p = lista1.size() / 2; // Tamaño de la lista dividido 2		

		System.out.println("..." + lista1.indexOf(p)); // Se imprime por consola el indice de la mitad de la lista
		
		int c = 0;
		for (Integer n: lista1) { // Se recorre la lista 1, si el numero es mayor a 10, se cuenta
			if (n > numero) {
				c = c + 1; // Cantidad de numeros de la lista mayores a "numero" (10)
			}
		}
		if (c > lista1.size() / 2) {
			System.out.println("...");  // la cantidad de numeros > 10 es mayor que el tamaño de la mitad de la lista
		} else if (c > 0) {
			System.out.println("...");  // la cantidad de numeros > 10 es mayor a 0
		} else {
			System.out.println("..");  // la cantidad de numeros > 10 es menor a 0
		}
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos de ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO: corregir el metodo para que funcione correctamente 		
		// List<Integer> union = null;
		//union.addAll(lista1);	
		List<Integer> union = new ArrayList<Integer>(); // Instancio el arrayList
		// La lista 1 ya tiene el elemeno "8" repetido, entonces es necesario quitarlo
		for (Integer m: lista1) {
			if (!union.contains(m)) {
				union.add(m);
			}else {
			}
		}
		//Recorro la lista 2	
		for (Integer m: lista2) {
			if (!union.contains(m)) {
				union.add(m);
			}else {
			}
		}
		
//		 // Otra solucion alternativa podria ser utilizando un HashSet
//		 HashSet hs = new HashSet();
//	     //Lo cargo con los valores del array, esto hace quite los repetidos
//	     hs.addAll(lista1);
//	     hs.addAll(lista2);
//	     union.clear();
//	     //Agrego los valores sin repetir
//	     union.addAll(hs);
		
		return union;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos que estan presentes en ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO:
		 List<Integer> l1 = new ArrayList<Integer>(); // Instancio el arrayList
		 List<Integer> l2 = new ArrayList<Integer>(); // Instancio el arrayList
		// La lista 1 ya tiene el elemeno "8" repetido, entonces es necessaro quitarlo
			for (Integer m: lista1) {
				if (!l1.contains(m)) {
					l1.add(m);
				}else {
				}
			}
			//Recorro la lista 2	
			for (Integer m: lista2) {
				if (!l2.contains(m)) {
					l2.add(m);
				}else {					
				}
			}
			l1.retainAll(l2);	
		return l1;
	}

	/***
	 * @param lista1
	 * 
	 * retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {
		// TODO:
		List<Integer> ordenAscendente = new ArrayList<Integer>();
		ordenAscendente = lista1;
		 Collections.sort(ordenAscendente);
		return ordenAscendente;
	}

	/***
	 * @param lista2
	 * 
	 * retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {
		// TODO:
		 List<Integer> ordenDescendente = new ArrayList<Integer>();
		 ordenDescendente = lista2;	 
		 Collections.sort(ordenDescendente,Collections.reverseOrder() );
		return ordenDescendente;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * devuelve true si contienen los mismos elementos
	 * NO se considera valido que esten en diferente orden
	 * NO se considera valido que la cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {
		// TODO:
		boolean bandera = false;
		int tamanioLista1 = lista1.size();
		int tamanioLista2 = lista2.size();
		if(tamanioLista1 != tamanioLista2) {
			return false;
		}else {
			int indice = 0;
			for (Integer m: lista1) {
				if (lista2.get(indice)!= m) {
					bandera = true;
				}
				indice = indice +1;
			}
		}
		if(bandera) {
			return false;
		}else {
			return true;
		}
	}

}
