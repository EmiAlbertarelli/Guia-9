/*Crea una clase en Java donde declares una variable de tipo array de Strings 
que contenga los doce meses del año, en minúsculas. A continuación, declara una
variable mesSecreto de tipo String, y hazla igual a un elemento del array (por 
ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el
mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir 
que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del 
programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 */
package Servicio;

import Entidad.MesSecreto;
import java.util.Random;
import java.util.Scanner;

public class MesSecretoServicio {
    private Scanner leer = new Scanner(System.in);
    MesSecreto ms = new MesSecreto();
    
      public String mesSecreto() {
        Random random = new Random();
        int indice = random.nextInt(12);
        ms.setMesSecreto(ms.getMes()[indice]);
        return ms.getMesSecreto();
    }

    public void Juego() {
    boolean adivinado = false;
    String rpta;
    String mesSecreto = mesSecreto();
    
        do {
            System.out.println("Adivine el mes secreto");
            rpta = leer.next().toLowerCase();
            
            if (mesSecreto.equals(rpta)) {
                System.out.println("Felicitaciones  adivino");
                adivinado = true;
            } else{
                System.out.println("Incorrecto. Intenta de nuevo");
            }
            
        } while (!adivinado);
          
    }
}


