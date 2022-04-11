/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import exjunit.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mathe
 */
public class CalculadoraTest {
    Calculadora c;
    int a,b;
    public CalculadoraTest() {
        c = new Calculadora();
    }
    
    @Before
    public void setValues()
    {
        a = 2;
        b = 5;
    }
    
    @Test
    public void testaSoma()
    {
        Calculadora c = new Calculadora();
        assertEquals(5, c.soma(3,2));
    }
    
    @Test
    public void testaMult()
    {
        Calculadora c = new Calculadora();
        assertEquals(12, c.mult(3,4));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testeDiviZero()
    {
        double diviZero = c.divisaoPorZero(a, 0);
    }
}
