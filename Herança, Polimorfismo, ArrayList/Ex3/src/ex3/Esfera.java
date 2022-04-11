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
public class Esfera extends FormaTridimensional{
    /*---------------ATRIBUTOS-----------------*/
    public static double pi = 3.14;
    
    /*--------------CONSTRUTOR-----------------*/
    public Esfera(double medida_1) //Medida 1 tratado como RAIO.
    {
        super(medida_1);
    }
    
    /*----------------METODOS-------------------*/
    @Override
    public void obterArea()
    {
        setArea(4 * pi * getMedida_1() * getMedida_1()); //Medida 1 é raio.
    }
    
    @Override
    public void obterVolume()
    {
        setVolume((4 * pi * getMedida_1() * getMedida_1() * getMedida_1())/3);
    }
}
