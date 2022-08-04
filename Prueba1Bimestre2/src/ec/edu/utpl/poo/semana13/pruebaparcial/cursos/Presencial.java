package ec.edu.utpl.poo.semana13.pruebaparcial.cursos;

import ec.edu.utpl.poo.semana13.pruebaparcial.docente.Docente;

/**
 * Presencial extiende la clase Curso. Hereda su gran mayoria de metodos y atributos de la clase Curso.
 * @author josuepiedra
 * @see Curso
 */
public class Presencial extends Curso {
    // campos de la clase
    String aula;

    /**
     * Constructor que asigna valor a los atributos que se encuentran en la clase abstracta Curso.
     * @param tipoCurso recibe el valor del atributo tipoCurso (int)
     * @param nombre recibe el valor del atributo nombre (double)
     * @param numHoras recibe el valor del atributo numHoras (int)
     * @param costoBase recibe el valor del atributo costoBase (double)
     * @param horario recibe el valor del atributo horario (String)
     * @param docente recibe el valor del atributo docente (Docente)
     */
    public Presencial(int tipoCurso, double nombre, int numHoras, double costoBase, String horario,
                      Docente docente) {
        this.setTipo(tipoCurso);
        this.setNombre(nombre);
        this.setNumHoras(numHoras);
        this.setCostoBase(costoBase);
        this.setHorario(horario);
        this.setDocente(docente);
    }

}
