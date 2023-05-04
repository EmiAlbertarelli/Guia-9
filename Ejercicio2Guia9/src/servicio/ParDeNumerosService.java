/* Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá 
además implementar los siguientes métodos:
a)Método mostrarValores que muestra cuáles son los dos números guardados.
b)Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
c)Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
d)Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package servicio;

import entidades.ParDeNumeros;
import java.util.Scanner;


public class ParDeNumerosService {

       
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ParDeNumeros numero = new ParDeNumeros();
    //public ParDeNumeros crearNumeros(){
    //    ParDeNumeros numeros = new ParDeNumeros();
     //   int num1 = (int)Math.round(numero.getNum1());
     //   int num2 = (int)Math.round(numero.getNum2());
      //  return numeros;
    //} 
    
    
    public static void mostrarValores(ParDeNumeros numero) {

        System.out.println("Numero 1: " + numero.getNum1());
        System.out.println("Numero 2: " + numero.getNum2());

    }
    
    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

    public static double devolverMayor(ParDeNumeros numero){
        
        double mayor = Math.max(Math.round(numero.getNum1()), Math.round(numero.getNum2()));
        System.out.println("El numero mayor es el: " + mayor);
        
     return mayor;   
    }
    
    //c)Método calcularPotencia para calcular la potencia del mayor valor de la clase 
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public static double calcularPotencia(ParDeNumeros numero){
        double minimo = Math.min(Math.round(numero.getNum1()), Math.round(numero.getNum2()));
        double mayor = Math.max(Math.round(numero.getNum1()), Math.round(numero.getNum2()));
        System.out.println("EL numero minimo es: " + minimo);
       double potencia =  Math.pow(mayor, minimo);
        
        System.out.println("EL resultado de la pontencia entre ambos numeros es: " + potencia);
        return potencia;
    }
    
    //d)Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public static double calcularRaiz(ParDeNumeros numero){
        double minimo = Math.min(Math.round(numero.getNum1()), Math.round(numero.getNum2()));
        double raiz = Math.sqrt(minimo);
        System.out.println("La raiz del numero de menor valor es: " + raiz);
        
        return raiz;
    }
}
