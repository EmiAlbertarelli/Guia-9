/* Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
atributos una frase (String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente. Agregar getters y setters. El constructor con frase 
como atributo debe setear la longitud de la frase de manera automática. Crear una 
clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
a)Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
b)Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c)Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e)Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
f)Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g)Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y 
mostrar la frase resultante.
h)Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cadena crearCadena(){
        Cadena c1 = new Cadena();
        System.out.println("Ingrese la frase que desee");
        c1.setFrase(leer.next());
        return c1;
    } 
    
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
    //la frase ingresada.
    public void mostrarVocales(Cadena c1){
        int contador=0;
        
        for (int i = 0; i < c1.getFrase().length(); i++) {
             switch (c1.getFrase().substring(i, i+1)) {
               case "a":
                   contador=contador+1;
                   break;
               case "e":
                   contador=contador+1;
                   break;
               case "i":
                   contador=contador+1;
                   break;
               case "o":
                   contador=contador+1;
                   break;
               case "u":
                   contador=contador+1;
                   break;
               default:
                   break;
        }
             System.out.println("la cantidad de vocales son: " + contador);
        
    }
    }
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    //Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(Cadena c1){
        System.out.println(" La frase al reves quedaria: " );
       for (int i = c1.getFrase().length(); i >-1; i--) {
           System.out.print(c1.getFrase().substring(i-1, i));
           
        }
        
    }

    
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    //y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrese una letra que desee buscar");
        String letra = leer.next();
        int contador=0;
        
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if(c1.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                contador++;
                
        }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces. ");
    }
    
   // e)Método compararLongitud(String frase), deberá comparar la longitud de la frase 
//que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese una nueva frase ");
        String frase1 = leer.next();
        
        if (c1.getFrase().length() == frase1.length()) {
            System.out.println("La cantidad de caracteres es igual");
        }else{
            System.out.println("Las cantidades son distintas");
        }
        
    }
    
//f)Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrase(Cadena c1){
        System.out.println("Ingrese otra nueva frase");
        String frase2 = leer.next();
        
        System.out.println("Su nueva frase es: " + c1.getFrase() + frase2);
        
        
    }
    
//g)Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y 
//mostrar la frase resultante.
    
    public void reemplazar(Cadena c1) {
        System.out.println("Ingrese que caracter desea que reemplaze a la a ");
        String caracter = leer.next();
      
        String frase = c1.getFrase().replaceAll("a", caracter);
        System.out.println(frase);

            }
        
//Método contiene(String letra), deberá comprobar si la frase contiene una letra 
//que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene(Cadena c1){
        
        System.out.println("Ingrese la letra que desea buscar");
        String letra2 = leer.next();
        
       boolean contiene = c1.getFrase().contains(letra2);
            return contiene;
            
        }
        
    }

