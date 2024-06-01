package calculadora.test;

import calculadora.operaciones.Multiplicacion;
import calculadora.operaciones.Operacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicacionTest {

    private final Operacion operacion = new Multiplicacion();


    @Test
    public void MultiplicacionEnterosPositivosTest() {
        double resultado = this.operacion.calcular(3, 4);
        assertEquals(12,resultado );
    }

    @Test
    public void MultiplicacionEnterosNegativosTest(){
        double resultado = this.operacion.calcular(-7, -3);
        assertEquals(21,resultado );
    }

    @Test
    public void MultiplicacionEnterosPositivoNegativoTest() {
        double resultado = this.operacion.calcular(9, -6);
        assertEquals(-54,resultado );
    }

    @Test
    public void MultiplicacionEnterosNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-4, 7);
        assertEquals(-28,resultado );
    }
    @Test
    public void MultiplicacionCeroTest(){
        double resultado = this.operacion.calcular(0, 100);
        assertEquals(0,resultado );
    }

    @Test
    public void MultiplicacionDecimalesPositivosTest() {
        double resultado = this.operacion.calcular(2.31, 5.72);
        assertEquals(13.2132,resultado );
    }

    @Test
    public void MultiplicacionDecimalesNegativosTest() {
        double resultado = this.operacion.calcular(-72.56, -3.21);
        assertEquals(232.9176,resultado );
    }

    @Test
    public void MultiplicacionDecimalesPositivoNegativoTest() {
        double resultado = this.operacion.calcular(8.46, -1.63);
        assertEquals(-13.7898,resultado );
    }

    @Test
    public void MultiplicacionDecimalesNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-5.71, 4.97);
        assertEquals(-28.3787,resultado );
    }

}
