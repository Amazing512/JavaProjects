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
public class ContaEspecial extends ContaBancaria{
    private float limite;
    
     public ContaEspecial()
    {
        super();
        this.limite=1000;
    }
    
    public ContaEspecial(String cliente, int numConta, double saldo, float limite)
    {
        super(cliente,numConta,saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double saque)
    {
        double aux = getSaldo() + limite - saque;
        if(aux < 0)
        {
            System.out.println("Não foi possivel realizar o saque;");
            System.out.println("Verifique o saldo da sua conta.");
        }
        else
        {
            setSaldo(getSaldo()-saque);
            System.out.println("Saque realizado.");
        }
    }
    
    @Override
    public void mostrarDados()
    {
        super.mostrarDados();
        System.out.println("Limite de saque: " + (getSaldo() + getLimite()));
    }
    
}
