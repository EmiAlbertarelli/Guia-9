/*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
letra de la palabra en un índice del vector. Y también, guarda la cantidad de 
jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra 
estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuántas le faltan. Este método además 
deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente 
mencionados e informará cuando el usuario descubra toda la palabra o se quede sin 
intentos. Este método se llamará en el main. */
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


public class AhorcadoServicio {
       
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();
    
    public int longitud(String palabra){
        return palabra.length();
    }
    
    public void crearJuego(){
        
        System.out.println("Ingrese la palabra");
        String palabraAbuscar = leer.next();
        String[] palabra = new String[palabraAbuscar.length()];
       for (int i = 0; i < palabraAbuscar.length(); i++) {
           palabra[i] = palabraAbuscar.substring(i, i+1);
           
        }
        ahorcado.setaBuscar(palabra);
         System.out.println("Ingrese las jugadas maximas");
            ahorcado.setJugadas(leer.nextInt());
            System.out.println("la palabra tiene " + longitud(palabraAbuscar) + " letras");
        
    }
    public void buscar(){
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if(Arrays.asList(ahorcado.getaBuscar()).contains(letra)){
            System.out.println("La letra pertenece a la palabra");
        }else{
            System.out.println("La letra no pertenece a la palabra");
            encontradas(letra);
        }
        
    }
    
    public boolean encontradas(String letra){
        boolean letraEncontrada = false;
        int oportunidades = 0;
        int encontradas = 0, faltantes = 0;
        for (int i = 0; i < ahorcado.getaBuscar().length; i++) {
            if (letra.equals(ahorcado.getaBuscar()[i])) {
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas()+1);
                letraEncontrada = true;
            }else{
                ahorcado.setJugadas(ahorcado.getJugadas()-1);
                
            }
        }
        return letraEncontrada;
    }
}

