/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_A;

/**
 *
 * @author mathe
 */
public class Bicicleta extends Veiculo{
    
    public Bicicleta(float velocidade, int cor)
    {
        super(velocidade,cor);
    }
    
    public void tocaCampainha()
    {
        System.out.println("TRIIIIIM TRIIIM");
    }
}
