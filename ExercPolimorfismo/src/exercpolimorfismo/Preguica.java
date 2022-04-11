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
public class Preguica extends Animal{
    public Preguica(String nome, int idade)
    {
        super(nome,idade);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Sloooooooooow");
    }
    
    public void subirArvore()
    {
        System.out.println("Subindo na Arvore");
    }    
}
