
package implementacion;

/**
 *
 * @author Carlos
 */
public class Interpolacion {
    
    public void despliegaPuntos(double puntos[][], int n) {
        System.out.println("Puntos:");
        for (int i = 0; i <= n; i++) {
            System.out.println("(" + puntos[i][0] + ", " + puntos[i][1] + ")");
        }
    }

    public double interpolacionLagrange(double puntos[][], int n, double x) {
        double resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado += puntos[i][1] * multiplicatoria(i, puntos, n, x);
        }

        return resultado;
    }

    public double multiplicatoria(int i, double puntos[][], int n, double x) {
        double mult = 1;

        for (int j = 0; j <= n; j++) {
            if (j != i) {
                mult *= (x - puntos[j][0]) / (puntos[i][0] - puntos[j][0]);
            }
        }

        return mult;
    }
}
