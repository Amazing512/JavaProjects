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
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario)
    {
        if(salario>=0)
        {
            this.salario = salario;
        }
        else
        {
            System.out.println("Salario assumiu valor 0.");
        }
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    
    public double calculaBonificacao()
    {
        double calculo = this.salario * 0.1;
        return calculo;
    }
    
    public void mostraDados()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
    }
}
