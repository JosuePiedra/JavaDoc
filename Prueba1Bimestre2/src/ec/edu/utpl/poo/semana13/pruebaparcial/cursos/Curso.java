package ec.edu.utpl.poo.semana13.pruebaparcial.cursos;

import ec.edu.utpl.poo.semana13.pruebaparcial.docente.Docente;
import ec.edu.utpl.poo.semana13.pruebaparcial.recursos.Recurso;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que hereda metodos y atributos a las clases Online y Presencia.
 * @author josuepiedra
 * @see Online
 * @see Presencial
 */
public abstract class Curso {
    //Campos de la clase
    private double nombre;
    private int numHoras;
    private double costoBase;
    private String horario;
    private List<Recurso> recursos = new ArrayList<>();
    private Docente docente;
    private int tipo;

    /**
     * Agrega un valor a la lista de Recursos que posee un curso
     * @param recurso Parametro que contiene el recurso que se agregara en la lista de recursos
     */
    public void addRecursos(Recurso recurso){
        getRecursos().add(recurso);
    }

    /**
     * Consultor del nombre del curso
     * @return nombre del curso, mediante el consultor
     */
    public double getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre del cursp
     * @param nombre parametro que reemplazara el valor de la variable nombre
     */
    public void setNombre(double nombre) {
        this.nombre = nombre;
    }

    /**
     * Modificador de la variable numHoras
     * @param numHoras parametro que altera la variable numHoras
     */
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    /**
     * Metodo que retorna el costo base del curso
     * @return costo base del curso
     */
    public double getCostoBase() {
        return costoBase;
    }

    /**
     * Modificador de la variable costoBase
     * @param costoBase parametro que recibe el nuevo valor para costoBase
     */
    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    /**
     * Modificador de la variable horario
     * @param horario parametro que recibe el valor que alterara el atributos horario
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Consultor del atributo recursos que es una lista de objetos del tipo Recurso.
     * @see Recurso
     * @return recursos (lista de recursos)
     */
    public List<Recurso> getRecursos() {
        return recursos;
    }

    /**
     * Modificador de la variable recursos
     * @see Recurso
     * @param recursos parametro que recibe una lista de recursos, que altera el atributos recursos
     */
    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    /**
     * Consultor del atributo tipo
     * @return Retorna el valor del tipo del curso mediante el consultor.
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Modificador del atributo tipo
     * @param tipo recibe el nuevo valor del tipo de curso
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Consultor del atributo docente, perteneciente a la clase Docente.
     * @see Docente
     * @return Retorna un objeto de la clase Docente, mediante el consultor.
     */
    public Docente getDocente() {
        return docente;
    }

    /**
     * Modificador del atributos docente, perteneciente a la clase Docente
     * @see Docente
     * @param docente se recibe el argumento que modificara el parametro docente
     */
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
