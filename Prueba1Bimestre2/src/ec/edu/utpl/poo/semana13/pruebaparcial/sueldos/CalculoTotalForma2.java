package ec.edu.utpl.poo.semana13.pruebaparcial.sueldos;

import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Curso;
import ec.edu.utpl.poo.semana13.pruebaparcial.recursos.Fisico;

/**
 * Clase que implementa la interfaz ICalculoTotalMatricula
 * se utuliza cuando se aplica la segunda forma de descuento
 * tomando en cuenta, el tipo de recursos y su precio.
 * @see ICalculaTotalMatricula
 */
public class CalculoTotalForma2 implements ICalculaTotalMatricula{

    /**
     * Metodo abstracto sobreescrito del la clase ICalculoTotalMatricula.
     * Descuento a partir del tipo de recursos y su precio.
     * @param curso parametro que recibe el curso del docente (Tipo Curso)
     * @return retorna el total de la matricula
     */
    @Override
    public double calcularTotalMatricula(Curso curso) {
        double costoDocente = curso.getDocente().getSueldo();
        double costoRecursos = 0;

        for (var i: curso.getRecursos()){
            if (i instanceof Fisico){
                costoRecursos += i.getCosto() + i.getCosto() * 10/100;
            }else{
                costoRecursos += i.getCosto() - i.getCosto() * 3/100;
            }
        }

        double costoTipoCurso = (costoDocente + costoRecursos + curso.getCostoBase()) * 5/100;

        if (curso.getTipo() == 0){
            return costoDocente + costoRecursos + curso.getCostoBase() + costoTipoCurso;
        }else{
            return costoDocente + costoRecursos + curso.getCostoBase() - costoTipoCurso;
        }
    }
}
