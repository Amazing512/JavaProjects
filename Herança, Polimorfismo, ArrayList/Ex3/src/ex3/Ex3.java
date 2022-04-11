/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo_1 = new Circulo(5);
        Quadrado quadrado_1 = new Quadrado(2);
        Triangulo triangulo_1 = new Triangulo(5,2);
        Esfera esfera_1 = new Esfera(5);
        Cubo cubo_1 = new Cubo(2);
        Tetraedro tet = new Tetraedro(5);
        
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo_1);
        formas.add(quadrado_1);
        formas.add(triangulo_1);
        formas.add(esfera_1);
        formas.add(cubo_1);
        formas.add(tet);
        
        for (Forma aux: formas)
        {
            if(aux instanceof FormaBidimensional)
            {
                FormaBidimensional bidi = new FormaBidimensional(0);
                bidi = (FormaBidimensional) aux;
                bidi.exibirDados();
            }
            if (aux instanceof FormaTridimensional)
            {
                FormaTridimensional tridi = new FormaTridimensional(0);
                tridi = (FormaTridimensional) aux;
                tridi.exibirDados();
            }
        }
        
        
        
         
        
        
        }
    
}
