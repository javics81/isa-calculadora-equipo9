package calculadora.operaciones;

public class Division implements Operacion {

    @Override
    public double calcular(double... parametros) {

        double primerTermino = parametros[0];
        double segundoTermino = parametros[1];

        if(segundoTermino == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

        return primerTermino/segundoTermino;
    }
}