/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author mathe
 */
public class Usado extends Imovel{
    private double descontoPreco;
    
    public Usado( String endereco, double preco, double descontoPreco)
    {
        super(endereco,preco);
        this.descontoPreco = descontoPreco;
    }

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }
    
    @Override
    public void imprimirValorFinal()
    {
        System.out.println("Preco: " + (getPreco() - descontoPreco));
    }
}
