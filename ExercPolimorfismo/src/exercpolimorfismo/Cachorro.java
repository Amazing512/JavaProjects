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
public class Cachorro extends Animal{
    
    public Cachorro(String nome, int idade)
    {
        super(nome,idade);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Au Au!");
    }
    
    public void correr()
    {
        System.out.println("Correndo");
    }
}
