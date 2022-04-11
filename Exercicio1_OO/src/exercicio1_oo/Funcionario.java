/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_oo;

/**
 *
 * @author mathe
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    
      //Métodos Construtores
    public Funcionario()
    {
        this.nome = null;
        this.sobrenome = null;
        this.salarioMensal = 0;
    }
    
    public Funcionario(String nome, String sobrenome, double salarioMensal)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salarioMensal<0)
        {
            System.out.println("Salario recebeu valor padrao.");
            this.salarioMensal = 0;
        }
        else
        {
            this.salarioMensal = salarioMensal;
        }    
    }
    
      //Getters e Setters
        //Nome
    public String getNome()
    {
        return nome;
    }
        
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
        //Sobrenome
    public String getSobrenome()
    {
        return nome;
    }
    
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
        //Salario Mensal
    public double getSalarioMensal()
    {
        return salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }
    
      //Fim Getters e Setters
    
    public double calculoSalarioAnual()
    {
        return this.salarioMensal * 12;
    }
    
    public void darAumento()
    {
        this.salarioMensal *= 1.1;
    }
    
    
}
