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
public class FormaBidimensional extends Forma{
    /*---------------ATRIBUTOS-----------------*/
    private double medida_1; //Vai ser tratada como Raio no circulo, 
                            // Lado no Quadrado e base no Triangulo.
    
    /*--------------CONSTRUTOR-----------------*/
    public FormaBidimensional(double medida_1)
    {
        this.medida_1 = medida_1;
    }
    
     /*------------GETTERS E SETTERS--------------*/
    public double getMedida_1() {
        return medida_1;
    }

    public void setMedida_1(double medida_1) {
        this.medida_1 = medida_1;
    }
}
