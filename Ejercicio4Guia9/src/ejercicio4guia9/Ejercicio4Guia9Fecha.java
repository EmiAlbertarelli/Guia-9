/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase 
FechaService, en paquete Servicios, que tenga los siguientes métodos:
1)Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
2)Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
3)Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario). 
 */
package ejercicio4guia9;

import Servicio.FechaService;
import java.util.Date;


public class Ejercicio4Guia9Fecha {

    
    public static void main(String[] args) {
        
        Date fechaN = new Date();
        FechaService fecha1 = new FechaService();
        
        //fecha1.fechaNacimiento();
        //fecha1.fechaActual();
        System.out.println("Su edad es: " +fecha1.diferenciaFechas(fecha1.fechaNacimiento(), fecha1.fechaActual()));
        
        
       
    }
    
}
