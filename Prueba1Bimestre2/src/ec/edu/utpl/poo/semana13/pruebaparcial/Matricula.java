package ec.edu.utpl.poo.semana13.pruebaparcial;

import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Curso;
import ec.edu.utpl.poo.semana13.pruebaparcial.docente.Docente;
import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Online;
import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Presencial;
import ec.edu.utpl.poo.semana13.pruebaparcial.sueldos.ICalculaTotalMatricula;

/**
 * Clase matricula, existen atributos de tipo Curso, ICalculoToltalMatricula y Docente.
 * Mediante esta clase se crean objetos que almacenan toda la informacion
 * acerca de una matricula
 * @see ICalculaTotalMatricula
 * @see Docente
 * @see Curso
 */
public class Matricula {
    private int numero;
    private double descuento;
    private Curso curso;
    private int tipoCurso;
    private ICalculaTotalMatricula algoritmo;

    /**
     * Constructor en el caso que no existe ningun tipo de descuento.
     * @param tipoCurso define el tipo de curso en el que se matriculara (online o presencial)
     * @param numero define el numero de horas que tendra el curso
     * @param nombre define el nombre del curso
     * @param numHoras define el numero de horas del curso
     * @param costoBase define el costo base del curso
     * @param horario define el horario del curso
     * @param docente define el docente del curso
     */

    public Matricula(int tipoCurso, int numero, double nombre, int numHoras,
                     double costoBase, String horario, Docente docente) {
        this.setNumero(numero);
        this.setDescuento(getDescuento());
        if (tipoCurso == 0){
            curso = new Presencial(0,nombre, numHoras,costoBase,horario,docente);
        }else{
            curso = new Online(1, nombre, numHoras,costoBase,horario,docente);
        }

    }

    /**
     * Constructor en el caso que si existe descuento en la matricula.
     * @param tipoCurso define el tipo de curso en el que se matriculara (online o presencial)
     * @param curso define el curso en el que se matriculara
     * @param numero define el numero de horas que tendra el curso
     * @param nombre define el nombre del curso
     * @param numHoras define el numero de horas del curso
     * @param costoBase define el costo base del curso
     * @param horario define el horario del curso
     * @param docente define el docente del curso
     * @param descuento define el porcentaje de descuento en la matricula
     */
    public Matricula(int tipoCurso,int numero, Curso curso, double nombre, int numHoras,
                     double costoBase, String horario, Docente docente, double descuento) {
        this.setNumero(numero);
        this.setDescuento(descuento);
        if (tipoCurso == 0){
            curso = new Presencial(0,nombre, numHoras,costoBase,horario,docente);
        }else{
            curso = new Online(1,nombre, numHoras,costoBase,horario,docente);
        }
    }

    /**
     * Calculara el costo de la matricula
     * @param algoritmo variable que contiene los algoritmos que implementan ICalculaTotalMatricula
     * @return retorna el costo total de la matricula
     */

    public double calcularCosto(ICalculaTotalMatricula algoritmo){
        double costoTotal = algoritmo.calcularTotalMatricula(this.curso);
        if(getDescuento() == 0){
            return costoTotal;
        }else{
            return costoTotal - (costoTotal * getDescuento() /100);
        }

    }

    /**
     * Modificador del numero de horas del curso
     * @param numero parametro que actualizara el numero de horas
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Consultor del descuento de la matricula
     * @return el porcentaje del descuento de la matricula
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Modificador del porcentaje del descuento
     * @param descuento parametro que actualizara el descuento de la matricula
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * Consultor del cursp
     * @return retorna el curso de la matricula
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Modificador del curso de la matricula
     * @param curso parametro que cambiara el curso
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
