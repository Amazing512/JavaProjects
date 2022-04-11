/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontas;

/**
 *
 * @author mathe
 */
public class AppContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria("PAPAI", 1, 2100);
        ContaPoupanca contaPoupanca = new ContaPoupanca("EUZINHO", 2, 5000, 29);
        ContaEspecial contaEspecial = new ContaEspecial("MAMAE", 3, 10000, 5000);
        contaBancaria.depositar(50);
        contaPoupanca.depositar(500);
        contaEspecial.depositar(1000);
        System.out.println("");
        contaBancaria.sacar(1000);
        contaPoupanca.sacar(750);
        contaEspecial.sacar(2000);
        System.out.println("");
        contaBancaria.mostrarDados();
        System.out.println("");
        contaPoupanca.mostrarDados();
        System.out.println("");
        contaEspecial.mostrarDados();
    }
    
}
