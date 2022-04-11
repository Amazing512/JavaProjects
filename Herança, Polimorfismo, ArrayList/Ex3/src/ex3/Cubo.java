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
public class Cubo extends FormaTridimensional{
    /*--------------CONSTRUTOR-----------------*/
    public Cubo(double medida_1) //Medida 1 tratado como LADO.
    {
        super(medida_1);
    }
    
    /*----------------METODOS-------------------*/
    @Override
    public void obterArea()
    {
        setArea(6 * getMedida_1() * getMedida_1());
    }
    
    @Override
    public void obterVolume()
    {
        setVolume(getMedida_1() * getMedida_1() * getMedida_1());
    }
}
