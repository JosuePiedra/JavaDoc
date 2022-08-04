package ec.edu.utpl.poo.semana13.pruebaparcial.sueldos;

import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Curso;

/**
 * Interfazque sera implementada por las clases que tiene
 * como funcion el calcular el valor de la matricula
 */
public interface ICalculaTotalMatricula {
    /**
     * Metodo abstracto que calculara el costo total de la matricula
     * @param curso
     * @return el costo total de la matricula
     */
    double calcularTotalMatricula(Curso curso);
}
