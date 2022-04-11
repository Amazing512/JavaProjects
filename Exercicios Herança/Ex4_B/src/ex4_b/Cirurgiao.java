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
public class Cirurgiao extends Medico{
    
    public Cirurgiao(boolean trabalhaNoHospital)
    {
        super(trabalhaNoHospital);
    }
    
    @Override
    public void tratarPaciente()
    {
        fazerIncisao();
        System.out.println("Cirurgia realizada com sucesso!!!!");
    }
    
    public void fazerIncisao()
    {   
        System.out.println("Incisao realizada com sucesso!");
    }
}
