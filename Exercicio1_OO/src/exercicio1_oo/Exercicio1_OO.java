/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_oo;

/**
 *
 * @author mathe
 */
public class Exercicio1_OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Funcionario juninho = new Funcionario();
        juninho.setNome("Junior");
        juninho.setSobrenome("Hélio");
        juninho.setSalarioMensal(10.0);
        System.out.println("Sem aumento: " + juninho.getSalarioMensal());
        System.out.println("Anual: " + juninho.calculoSalarioAnual());
        juninho.darAumento();
        System.out.println("Com aumento: " + juninho.getSalarioMensal());
        System.out.println("Anual: " + juninho.calculoSalarioAnual());
        //Funcionario 2
        Funcionario robinho = new Funcionario("Roberto", "Augusto", 5);
        System.out.println("Sem aumento: " + robinho.getSalarioMensal());
        System.out.println("Anual: " + robinho.calculoSalarioAnual());
        robinho.darAumento();
        System.out.println("Com aumento: " + robinho.getSalarioMensal());
        System.out.println("Anual: " + robinho.calculoSalarioAnual());
    }
    
}
