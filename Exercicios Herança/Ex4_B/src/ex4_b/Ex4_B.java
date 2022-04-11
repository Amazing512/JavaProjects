/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_b;

/**
 *
 * @author mathe
 */
public class Ex4_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico juninho = new Medico(true);
        juninho.tratarPaciente();
        ClinicoGeral robertinho = new ClinicoGeral(false);
        robertinho.receitar();
        robertinho.tratarPaciente();
        Cirurgiao voce = new Cirurgiao(true);
        voce.tratarPaciente();
        voce.fazerIncisao();
    }
    
}
