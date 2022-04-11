/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Ex1 {

    public static void main(String[] args) {
        Vip ingressoVip = new Vip(20,10);
        Comum ingressoComum = new Comum(20);
        Comum com = new Comum(15);
        Vip vipe = new Vip(30,10);
        
        ArrayList<Ingresso> ingressos = new ArrayList<>();
        ingressos.add(ingressoVip);
        ingressos.add(ingressoComum);
        ingressos.add(com);
        ingressos.add(vipe);
        for(Ingresso aux: ingressos)
        {
            aux.imprimeValor();
        }
    }
    
}
