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
public class FormaTridimensional extends Forma{
    /*---------------ATRIBUTOS-----------------*/
    private double volume;
    private double medida_1; //nao coloquei em Forma pra FormaBidimensional
                             //nao ficar sem nada :)
    
    /*--------------CONSTRUTOR-----------------*/
    public FormaTridimensional(double medida_1)
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    /*----------------METODOS-------------------*/
    @Override
    public void exibirDados(){
        super.exibirDados();
        obterVolume();
        System.out.println("Volume: " + getVolume());
    }
    
    public void obterVolume() //só declarei pras subclasses sobrescreverem
    {
        
    }

    
}
