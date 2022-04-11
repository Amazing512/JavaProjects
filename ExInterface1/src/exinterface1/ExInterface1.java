/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface1;

/**
 *
 * @author mathe
 */
public class ExInterface1 {
    
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        f1.acelerar();
        Celta c1 = new Celta();
        c1.acelerar();
        Carro car1 = new Celta();
        car1.acelerar();
        
        ItemCaro car2 = new Ferrari();
        System.out.println(car2.getPreco());
    }
    
}
