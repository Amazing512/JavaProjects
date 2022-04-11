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
public class Medico {
    private boolean trabalhaNoHospital;
    
    public Medico(boolean trabalhaNoHospital)
    {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
    

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
    
    public void tratarPaciente()
    {
        System.out.println("Paciente tratado com sucesso!!!!");
    }
}
