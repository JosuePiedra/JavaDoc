package ec.edu.utpl.poo.semana13.pruebaparcial.docente;

/**
 * Docente definira objetos que contienen informacion basicas de los docentes
 * @author josuepiedra
 * @see TITULOS
 */
public class Docente {
    //Atributos de  clase
    private TITULOS titulo;
    private double sueldo;

    /**
     * Constructor para la creacion de docentes
     * @param titulo define el tipo de titulo que contiene el docente
     * @param sueldo parametro que define el sueldo del docente.
     * @see TITULOS
     */
    public Docente(TITULOS titulo, double sueldo) {
        this.titulo = titulo;
        this.sueldo = sueldo;
    }

    /**
     * Consultor del tipo de titulo que posee un docente
     * @return el tipo de titulo que posee el docente
     */
    public TITULOS getTitulo() {
        return titulo;
    }

    /**
     * Modificador del tipo de titulo del docente
     * @param titulo parametro que recibe el nuevo valor del titulo
     */
    public void setTitulo(TITULOS titulo) {
        this.titulo = titulo;
    }

    /**
     * Consultor del sueldo del docente
     * @return valor del sueldo del docente
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     * Modificador del sueldo del docente
     * @param sueldo parametro que recibe el nuevo valor del sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
