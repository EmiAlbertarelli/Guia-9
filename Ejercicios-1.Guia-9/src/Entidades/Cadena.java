/* Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
atributos una frase (String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente. Agregar getters y setters. El constructor con frase 
como atributo debe setear la longitud de la frase de manera automática. 
 */
package Entidades;


public class Cadena {
    private String frase;
    private long longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

   
}
