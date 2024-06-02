package calculadora.operaciones;

public class Multiplicacion implements Operacion {

    @Override
    public double calcular(double... parametros) {

        double primerTermino = parametros[0];
        double segundoTermino = parametros[1];

        return primerTermino * segundoTermino;
    }

}
