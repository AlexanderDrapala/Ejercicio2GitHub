import java.util.Scanner;

public class builderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder cadena1 = new StringBuilder(10);
		StringBuilder cadena2 = new StringBuilder("Segundo Trimestre");
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		
		System.out.println();
		
		System.out.println("La longitud de la cadena1 es de: " + cadena1.length());
		System.out.println("La longitud de la cadena2 es de: " + cadena2.length());
		
		System.out.println();
		
		System.out.println("La capacidad de la cadena1 es de: " + cadena1.capacity());
		System.out.println("La capacidad de la cadena2 es de: " + cadena2.capacity());
		
		System.out.println();
		
		System.out.println("La cadena1 una vez dada la vuelta tiene la siguente forma: " + cadena1.reverse());
		System.out.println("La cadena2 una vez dada la vuelta tiene la siguente forma: " + cadena2.reverse());
		
		System.out.println();
		
		System.out.println("Esto es lo que devuelve la cadena1 al buscar en la posicion 5: " + cadena1.charAt(5));
		System.out.println("Esto es lo que devuelve la cadena2 al buscar en la posicion 6: " + cadena2.charAt(6));
		
		System.out.println();

		System.out.println("Insertaremos la letra a en la posicion 0 de la cadena1: " + cadena1.insert(0, "a"));
		System.out.println("Insertaremos la letra a en la posicion 6 de la cadena2: " + cadena2.insert(6, "a"));
		
		System.out.println();
		
		cadena1.setLength(20);
		cadena1.setLength(37);
		System.out.println("Aumentaremos en 10 la longitud de la cadena1 y ahora tiene: " + cadena1.length());
		System.out.println("Aumentaremos en 10 la longitud de la cadena2 y ahora tiene: " + cadena2.length());
		
		System.out.println();

		System.out.println("Eliminaremos los caracteres que hay entre la posicion 0 y la 3 de la cadena1: " + cadena1.delete(0,2));
		System.out.println("Eliminaremos los caracteres que hay entre la posicion 0 y la 3 de la cadena2: " + cadena2.delete(0,2));
		
		System.out.println();

		System.out.println("Reemplazaremos un caracter que este en la posicion 0 y la 1 de la cadena1: " + cadena1.replace(0,1,"b"));
		System.out.println("Reemplazaremos un caracter que este en la posicion 0 y la 1 de la cadena2: " + cadena2.replace(0,1,"d"));
		
		System.out.println();

		System.out.println("Resultado de concatenar ambas cadenas: " + cadena1.append(cadena2));
		
		System.out.println();

		//pasar a string
		
		String transformada = cadena2.toString();
		
		
		
		System.out.println("Introduzca una frase para saber si es un palindromo");
		
		Scanner sc = new Scanner(System.in);
		String frasecadena = sc.nextLine();
		
		frasecadena = frasecadena.toLowerCase().replace(" ","");
		
		StringBuilder frase = new StringBuilder(frasecadena);
		StringBuilder fraseInvertida = new StringBuilder(frase.reverse());
		
		if (frase.compareTo(fraseInvertida) == 0) {
			System.out.println("La frase introducida es un palindromo");
		}else {
			System.out.println("La frase introducida no es palindromo");
		}
		
		
		
	}

}
