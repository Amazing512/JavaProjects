/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exstatic;

/**
 *
 * @author mathe
 */
public class Poupanca {
    private static double taxaJuros = 1.7;
    private double saldo;
    
    public Poupanca(double saldo)
    {
        this.saldo=saldo;
    }
    
    public Poupanca()
    {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public static double getTaxaJuros() {
        return taxaJuros;
    }

    public static void setTaxaJuros(double ataxaJuros) {
        Poupanca.taxaJuros = ataxaJuros;
    }
    
    public void calcularJurosMensais()
    {
        this.saldo += this.saldo * this.taxaJuros/12;
    }
    
    public static void modificaTaxaJuro(double ataxaJuros)
    {
        taxaJuros = ataxaJuros;
    }
}
