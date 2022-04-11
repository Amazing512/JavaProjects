/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioretangulo;

import java.util.Set;

/**
 *
 * @author mathe
 */
public class ExercicioRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n\nRetangulin:");
            //teste passar valores pelo metodo construtor retangulin
        Retangulo retangulin = new Retangulo(5,5);
        System.out.println("Altura: " + retangulin.getAltura() + ", Base: " + retangulin.getBase());
        
            //calculo area e perimetro do retangulin
        double area = retangulin.calculoArea(); 
        System.out.println("Area: " + area);
        double perimetro = retangulin.calculoPerimetro();
        System.out.println("Perimetro: " + perimetro);
        
        System.out.println("\n\nRetangulao:");
            //teste passar valores pelo set retangulao
        Retangulo retangulao = new Retangulo();
        retangulao.setBase(20);
        retangulao.setAltura(19.2);
        System.out.println("Altura: " + retangulao.getAltura() + ", Base: " + retangulao.getBase());
        
            //calculo area e perimetro do retangulao
        area = retangulao.calculoArea(); 
        System.out.println("Area: " + area);
        perimetro = retangulao.calculoPerimetro();
        System.out.println("Perimetro: " + perimetro);
    }

}
