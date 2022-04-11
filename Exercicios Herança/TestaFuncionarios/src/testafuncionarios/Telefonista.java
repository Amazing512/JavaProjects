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
public class Telefonista extends Funcionario {
    private int codigo;
    
    public Telefonista(String nome, double salario, int codigo)
    {
        super(nome,salario);
        this.codigo = codigo;
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    @Override
    public void mostraDados()
    {
        super.mostraDados();
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Bonificação: " + calculaBonificacao());
    }
}
