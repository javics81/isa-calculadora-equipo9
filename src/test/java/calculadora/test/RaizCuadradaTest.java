package calculadora.test;

import calculadora.operaciones.Operacion;
import calculadora.operaciones.RaizCuadrada;
import calculadora.operaciones.UtilidadesOperaciones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RaizCuadradaTest {

    private final Operacion operacion = new RaizCuadrada();

    @Test
    public void RaizCuadradaDecimalesTest() {
        double resultado = this.operacion.calcular(78.35, 0);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 8.852) < 0.001 );
    }

    @Test
    public void RaizCuadradaEnterosTest() {
        double resultado = this.operacion.calcular(48, 0);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 6.928) < 0.001 );
    }


    @Test
    public void RaizCuadradaCeroTest() {
        double resultado = this.operacion.calcular(0, 0);
        assertEquals(0, resultado);
    }


}
