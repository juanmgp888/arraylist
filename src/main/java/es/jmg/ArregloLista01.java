package es.jmg;

import java.util.ArrayList;
import java.util.Collections; // incluye sort()

public class ArregloLista01 {
/* Poner un punto de ruptura al final (ver variables por el depurador) y suprimir los System.out.println */

    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos al ArrayList
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        frutas.add("Mango");

        // Crear un ArrayList de tipo Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Agregar números al ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        
        // Tamaño del ArrayList 'numeros'
        System.out.println("Tamaño del ArrayList numeros: " + numeros.size());

        // Crear un ArrayList de tipo Double
        ArrayList<Double> precios = new ArrayList<>();
        
        // Agregar números decimales
        precios.add(19.99);
        precios.add(5.75);
        precios.add(12.49);
        
        // Mostrar el ArrayList
        System.out.println("Lista de precios: " + precios);


        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('T');
        caracteres.add('o');
        caracteres.add('l');
        caracteres.add('e');
        caracteres.add('d');
        caracteres.add('o');



        // Mostrar todos los elementos del ArrayList
        System.out.println("Lista de frutas: " + frutas);
        // Mostrar todos los elementos del ArrayList
        System.out.println("Lista de numeros: " + numeros);

        // Acceder a un elemento en una posición específica
        String frutaEnIndice1 = frutas.get(1);  // Accede a la fruta en el índice 1
        System.out.println("Fruta en índice 1: " + frutaEnIndice1);
        System.out.println("Obtenemos número que ocupa el índice 2 del ArrayList: "+numeros.get(2));
        int numEnIndice03 = numeros.get(3);
        System.out.println("Obtenemos número que ocupa el índice 3 del ArrayList: "+numEnIndice03);

        // Modificar un elemento
        frutas.set(1, "Pera");  // Cambiar "Banana" por "Pera"
        System.out.println("Lista de frutas después de modificar: " + frutas);
        // Modificar un elemento
        numeros.set(1, 25);  // Cambiar 20 por 25 (segundo elemento del ArrayList)
        System.out.println("Lista de números después de modificar: " + numeros);
        

        // Eliminar un elemento por índice
        frutas.remove(0);  // Eliminar el elemento en el índice 0 (Manzana)
        System.out.println("Lista de frutas después de eliminar: " + frutas);
        
        // Eliminar un elemento por índice
         numeros.remove(3);  // Eliminar el elemento en el índice 3 (40)
        System.out.println("Lista de números después de eliminar: " + numeros);
        // Agregar número 5 al principio.
        numeros.add(0,5);

        // Comprobar si un elemento existe
        boolean tieneCereza = frutas.contains("Cereza");
        System.out.println("¿Contiene 'Cereza'?: " + tieneCereza);

        // Obtener el tamaño del ArrayList
        int tamaño = frutas.size();
        System.out.println("Tamaño del ArrayList: " + tamaño);

        // Recorrer el ArrayList usando un bucle for
        System.out.println("Frutas en la lista:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        for (Integer indiceNumeros : numeros){
            System.out.println(indiceNumeros);
        }
        for (double indiceDouble : precios) {
            System.out.println(indiceDouble);
        }
        // Con un ciclo for tradicional con índice i...  en lugar de lenght, size y usamos .get(i) en lugar de [i]
        for (int i=0; i<caracteres.size();i++) {
            System.out.println(caracteres.get(i));
        }
            
        // Ordenar la lista de 'numeros'
        Collections.sort(numeros);
        System.out.println("Lista de números ordenada por el método sort(): " + numeros); 
        
        // Para vaciar del todo un ArrayList:
        numeros.clear();
        System.out.println("Lista de números tras aplicar 'clear': " + numeros);
        
        // Ordenar por orden alfabético en sentido inverso
        Collections.sort(caracteres, Collections.reverseOrder());
        for (char indiceCaracteres : caracteres) {
            System.out.println(indiceCaracteres);
        }
    
        // Ordenar por orden de magnitud en sentido inverso
        Collections.sort(precios, Collections.reverseOrder());
        for (double indicePrecios : precios) {
            System.out.println(indicePrecios);
        }
    }
}
