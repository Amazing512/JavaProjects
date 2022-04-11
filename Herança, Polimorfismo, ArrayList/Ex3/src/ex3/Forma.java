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
public class Forma {
    /*---------------ATRIBUTOS-----------------*/
    private double area; //Como a classe forma não tem nenhum filho com apenas
                        //1 dimensão, a area pode ficar aqui
    
    /*--------------CONSTRUTOR-----------------*/
    public Forma()
    {
        this.area = 0;
    }
    
    /*------------GETTERS E SETTERS------------*/
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    /*----------------METODOS-------------------*/
    public void obterArea(){ //pros filhos sobrescreverem
        
    }
                                //deixei aqui pensando que nao vai ter nenhuma 
                                //instancia de forma, formaBidimensional e 
    public void exibirDados(){  //formaTridimensional
        obterArea();
        System.out.println("Area: " + this.area);
    }
}
