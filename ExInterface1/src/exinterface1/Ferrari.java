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
public class Ferrari implements Carro, ItemCaro{

    @Override
    public void abrirPorta() {
        System.out.println("Abriu 2 portas");
    }

    @Override
    public void virar() {
        System.out.println("Virou a direita");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerou até 300Km/h");
    }

    @Override
    public double getPreco() {
        return 1000000;
    }
    
}
