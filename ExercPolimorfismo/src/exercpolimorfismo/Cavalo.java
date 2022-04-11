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
public class Cavalo extends Animal{
    
    public Cavalo(String nome, int idade)
    {
        super(nome,idade);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("HIIIINCH!");
    }
    
    public void correr()
    {
        System.out.println("Correndo");
    }
}
