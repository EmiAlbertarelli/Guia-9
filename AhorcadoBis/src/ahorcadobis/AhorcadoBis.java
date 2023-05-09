/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadobis;

import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;


public class AhorcadoBis {

    
    public static void main(String[] args) {
        AhorcadoServicio horca1=new AhorcadoServicio();
        Ahorcado Main=horca1.crearJuego();
        horca1.juego(Main);
    }
    
}
