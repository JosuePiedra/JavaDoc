package ec.edu.utpl.poo.semana13.pruebaparcial.sueldos;

import ec.edu.utpl.poo.semana13.pruebaparcial.cursos.Curso;
import ec.edu.utpl.poo.semana13.pruebaparcial.recursos.Fisico;
import ec.edu.utpl.poo.semana13.pruebaparcial.docente.TITULOS;


/**
 * Clase que implementa la interfaz ICalculoTotalMatricula
 * se utuliza cuando se aplica la tercera forma de descuento.
 * Emplea la primera y la segunda forma de descuento
 * @see ICalculaTotalMatricula
 */
public class CalculoTotalForma3 implements  ICalculaTotalMatricula{
    /**
     * Metodo abstracto sobreescrito del la clase ICalculoTotalMatricula.
     * Implementa la primera y la segunda orma
     * @param curso parametro que recibe el curso del docente (Tipo Curso)
     * @return retorna el total de la matricula
     */
    @Override
    public double calcularTotalMatricula(Curso curso) {

        double costoRecursos = 0;
        for (var i: curso.getRecursos()){
            if (i instanceof Fisico){
                costoRecursos += i.getCosto() + i.getCosto() * 10/100;
            }else{
                costoRecursos += i.getCosto() - i.getCosto() * 3/100;
            }
        }

        System.out.println(costoRecursos);

        double costoTitulo;
        if (curso.getDocente().getTitulo() == TITULOS.LICENCIADO){
            costoTitulo = (curso.getCostoBase() + curso.getDocente().getSueldo() + costoRecursos) * 10/100;
        }else if(curso.getDocente().getTitulo() == TITULOS.INGENIERO){
            costoTitulo = (curso.getCostoBase() + curso.getDocente().getSueldo() + costoRecursos) * 12.5/100;
        }else if(curso.getDocente().getTitulo() == TITULOS.MAGISTER){
            costoTitulo = (curso.getCostoBase() + curso.getDocente().getSueldo() + costoRecursos) * 15/100;
        }else{
            costoTitulo = (curso.getCostoBase() + curso.getDocente().getSueldo() + costoRecursos) * 17.5/100;
        }

        System.out.println(costoTitulo);

        double costoCasiFinal = costoRecursos + costoTitulo + curso.getCostoBase() +
                curso.getDocente().getSueldo();

        System.out.println(costoCasiFinal);

        if (curso.getTipo() == 0){
            return  costoCasiFinal + (costoCasiFinal * 5/100);
        }else{
            return  costoCasiFinal - (costoCasiFinal * 5/100);
        }

    }
}
