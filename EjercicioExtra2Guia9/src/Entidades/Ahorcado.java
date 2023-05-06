/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
contener como atributos, un vector con la palabra a buscar, la cantidad de letras 
encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 */
package Entidades;


public class Ahorcado {
    
    private String [] aBuscar;
    private int letrasEncontradas;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] aBuscar, int letrasEncontradas, int jugadas) {
        this.aBuscar = aBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public String[] getaBuscar() {
        return aBuscar;
    }

    public void setaBuscar(String[] aBuscar) {
        this.aBuscar = aBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public void setaBuscar(char[] palabra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
