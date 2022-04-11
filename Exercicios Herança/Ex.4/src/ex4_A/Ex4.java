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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo a = new Veiculo(30,255255255);
        a.giraDir();
        a.giraesq();
        
        
        Bicicleta b = new Bicicleta(500,255255100);
        b.tocaCampainha();
        b.giraesq();
        b.giraDir();
        
        Veiculo_Motor vei = new Veiculo_Motor(750,255255100,20,"CHILL");
        vei.getTam_motor();
        vei.giraesq();
        vei.giraDir();
        
        Moto moto = new Moto(1000,255255100,15,"U CANT SEE ME");
        moto.verMotor();
        moto.getTam_motor();
        moto.giraesq();
        moto.giraDir();
        
        Carro carro = new Carro(5000,255255100,15,"AAAA",4);
        carro.ligaAr();
        carro.getNo_portas();
        carro.getTam_motor();
        carro.giraesq();
        carro.giraDir();
    }
    
}
