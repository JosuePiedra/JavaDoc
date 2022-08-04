package ec.edu.utpl.poo.semana13.pruebaparcial.sueldos;

import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Curso;
import ec.edu.utpl.poo.semana13.pruebaparcial.docente.TITULOS;

/**
 * Clase que implementa la interfaz ICalculoTotalMatricula
 * se utiliza cuando se aplica la primera forma de descuento
 * tomando en cuenta, el titulo del docente
 * @see ICalculaTotalMatricula
 */
public class CalculoTotalForma1 implements ICalculaTotalMatricula{

    /**
     * Metodo abstracto sobreescrito del la clase ICalculoTotalMatricula.
     * Descuento a partir del titulo del docente
     * @param curso parametro que recibe el curso del docente (Tipo Curso)
     * @return retorna el total de la matricula
     */
    @Override
    public double calcularTotalMatricula(Curso curso) {
        double costoRecursos = 0;
        for (var i: curso.getRecursos()){
            costoRecursos += i.getCosto();
        }
        double salarioDocente = curso.getDocente().getSueldo();
        double costoTotal = curso.getCostoBase() + salarioDocente + costoRecursos;
        if (curso.getDocente().getTitulo() == TITULOS.LICENCIADO){
            return costoTotal + (costoTotal * 10/100) ;
        }else if(curso.getDocente().getTitulo() == TITULOS.INGENIERO){
            return costoTotal + (costoTotal * 12.5/100) ;
        }else if(curso.getDocente().getTitulo() == TITULOS.MAGISTER){
            return costoTotal + (costoTotal * 15/100) ;
        }else{
            return costoTotal + (costoTotal * 17.5/100) ;
        }
    }

}
