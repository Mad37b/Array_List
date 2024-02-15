import java.util.*;
public class EjemploArrayList01 {
	static ArrayList<String> listaClase = new ArrayList();
	static Scanner t = new Scanner ( System.in);
	// add
	
	// clear
	
	public static void main (String[] arg) {
		// Lista de objetos de encontramos en clase 
		
		System.out.println("------------------------------- Ejemplo ArrayList ----------------------------");
		System.out.print(" Tenemos en la lista "+ listaClase.size()+" elementos");
		
		//Añadir objetos 
		
		listaClase.add("Pizarra");
		listaClase.add("Proyector");
		listaClase.add("Mesa");
		listaClase.add("sillas");
		listaClase.add("Perchero");
		
		System.out.println("\n Tenemos en la lista "+ listaClase.size()+" elementos");
		
		//Elemento que ocupa un lugar 
		
		System.out.println("El elemento que ocupa el lugar 0 es "+listaClase.get(0));
		System.out.println("El elemento que ocupa el lugar 1 es "+listaClase.get(1));
		
		// Como mostrar todo los elementos 
		
		// Recorrer como un for 
		
		System.err.println("----------------------------------------------------------------------");
		System.out.println("	1) Recorrido por indice");
		System.out.println("---------------------------------------------------------------------------");
	
		for ( int i=0;i<listaClase.size();i++) {
			System.out.println("El elemento que ocupa el lugar "+ i+" es "+listaClase.get(i));
			System.out.println( i+" es "+listaClase.get(i));
		}
		System.err.println("----------------------------------------------------------------------");
		// Accede directamente los objetos 
		System.out.println("	2) Recorrido por objeto");
		System.out.println("---------------------------------------------------------------------------");
		for ( String objeto:listaClase) {
			System.out.println(objeto);
		}
		System.out.println("----------------------------------------------------------------------");
		// Accede directamente los objetos 
		System.out.println("	3) Por teclado");
		System.out.println("-------------------------------------------------------------------------");
		
		
		// por teclado 
		
		System.out.print("\t ¿Que objeto quieres buscar? = ");
		String buscar = t.nextLine();
		
		if (listaClase.contains(buscar)) {
		 System.out.println("\t   "+buscar + " esta en la lista");
		}else 
			System.out.println(buscar + " no esta en la lista");
		
		// borrar elemento 
		
		System.out.println("----------------------------------------------------------------------");
		// Borrar los elementos 
		System.out.println("	4) Borrar los elementos seleccionados");
		System.out.println("-------------------------------------------------------------------------");
		
		
		System.out.print("¿Que objeto quieres borrar? = ");
		buscar = t.nextLine();
		
		if (listaClase.contains(buscar)) {
		 System.out.println("\t"+buscar + " va a ser borrado");
		 listaClase.remove(buscar);
		 System.out.println("---------------------------------");
		 System.out.println(buscar+"  a sido borrado");
		}else 
			System.out.println(buscar + " no ha sido borrado");
		
		// mostrar lista 
		
		mostrarLista();
		cambiarElemento();
		mostrarListaOrdenada();
		
		
	}
public static void mostrarLista() {
	for ( String objeto:listaClase) {
		System.out.println(objeto);
	}
	
}

static void cambiarElemento() {
	System.out.println("Cambiar Elemento de esta lista ");
	mostrarLista();
String objeto = t.nextLine();
if ( listaClase.contains(objeto)) {
	int pos= listaClase.indexOf(objeto);
	System.out.println("Cual es el nuevo valor de " + objeto);
	String nValor=t.nextLine();
	listaClase.set(pos, nValor);
	
}
}
static void mostrarListaOrdenada(){
	System.out.println("La lista finalmente quedaria ordenada");
	listaClase.sort(null);
	mostrarLista();
	
}

}
