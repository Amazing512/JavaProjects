/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjunit;

/**
 *
 * @author mathe
 */
public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0)
        {
            throw new IllegalArgumentException("OwO UwU loli não pode ser menor que 0 anos");
        }
        this.idade = idade;
    }
    
    
}
