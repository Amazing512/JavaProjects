/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_oo;

/**
 *
 * @author mathe
 */
public class Exercicio3_OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //intancia de Einstein (classe pessoa)
        Pessoa einstein = new Pessoa(14,3,1879,"Einstein");
        einstein.calculaIdade(15,3,2020);
        System.out.println("Nome: " + einstein.informaNome());
        System.out.println("Idade: " + einstein.getIdade());
        //instancia de Newton (classe pessoa)
        Pessoa newton = new Pessoa(4,1,1643,"Newton");
        newton.calculaIdade(15, 3,2020);
        System.out.println("Nome: " + newton.informaNome());
        System.out.println("Idade: " + newton.getIdade());  
    }
    
}
