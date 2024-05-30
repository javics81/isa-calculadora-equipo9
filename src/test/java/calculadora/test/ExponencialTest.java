package calculadora.test;

import calculadora.operaciones.Exponencial;
import calculadora.operaciones.Operacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExponencialTest {

    private final Operacion operacion = new Exponencial();

    @Test
    public void test1() {

        assertEquals(0,operacion.calcular());
    }



}
