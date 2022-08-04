package ec.edu.utpl.poo.semana13.pruebaparcial.recursos;

/**
 * Fisico es una extension de la clase abstracta Recurso
 * @author josuepiedra
 * @see Recurso
 */
public class Fisico extends Recurso {
    //Atributos de la clase
    private String isbn;

    /**
     * Constructor para elaborar recursos de la clase Fisico
     * @param costo parametro que almacena el valor de la variable costo (double)
     * @param isbn parametro que contiene el valor del atributo isbn (String)
     */
    public Fisico(double costo, String isbn) {
        super(costo);
        this.isbn = isbn;
    }

}


