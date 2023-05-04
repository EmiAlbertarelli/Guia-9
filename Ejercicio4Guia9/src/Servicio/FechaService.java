/*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario). 
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;


public class FechaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el año:");
        int anio = leer.nextInt();
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = 1 + leer.nextInt();
        return new Date(anio - 1900, mes, dia);
        
    }
    //Metodo fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
//el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        
        return new Date();
    }

    //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
//de años entre una y otra (edad del usuario). 
  public int diferenciaFechas(Date fechaNacimiento, Date fechaActual ){
      
      int edad = fechaActual.getYear() - fechaNacimiento.getYear();
      
      //return fechaActual.getYear() - fechaNacimiento.getYear();
              
      return edad;
  }
    
}
