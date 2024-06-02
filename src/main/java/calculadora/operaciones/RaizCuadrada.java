package calculadora.operaciones;

public class RaizCuadrada implements Operacion {



    @Override
    public double calcular(double... params) {
        // Verificar que el número sea positivo

        double numero = params[0];

        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        // Caso especial para la raíz cuadrada de 0
        if (numero == 0) {
            return 0;
        }

        // Inicialización de variables
        double aproximacion = numero;
        double mejorAproximacion;

        while (true) {
            mejorAproximacion = (aproximacion + numero / aproximacion) / 2;

            // Verificar la precisión
            if (UtilidadesOperaciones.absoluto(mejorAproximacion - aproximacion) < UtilidadesOperaciones.PRECISION) {
                break;
            }

            aproximacion = mejorAproximacion;
        }

        return mejorAproximacion;
    }


}

