/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author mathe
 */
public class Vip extends Ingresso{
    private double valorAdicional;
    
    public Vip(double valor, double valorAdicional)
    {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public void imprimeValor()
    {
        System.out.println("VIP, preco: " + (getValor() + this.valorAdicional));
    }
}
