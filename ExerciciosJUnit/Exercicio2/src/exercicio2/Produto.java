/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author mathe
 */
public abstract class Produto {
    private String descricao;

    public Produto(String descricao) {
        if(descricao.equals(""))
            throw new NullPointerException("Descrição não pode ser nula");
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.equals(""))
            throw new NullPointerException("Descrição não pode ser nula");
        this.descricao = descricao;
    }

    public void mostrarDados()
    {
        System.out.println("Descrição: " + descricao);
    }
}
