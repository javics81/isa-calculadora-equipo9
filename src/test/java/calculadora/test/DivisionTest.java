package calculadora.test;

import calculadora.operaciones.Division;
import calculadora.operaciones.Operacion;
import calculadora.operaciones.UtilidadesOperaciones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DivisionTest {

    private final Operacion operacion = new Division();

    @Test
    public void DivisionEnterosPositivosTest() {
        double resultado = this.operacion.calcular(12, 3);
        assertEquals(4,resultado );
    }

    @Test
    public void DivisionEnterosNegativosTest(){
        double resultado = this.operacion.calcular(-20, -4);
        assertEquals(5,resultado );
    }

    @Test
    public void DivisionEnterosPositivoNegativoTest() {
        double resultado = this.operacion.calcular(48, -12);
        assertEquals(-4,resultado );
    }

    @Test
    public void DivisionEnterosNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-9, 3);
        assertEquals(-3,resultado );
    }
    @Test
    public void DivisionCeroTest(){
        double resultado = this.operacion.calcular(0, 100);
        assertEquals(0,resultado );
    }

    @Test
    public void DivisionDecimalesTest() {
        double resultado = this.operacion.calcular(7.21, 2.36);
        assertTrue(UtilidadesOperaciones.absoluto(resultado - 3.05508475) < 0.001 );
    }


}