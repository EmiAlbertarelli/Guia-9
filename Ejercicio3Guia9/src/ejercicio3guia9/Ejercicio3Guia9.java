/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
1)Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
2)Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3)Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4)Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
mostrar A y B. 
 */
package ejercicio3guia9;

import Servicio.ArregloService;


public class Ejercicio3Guia9 {

    
    public static void main(String[] args) {
        
        ArregloService arService = new ArregloService();
        int[] array1 = new int[50];
        int[] array2 = new int[20];
       
        array1 = arService.inicializarA(array1);
        arService.mostrar(array1);
        arService.ordenar(array1);
        array2 = arService.inicializarB(array1);
        arService.mostrar(array1);
        arService.mostrar(array2);
        
    }
    
}
