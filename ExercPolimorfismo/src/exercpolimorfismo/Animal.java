/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpolimorfismo;

/**
 *
 * @author mathe
 */
public class Animal {
    private String nome;
    private int idade;
    
    public Animal(String nome, int idade)
    {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void emitirSom()
    {
    
    }
}
