/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_oo;

/**
 *
 * @author mathe
 */
public class Item {
    private int codigo;
    private String descr;
    private int qtd;
    private double preco;
    
      //Construtor
    public Item()
    {
        this.codigo = 0;
        this.descr = null;
        this.qtd = 0;
        this.preco = 0.0;
    }
    
      //Getters e Setters 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0)
        {
            this.preco = 0;
        }
        else
        {
            this.preco = preco;
        }
    }
    
      //Métodos
    
    public double getTotal()
    {
        return this.qtd * this.preco;
    }
    
}
