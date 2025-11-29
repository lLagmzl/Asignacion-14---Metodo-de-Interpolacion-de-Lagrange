/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import implementacion.Interpolacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlos
 */
public class InterpolacionTest {
    
    @Test
    public void testMultiplicatoria() {
        Interpolacion interp = new Interpolacion();
        double[][] puntos = {
            {1, 2},
            {2, 3},
            {3, 5}
        };

        double resultado = interp.multiplicatoria(0, puntos, 2, 2);

        System.out.println("Resultado obtenido multiplicatoria: " + resultado);

        // Se espera 0.0 (puede ser -0.0)
        assertEquals(0.0, Math.abs(resultado), 0.0001);
    }

    @Test
    public void testInterpolacionLagrange() {
        Interpolacion interp = new Interpolacion();

        double[][] puntos = {
            {1, 2},
            {2, 3},
            {3, 5}
        };

        double x = 2.0;

        System.out.println("\n=== Test interpolacionLagrange ===");
        System.out.println("Interpolando en x = " + x);
        System.out.println("Puntos usados:");

        for (double[] p : puntos) {
            System.out.println("(" + p[0] + ", " + p[1] + ")");
        }

        double resultado = interp.interpolacionLagrange(puntos, 2, x);

        System.out.println("Resultado interpolado: " + resultado);

        assertEquals(3.0, resultado, 0.0001);
    }

    @Test
    public void testDespliegaPuntos() {
        Interpolacion interp = new Interpolacion();

        double[][] puntos = {
            {1, 2},
            {2, 3}
        };

        System.out.println("\n=== Test despliegaPuntos ===");
        System.out.println("Mostrando puntos:");

        assertDoesNotThrow(() -> interp.despliegaPuntos(puntos, 1));
    }
}
