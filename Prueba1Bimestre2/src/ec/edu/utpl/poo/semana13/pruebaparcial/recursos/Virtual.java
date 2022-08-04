package ec.edu.utpl.poo.semana13.pruebaparcial.recursos;

/**
 * Virtual es una extension de la clase abstracta Recurso
 * @author josuepiedra
 * @see Recurso
 */
public class Virtual extends Recurso {
    //atributos de la clase
    private String url;

    /**
     * Constructor de la clase Virtual.
     * @param costo parametro que contiene el valor del costo del recurso(double)
     * @param url parametro que almacena el valor de la url del recurso (String)
     */
    public Virtual(double costo, String url) {
        super(costo);
        this.setUrl(url);
    }

    /**
     * Consultor de el url del recurso virtual
     * @return la variable url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Modificador del url del recurso virtual
     * @param url variable que modificara la url del programa
     */
    public void setUrl(String url) {
        this.url = url;
    }
}

