/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import static java.lang.Math.sqrt;

/**
 *
 * @author mathe
 */
public class Tetraedro extends FormaTridimensional{
    /*---------------ATRIBUTOS-----------------*/
    private double altura;
    
    /*--------------CONSTRUTOR-----------------*/
    public Tetraedro(double medida_1) //Medida 1 tratado como ARESTA.
    {
        super(medida_1);
        obterAltura();
    }
    
    /*------------GETTERS E SETTERS--------------*/
    public double getAltura() {
        return altura;
    }                           
                               //Como considerei ser um tetraedro regular,  
    private void obterAltura() //a altura é calculada
    {
        this.altura = (getMedida_1() * sqrt(3))/3;
    }
    
    
    /*----------------METODOS-------------------*/
    @Override
    public void obterArea()
    {
        setArea(getMedida_1() * getMedida_1() * sqrt(3));
    }

    @Override
    public void obterVolume()
    {
        setVolume((getMedida_1() * getMedida_1() * sqrt(3) * this.altura)/3);
    }


}
