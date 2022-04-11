/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author mathe
 */
public class Triangulo extends FormaBidimensional{ 
    /*---------------ATRIBUTOS-----------------*/
    private double altura;

    /*--------------CONSTRUTOR-----------------*/
    public Triangulo(double medida_1,double altura)
    {
        super(medida_1);
        if(altura > 0)
        {
            this.altura = altura;
        }
        else
        {
            this.altura = 1;
            System.out.println("Altura do triangulo assumiu valor padrao 1.");
        }
    }
    
    /*------------GETTERS E SETTERS--------------*/
     public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    /*----------------METODOS-------------------*/
    @Override
    public void obterArea()
    {
        setArea((getMedida_1() * altura)/2); //Medida 1 é base.
    }
}
