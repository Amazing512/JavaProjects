package ex4_A;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Veiculo {
    private float velocidade;
    private int cor;

    public Veiculo(float velocidade, int cor)
    {
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    
    public void giraDir()
    {
        System.out.println("Girando à direita...");
    }
    
    public void giraesq()
    {
        System.out.println("Girando à esquerda...");
    }
}
