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
d)Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
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
package ejercicios.pkg1.guia.pkg9;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;


public class Ejercicios1Guia9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CadenaServicio cs = new CadenaServicio();
        Cadena frases = cs.crearCadena();
        String opcion;

        do {
            System.out.println("MENU");
            System.out.println("A - Mostrar Vocales \n"
                    + "B - Invertir Frase \n"
                    + "C - Repeticion de letra \n"
                    + "D - Comparar longitudes \n"
                    + "E - Unir frases \n"
                    + "F - Reemplazar caracter\n"
                    + "G - Saber si contiene \n"
                    + "H- Salir");

            opcion = leer.next();

            switch (opcion.toUpperCase()) {
                case "A":
                    cs.mostrarVocales(frases);

                    break;
                case "B":
                    cs.invertirFrase(frases);
                    break;
                case "C":
                    cs.vecesRepetido(frases);
                    break;
                case "D":
                    cs.compararLongitud(frases);
                    break;
                case "E":
                    cs.unirFrase(frases);
                    break;
                case "F":
                    cs.reemplazar(frases);
                    break;
                case "G":
                    System.out.println(cs.contiene(frases));
                    break;
                case "H":
                    System.out.println("Adios!!");
                    break;
                default:
                    break;
            }
        
        }while(!opcion.equals("H"));
           
       
    }
}

