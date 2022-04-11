/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontas;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;
    
    public ContaPoupanca()
    {
        super();
        this.diaRendimento=1;
    }
    
    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento)
    {
        super(cliente,numConta,saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    void calcularNovoSaldo(double taxaRendimento)
    {
        setSaldo(getSaldo() * taxaRendimento);
    }
    
    @Override
    public void mostrarDados()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a taxa de Rendimento: ");
        double taxaRendimento = teclado.nextDouble();
        calcularNovoSaldo(taxaRendimento);
        super.mostrarDados();
        System.out.println("Dia Rendimento: " + getDiaRendimento());
    }
    
}
