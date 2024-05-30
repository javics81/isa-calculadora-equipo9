package calculadora.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import calculadora.operaciones.Operacion;
import calculadora.operaciones.Suma;
import org.junit.jupiter.api.Test;


public class SumaTest {

    private final Operacion operacion = new Suma();

    @Test
    public void test1() {

        assertEquals(0,operacion.calcular());
    }

}
