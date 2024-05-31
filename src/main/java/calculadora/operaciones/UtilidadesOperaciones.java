package calculadora.operaciones;

public class UtilidadesOperaciones {
    public static final double PRECISION = 0.001;

    // Método para calcular el valor absoluto
    public static double absoluto(double valor) {
        return valor < 0 ? -valor : valor;
    }
}
