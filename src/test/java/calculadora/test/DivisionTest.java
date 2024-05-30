package calculadora.test;

import calculadora.operaciones.Division;
import calculadora.operaciones.Operacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DivisionTest {

    private final Operacion operacion = new Division();

    @Test
    public void test1() {

        assertEquals(0,operacion.calcular());
    }



}
