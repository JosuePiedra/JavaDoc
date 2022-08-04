package ec.edu.utpl.poo.semana13.pruebaparcial.sueldos;

import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Curso;

/**
 * Clase que implementa la interfaz ICalculoTotalMatricula
 * se utiliza cuando se aplica la cuarta forma de descuento.
 * No se aplica ningun tipo de descuento.
 * @see ICalculaTotalMatricula
 */
public class CalculoTotalForma4 implements ICalculaTotalMatricula{
    /**
     * Metodo abstracto sobreescrito del la clase ICalculoTotalMatricula.
     * No implementa ningun tipo de descuento
     * @param curso parametro que recibe el curso del docente (Tipo Curso)
     * @return retorna el total de la matricula
     */
    @Override
    public double calcularTotalMatricula(Curso curso) {
        double costoTotal, costoRecursos = 0;

        for (var i: curso.getRecursos()){
            costoRecursos += i.getCosto();
        }

        return costoTotal = curso.getCostoBase() + costoRecursos + curso.getDocente().getSueldo();

    }
}
