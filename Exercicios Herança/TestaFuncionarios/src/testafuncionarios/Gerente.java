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
public class Gerente extends Funcionario{
    private String username;
    private String password;
    
    public Gerente(String nome, double salario, String username, String password)
    {
        super(nome, salario);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public double calculaBonificacao()
    {
        double calculo;
        calculo = 0.3 * getSalario();
        return calculo;
    }
    
    @Override
    public void mostraDados()
    {
        super.mostraDados();
        System.out.println("Nome de Usuario: " + getUsername());
        System.out.println("Senha: " + getPassword());
        System.out.println("Bonificação: " + calculaBonificacao());
    
    }
    
}
