/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionarios;

/**
 *
 * @author mathe
 */
public class Secretaria extends Funcionario{
    private int numeroRamal;
    
    public Secretaria(String nome, double salario, int numeroRamal)
    {
        super(nome, salario);
        this.numeroRamal = numeroRamal;
    }
    
    public int getNumeroRamal()
    {
        return this.numeroRamal;
    }
    
    public void setNumeroRamal(int numeroRamal)
    {
        this.numeroRamal = numeroRamal;
    }
    
    @Override
    public void mostraDados()
    {
        super.mostraDados();
        System.out.println("Numero Ramal: " + getNumeroRamal());
        System.out.println("Bonificação: " + calculaBonificacao());
    }
}
