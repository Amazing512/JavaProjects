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
public class ClinicoGeral extends Medico{
    private boolean trabalhaEmCasa;
    
    public ClinicoGeral(boolean trabalhaEmCasa)
    {
        super(!trabalhaEmCasa);
        this.trabalhaEmCasa = trabalhaEmCasa;
    }

    public boolean isTrabalhaEmCasa() {
        return trabalhaEmCasa;
    }

    public void setTrabalhaEmCasa(boolean trabalhaEmCasa) {
        this.trabalhaEmCasa = trabalhaEmCasa;
    }
    
    public void receitar()
    {
        System.out.println("Receitado com Sucesso!!!!");
    }
    
}
