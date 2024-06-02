package calculadora.operaciones;

public class Exponencial implements Operacion {


    @Override
    public double calcular(double... params) {
        double resultado = 1.0; // La suma inicial es 1
        double termino = 1.0;   // El primer término de la serie es 1
        int n = 1;              // El contador para los términos

        double numero = params[0];

        boolean negativo = false;
        if (numero<0) {
            negativo = true;
            numero = -numero;
        }
        while (termino > UtilidadesOperaciones.PRECISION) { // Continuar hasta que el término sea muy pequeño
            termino = termino * numero / n; // Calcular el siguiente término de la serie
            resultado += termino;      // Sumar el término al resultado
            n++;                       // Incrementar el contador
        }
        if (negativo) {
            resultado=1/resultado;
        }

        return resultado;
    }


}
