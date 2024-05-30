package calculadora.test;

import calculadora.operaciones.Operacion;
import calculadora.operaciones.RaizCuadrada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RaizCuadradaTest {

    private final Operacion operacion = new RaizCuadrada();

    @Test
    public void test1() {

        assertEquals(0,operacion.calcular());
    }



}
