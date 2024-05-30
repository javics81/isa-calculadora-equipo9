package calculadora.test;

import calculadora.operaciones.Multiplicacion;
import calculadora.operaciones.Operacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicacionTest {

    private final Operacion operacion = new Multiplicacion();

    @Test
    public void test1() {

        assertEquals(0,operacion.calcular());
    }



}
