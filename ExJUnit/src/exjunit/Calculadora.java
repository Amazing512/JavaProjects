package exjunit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Calculadora {
    public int soma(int a, int b)
    {
        return a+b;
    }
    
    
    public int mult(int a, int b)
    {
        return a*b;
    }
    
       
    public double divisaoPorZero(double x, double y)
    {
        if(y == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            return x/y;
        }
    }
}
