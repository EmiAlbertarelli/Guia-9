/* Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
1)Método inicializar A recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
2)Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3)Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4)Método inicializar B copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package Servicio;

import java.util.Arrays;


public class ArregloService {
    public int[] inicializarA(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    
    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(int[] array){
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
        System.out.println("");
    }
    // Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(int[] array){
        Arrays.sort(array);
        int[] arrayAux = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayAux[i] = array[array.length - 1 -i];
        }
        System.out.println("Su orden de mayor a menor queda: ");
        mostrar(arrayAux);
    }
    
    /**Método inicializarB copia los primeros 10 números del arreglo A en el
     * arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     * @param array 
     */
     public int[] inicializarB(int[] arrayA){
         int [] arrayB = new int[20];
        for (int i = 0; i < 20; i++) {
            
           if(i < 10){
               arrayB[i] = arrayA[i];
               System.out.println(arrayB[i]);
           } else if(i >= 10) { 
               arrayB[i]= (int) 0.5;
           }
           
        }
        
        return arrayB;
    }
    
}
