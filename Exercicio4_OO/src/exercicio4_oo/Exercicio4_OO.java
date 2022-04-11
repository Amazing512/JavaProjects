/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_oo;

/**
 *
 * @author mathe
 */
public class Exercicio4_OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estoque estoque1 = new Estoque("Impressora", 13, 6);
        Estoque estoque2 = new Estoque("Monitor", 11, 13);
        Estoque estoque3 = new Estoque("Mouse", 6, 2);
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);
        System.out.println(estoque1.precisaRepor());
        System.out.println(estoque2.precisaRepor());
        System.out.println(estoque3.precisaRepor());
        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());

    }
    
}
