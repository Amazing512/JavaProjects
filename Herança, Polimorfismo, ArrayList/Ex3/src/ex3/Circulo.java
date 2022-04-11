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
public class Circulo extends FormaBidimensional{
    /*---------------ATRIBUTOS-----------------*/
    private static double pi = 3.14;
    
    /*--------------CONSTRUTOR-----------------*/
    public Circulo(double medida_1)
    {
        super(medida_1);
    }
    
    /*----------------METODOS-------------------*/
    @Override
    public void obterArea()
    {
        setArea(pi * getMedida_1() * getMedida_1()); //Medida 1 é raio.
    }
    
    
}
