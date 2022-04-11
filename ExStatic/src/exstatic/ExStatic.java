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
public class ExStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poupanca poupanca1 = new Poupanca(2000);
        Poupanca poupanca2 = new Poupanca(3000);
        Poupanca.setTaxaJuros(0.03);
        poupanca1.calcularJurosMensais();
        poupanca2.calcularJurosMensais();
        System.out.println("Taxa Anual: " + Poupanca.getTaxaJuros());
        System.out.println("Saldo poupanca1: " + poupanca1.getSaldo());
        System.out.println("Saldo poupanca2: " + poupanca2.getSaldo());
        Poupanca.setTaxaJuros(0.04);
        poupanca1.calcularJurosMensais();
        poupanca2.calcularJurosMensais();
        System.out.println("Taxa Anual: " + Poupanca.getTaxaJuros());
        System.out.println("Saldo poupanca1: " + poupanca1.getSaldo());
        System.out.println("Saldo poupanca2: " + poupanca2.getSaldo());
    }
    
}
