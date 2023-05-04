/*
 
 */
package ejercicio5guia9;

import Servicio.PersonaService;
import entidad.Persona;


public class Ejercicio5Guia9 {

    
    public static void main(String[] args) {
       
      
      PersonaService n1 = new PersonaService();
      Persona per = n1.crearPersona();
      
        
        
     
        n1.mostrarPersona(per);
    }
    
}
