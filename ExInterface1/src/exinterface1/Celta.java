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
public class Celta implements Carro{

    @Override
    public void abrirPorta() {
        System.out.println("ABRIU 4 PORTAS OLOCO");
    }

    @Override
    public void virar() {
        System.out.println("Deu 360° e virou pra direita");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerou até a velocidade da luz");
    }
    
}
