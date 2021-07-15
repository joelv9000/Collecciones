import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		/* La coleccion Set no puede contener elementos duplicados
		 * Solo tiene los metodos heredados de a collection
		 * Existen dif tipos de implementacion
		 * 
		 * HashSet : Esta implementacion al macena los elemeno sde iuna 
		 * tabla hash . Es la que mejor rendimietno tiene 
		 * Los elemento sno tiene orden .
		 * */
		Set<String> frutas = new LinkedHashSet();//HashSet//
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Fresa");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Marcuya");
		frutas.add("Platano");
		frutas.add("Limon");
		frutas.add("Pepino");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
		System.out.println(frutas.size());
		
	List<String> frutas2 = new ArrayList<String>();
	frutas2.add("Manzana");
	frutas2.add("Mango");
	frutas2.add("Fresa");
	frutas2.add("Durazno");
	frutas2.add("Pera");
	frutas2.add("Cereza");
	frutas2.add("Mandarina");
	frutas2.add("Carambola");
	frutas2.add("Marcuya");
	frutas2.add("Platano");
	frutas2.add("Limon");
	frutas2.add("Pepino");
	
	for(String f: frutas2) {
		System.out.println(f);
	}
	
	int pera = frutas2.indexOf("Pera");
	System.out.println(pera);
	System.out.println(frutas2.get(pera));
	//int es un dato primitivo
	//interger es un objeto
	
	
	
	
	List<Integer> agenda = new ArrayList<Integer>();
	agenda.add(123);
	agenda.add(456);
	agenda.add(789);
	
	for (Integer a: agenda) {
		System.out.println(a);
	}

	
	//linked list
	
	List<String> animales =new LinkedList<String>();
	animales.add("Perro");
	animales.add("Gato");
	animales.add("Conejo");
	animales.add("Tortugas");
	animales.add("Oso");
	
	for (String an : animales) {
	System.out.println(an);
	}
	
	/* La interfaz Map asociad claves a valores 
	 * No puede contener claves duplicadas y cada
	 * clave solo puede tener asociado un valor
	 * 
	 * Implementaciones
	 * HasgMap 
	 * TreeMap
	 * LinkedHashMap
	 * */
	
	Map diccionario = new HashMap();
	//diccionario.put(clave,valor);
	
	diccionario.put("elemento1","Carlos Eduardo");
	diccionario.put("telefono",121212);
	diccionario.put("llave,true");
	
	
	System.out.println(diccionario.get("element1"));
	
	for(String elemento:diccionario){
		System.out.println(elemento);
		
	}
}
