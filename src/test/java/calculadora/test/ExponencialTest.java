package calculadora.test;

import calculadora.operaciones.Exponencial;
import calculadora.operaciones.Operacion;
import calculadora.operaciones.UtilidadesOperaciones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExponencialTest {

    private final Operacion operacion = new Exponencial();

    @Test
    public void ExponencialDecimalesTest() {
        double resultado = this.operacion.calcular(4.96, 0);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 142.594) < 0.001 );
    }

    @Test
    public void ExponencialDecimalesNegativosTest() {
        double resultado = this.operacion.calcular(-3.68, 0);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 0.025) < 0.001 );
    }

    @Test
    public void ExponencialEnterosTest() {
        double resultado = this.operacion.calcular(8, 0);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 2980.958) < 0.001 );
    }

    @Test
    public void ExponencialEnterosNegativosTest() {
        double resultado = this.operacion.calcular(-5, 0);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 0.007) < 0.001 );
    }


    @Test
    public void RaizCuadradaCero() {
        double resultado = this.operacion.calcular(0, 0);
        assertEquals(1, resultado);
    }


}

