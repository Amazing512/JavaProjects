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
public class Moto extends Veiculo_Motor{
    
    public Moto(float velocidade, int cor, int tam_motor, String no_placa)
    {
        super(velocidade,cor,tam_motor,no_placa);
    }
    
    public void verMotor()
     {
         System.out.println("Parece que o motor nao tem nenhum problema");
     }
}
