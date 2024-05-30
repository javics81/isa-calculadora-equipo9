package calculadora.test;

import calculadora.operaciones.Operacion;
import calculadora.operaciones.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumaTest {

    private final Operacion operacion = new Suma();

    @Test
    public void sumaEnterosPositivosTest() {
        double resultado = this.operacion.calcular(7, 4);

        assertEquals(11,resultado);
    }

    @Test
    public void sumaEnterosNegativosTest() {
        double resultado = this.operacion.calcular(-5, -4);

        assertEquals(-9,resultado);
    }

    @Test
    public void sumaEnterosPositivoNegativoTest() {
        double resultado = this.operacion.calcular(2, -9);

        assertEquals(-7,resultado);
    }

    @Test
    public void sumaEnterosNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-3, 5);

        assertEquals(2,resultado);
    }

    @Test
    public void sumaDecimalesPositivosTest() {
        double resultado = this.operacion.calcular(3.2, 6.5);

        assertEquals(9.7,resultado);
    }

    @Test
    public void sumaDecimalesNegativosTest() {
        double resultado = this.operacion.calcular(-7.4, -3.1);

        assertEquals(-10.5,resultado);
    }

    @Test
    public void sumaDecimalesPositivoNegativoTest() {
        double resultado = this.operacion.calcular(6.9, -1.7);

        assertEquals(5.2,resultado);
    }

    @Test
    public void sumaDecimalesNegativoPositivoTest() {
        double resultado = this.operacion.calcular(-4.7, 6.2);

        assertEquals(1.5,resultado);
    }
}
