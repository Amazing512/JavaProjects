/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_oo;

/**
 *
 * @author mathe
 */
public class Estoque {
      //Atributos
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    
      //Metodos COnstrutores
    public Estoque()
    {
        this.qtdAtual = 0;
        this.qtdMinima = 0;
        this.nome = null;
    }
      
    public Estoque(String nome, int qtdAtual, int qtdMinima)
    {
        this.nome = nome;
        if(qtdAtual>=0)
        {
            this.qtdAtual = qtdAtual;
        }
        else
        {
            System.out.println("Qtd atual assumiu valor padrao 0.");
            this.qtdAtual=0;
        }
        if(qtdMinima>=0)
        {
            this.qtdMinima = qtdMinima;
        }
        else
        {
            System.out.println("Qtd minima assumiu valor padrao 0.");
            this.qtdMinima = 0;
        }
    }
    
      //métodos
    public void repor(int qtd)
    {
        if(qtd == 0)
        {
            System.out.println("Sem alterações");
            return;
        }
        if(qtd<0)
        {
            System.out.println("Não é possível repor usando valores negativos");
            return;
        }
            this.qtdAtual += qtd;
    }
    
    public void darBaixa(int qtd)
    {
        if(qtd == 0)
        {
            System.out.println("Sem alterações");
            return;
        }
        if(qtd<0)
        {
            System.out.println("Não é possível dar baixa usando valores negativos");
            return;
        }
        if((this.qtdAtual - qtd) < 0)
        {
            System.out.println("qtdAtual não pode assumir valores negativos! Não houve alterações no estoque.");
            return;
        }
        this.qtdAtual -=qtd;
    }
    
    public String mostra()
    {
        String concatenado;
        concatenado = "Nome: " + this.nome + "; quantidade atual: " + this.qtdAtual +
        "; Quantidade Mínima: " + this.qtdMinima;
        return concatenado;
    }
    
    public boolean precisaRepor()
    {
        return this.qtdAtual <= this.qtdMinima;
    }
}
