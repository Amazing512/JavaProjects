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
public class Veiculo_Motor extends Veiculo{
    private int tam_motor = 10;
    private String no_placa;
    
    public Veiculo_Motor(float velocidade, int cor, int tam_motor, String no_placa)
    {
        super(velocidade,cor);
        if(tam_motor>0)
        {
            this.tam_motor = tam_motor;
        }
        else
        {
            System.out.println("Tamanho do motor padrao.");
        }
        this.no_placa = no_placa;
    }

    public int getTam_motor() {
        return tam_motor;
    }

    public void setTam_motor(int tam_motor) {
        this.tam_motor = tam_motor;
    }

    public String getNo_placa() {
        return no_placa;
    }

    public void setNo_placa(String no_placa) {
        this.no_placa = no_placa;
    }
    
}
