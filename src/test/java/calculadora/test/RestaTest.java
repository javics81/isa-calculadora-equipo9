package calculadora.test;

import calculadora.operaciones.Operacion;
import calculadora.operaciones.Resta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RestaTest {

    private final Operacion operacion = new Resta();

    @Test
    public void test1() {

        assertEquals(0,operacion.calcular());
    }



}
