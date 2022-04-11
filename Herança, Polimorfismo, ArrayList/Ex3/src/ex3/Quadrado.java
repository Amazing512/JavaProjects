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
public class Quadrado extends FormaBidimensional{
    /*--------------CONSTRUTOR-----------------*/
    public Quadrado(double medida_1)
    {
        super(medida_1);
    }
    
    /*----------------METODOS-------------------*/
    @Override
    public void obterArea()
    {
        setArea(getMedida_1() * getMedida_1()); //Medida 1 é lado.
    }
}
