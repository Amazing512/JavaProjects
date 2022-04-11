/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;


public class Exercicio1 {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(5,5);
        Ponto2D ponto2 = new Ponto3D(5,10,-2);
        Ponto2D ponto3 = new Ponto3D(5,10,10);
        Ponto2D ponto4 = new Ponto2D(1,2);
        Ponto2D ponto5 = new Ponto2D(-5,5);
        
        ArrayList<Ponto2D> figura = new ArrayList<>();
        figura.add(ponto1);
        figura.add(ponto2);
        figura.add(ponto3);
        figura.add(ponto4);
        figura.add(ponto5);
        
        ArrayList<Ponto3D> figura3D = new ArrayList();
        for(Ponto2D ponto: figura)
        {
            if(ponto instanceof Ponto3D)
            {
                figura3D.add((Ponto3D)ponto);
            }
            else
            {
                System.out.println("ponto figura 2D: " + ponto.toString());
            }
        }
        for(Ponto3D ponto: figura3D)
        {
            System.out.println("Ponto figura 3D: " + ponto.toString());
        }
    }
    
}
