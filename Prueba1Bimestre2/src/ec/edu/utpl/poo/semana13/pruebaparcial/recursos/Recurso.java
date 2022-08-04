package ec.edu.utpl.poo.semana13.pruebaparcial.recursos;
/**
 * Clase abstracta que hereda metodos y atributos a las clases Fisico y Virtual.
 * @author josuepiedra
 * @see Fisico ,
 * @see Virtual
 */
public abstract class Recurso {
    //Atributos de la clase
    private double costo;

    /**
     * Constructor de la clase Recurso
     * @param costo parametro que almacena el valor del costo del recurso (double)
     */
    public Recurso(double costo) {
        this.setCosto(costo);
    }

    /**
     * Consultor de la variable costo
     * @return el valor de la variable costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Modificador del valor de la variable costo
     * @param costo parametro que modificara el atributo costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
