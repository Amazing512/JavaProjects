/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author mathe
 */
public class Imovel {
    private int codigo;
    private String endereco;
    private double preco = 0;
    
    public Imovel(int codigo, String endereco, double preco)
    {
        this.codigo = codigo;
        this.endereco = endereco;
        if(preco > 0)
        { 
            this.preco = preco;
        }
        else
        {
            System.out.println("Preço não pode ser negativo. Preço assumiu valor padrao 0");
        }
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void imprimirDados()
    {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Endereco: " + this.endereco);
        imprimirValorFinal();

    }
    
    public void imprimirValorFinal()
    {
        System.out.println("Preco: " + this.preco);
    }
}
