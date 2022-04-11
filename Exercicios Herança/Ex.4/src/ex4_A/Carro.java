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
public class Carro extends Veiculo_Motor{
    private int no_portas;

     public Carro(float velocidade, int cor, int tam_motor, String no_placa, int no_portas)
    {
        super(velocidade,cor,tam_motor,no_placa);
        this.no_portas = no_portas;
    }

    public int getNo_portas() {
        return no_portas;
    }

    public void setNo_portas(int no_portas) {
        this.no_portas = no_portas;
    }
     
    public void ligaAr()
    {
        System.out.println("Ar condicionado ligado.");
    }
}
