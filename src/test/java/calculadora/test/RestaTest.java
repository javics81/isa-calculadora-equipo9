package calculadora.test;

import calculadora.operaciones.Operacion;
import calculadora.operaciones.Resta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RestaTest {

    private final Operacion operacion = new Resta();

    @Test
    public void restaEnterosPositivosTest() {
        double resultado = this.operacion.calcular(7, 4);

        assertEquals(3,resultado);
    }

    @Test
    public void restaEnterosNegativosTest() {
        double resultado = this.operacion.calcular(-5, -4);

        assertEquals(-1,resultado);
    }

    @Test
    public void restaEnterosPositivoNegativoTest() {
        double resultado = this.operacion.calcular(2, -9);

        assertEquals(11,resultado);
    }

    @Test
    public void restaEnterosNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-3, 5);

        assertEquals(-8,resultado);
    }

    @Test
    public void restaDecimalesPositivosTest() {
        double resultado = this.operacion.calcular(3.2, 6.5);

        assertEquals(-3.3,resultado);
    }

    @Test
    public void restaDecimalesNegativosTest() {
        double resultado = this.operacion.calcular(-7.4, -3.2);

        assertEquals(-4.2,resultado);
    }

    @Test
    public void restaDecimalesPositivoNegativoTest() {
        double resultado = this.operacion.calcular(6.9, -1.7);

        assertEquals(8.6,resultado);
    }

    @Test
    public void restaDecimalesNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-4.7, 6.2);

        assertEquals(-10.9,resultado);
    }

}
