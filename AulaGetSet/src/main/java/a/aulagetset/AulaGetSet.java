/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.aulagetset;

/**
 *
 * @author mathe
 */
public class AulaGetSet {
     public static void main(String[] args){
         Aluno eduardo = new Aluno();
         eduardo.setNome("Eduardo Correia");
         eduardo.setRa(1234);
         
         System.out.println("\nO nome do aluno e " + eduardo.getNome());
         System.out.println("\nO ra do aluno e " + eduardo.getRa());
     }
}
