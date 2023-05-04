/*Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona
a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha
de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada. 
 */
package Servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Persona per1 = new Persona();
 
    
  //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona
//a crear. Retornar el objeto Persona creado.  
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre de la persona");
        per1.setNombre(leer.next());
       
        System.out.println("Ingrese el año:");
        int anio = leer.nextInt();
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
     Date n = new Date(anio-1900, mes, dia);
     
        per1.setFechaN(n);
        
        return per1;
    }
    
  //Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha
//de nacimiento y la fecha actual  
    
    public Date fechaActual(){
       // Date fechaActual = new Date();
        return new Date();
    }
    
    public int calcularEdad(Persona per1 ){
      //return fechaActual.getYear() - fechaNacimiento.getYear();
       Date fechaActual = new  Date();      
      int edad = fechaActual.getYear() - per1.getFechaN().getYear();
      return edad;
  }
    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
//persona es menor que la edad consultada o false en caso contrario.
    public boolean menorQue(Persona per1) {
        System.out.println("Ingrese una edad para comparar: ");
        int numConsultar = leer.nextInt();
        return calcularEdad(per1) > numConsultar;
        //if (calcularEdad(per1, fechaActual) > numConsultar) {
          //  return true;
       // } else {
        //    return false;
       // }
    }
    //Método mostrarPersona que muestra la información de la persona deseada
    public void mostrarPersona(Persona per1){
        
        System.out.println("El nombre de la persona es: " + per1.getNombre());
        System.out.println("Su fecha de nacimiento es: "+per1.getFechaN().getDate()+"/"+per1.getFechaN().getMonth()+"/"+per1.getFechaN().getYear() );
       System.out.println("la persona tiene " +calcularEdad(per1)+ " años");
        System.out.println(menorQue(per1));
        
        
    }

}

