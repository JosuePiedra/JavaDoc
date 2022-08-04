package ec.edu.utpl.poo.semana13.pruebaparcial.runer;

import ec.edu.utpl.poo.semana13.pruebaparcial.*;
import ec.edu.utpl.poo.semana13.pruebaparcial.docente.Docente;
import ec.edu.utpl.poo.semana13.pruebaparcial.docente.TITULOS;
import ec.edu.utpl.poo.semana13.pruebaparcial.recursos.Fisico;
import ec.edu.utpl.poo.semana13.pruebaparcial.recursos.Virtual;
import ec.edu.utpl.poo.semana13.pruebaparcial.sueldos.CalculoTotalForma1;
import ec.edu.utpl.poo.semana13.pruebaparcial.sueldos.CalculoTotalForma2;
import ec.edu.utpl.poo.semana13.pruebaparcial.sueldos.CalculoTotalForma3;
import ec.edu.utpl.poo.semana13.pruebaparcial.sueldos.CalculoTotalForma4;

/**
 * Metodo main, se probaran las implementaciones de todo el proyecto
 */
public class Main {
    /**
     * Metodo main
     * @param args main default
     */
    public static void main(String[] args) {

        //Se inicia un docente.
        Docente d1 = new Docente(TITULOS.MAGISTER, 234.5);
        //Se inicia una matricula, esta no contiene descuento
        Matricula m1 = new Matricula(0, 3242, 13, 32,
                274.1, "Lunes-Viernes", d1);

        Fisico f1 = new Fisico(24,"iso123");
        Fisico f2 = new Fisico(40,"iso1425");
        Virtual f3 = new Virtual(40,"https://Hola.mundo");
        Virtual f4 = new Virtual(24,"https://PrincipiosBasicos");

        m1.getCurso().addRecursos(f1);
        m1.getCurso().addRecursos(f2);
        m1.getCurso().addRecursos(f3);
        m1.getCurso().addRecursos(f4);

        CalculoTotalForma1 Algoritmo1 = new CalculoTotalForma1();
        System.out.println(m1.calcularCosto(Algoritmo1));

        CalculoTotalForma2 Algoritmo2 = new CalculoTotalForma2();
        System.out.println(m1.calcularCosto(Algoritmo2));

        CalculoTotalForma3 Algoritmo3 = new CalculoTotalForma3();
        System.out.println(m1.calcularCosto(Algoritmo3));

        CalculoTotalForma4 Algoritmo4 = new CalculoTotalForma4();
        System.out.println(m1.calcularCosto(Algoritmo4));

    }
}
