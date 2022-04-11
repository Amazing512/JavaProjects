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
public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;
    
    public ContaBancaria()
    {
        this.saldo=0;
    }
    
    public ContaBancaria(String cliente, int numConta, double saldo)
    {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void sacar(double saque)
    {
        double aux = saldo - saque;
        if(aux < 0)
        {
            System.out.println("Não foi possivel realizar o saque;");
            System.out.println("Verifique o saldo da sua conta.");
        }
        else
        {
            this.saldo-=saque;
            System.out.println("Saque realizado.");
        }
    }
    
    public void depositar(double deposito)
    {
        this.saldo +=deposito;
        System.out.println("Depósito realizado.");
    
    }
    
    public void mostrarDados()
    {
        System.out.println("Nome: " + getCliente());
        System.out.println("N° da conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }


    
}
