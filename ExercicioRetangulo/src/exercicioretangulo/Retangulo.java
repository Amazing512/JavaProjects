/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioretangulo;

/**
 *
 * @author mathe
 */
public class Retangulo {
    
        //DEFINIÇAO DE ATRIBUTOS DA CLASSE
    private double base;
    private double altura;
    
    
        //METODOS CONSTRUTORES
    public Retangulo(double base, double altura)
    {
        if (base <= 20 && base>=1)
        {
            this.base = base;
        }
        else
        {
            System.out.println("A base assumiu o valor padrao.");
            this.base = 1;
        }

        if (altura <= 20 && altura>=1)
        {
            this.altura = altura;
        }
        else
        {
            System.out.println("A altura assumiu o valor padrao.");
            this.altura = 1;
        }     
    }
    
    public Retangulo()
    {
        this.base = 1;
        this.altura = 1;
    }
    
        //GETTERS E SETTERS
    public double getBase()
    {
        return this.base;
    }
    
    public void setBase(double base)
    {
        if (base <= 20 && base>=1)
        {
            this.base = base;
        }
        else
        {
            System.out.println("Falha na atribuicao de valor.");
        }
    }
    
    public double getAltura()
    {
        return this.altura;
    }
    
    public void setAltura(double altura)
    {
        if (altura <= 20 && altura>=1)
        {
            this.altura = altura;
        }
        else
        {
            System.out.println("Falha na atribuicao de valor.");
        }
    }
    
    
        //FUNCOES DE CALCULO
    public double calculoPerimetro()
    {
        double perimetro;
        perimetro = this.base*2 + this.altura*2;   
        return perimetro;
    }
    
    public double calculoArea()
    {
        double area;
        area = this.base*this.altura;
        return area;
    }

}
