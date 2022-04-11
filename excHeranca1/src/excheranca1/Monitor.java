/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excheranca1;

/**
 *
 * @author mathe
 */
public class Monitor extends Aluno {
    private double bolsa;

    public Monitor(String nome, int idade, float altura, int ra, boolean preguica, double bolsa) {
        super(nome, idade, altura, ra, preguica);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void mostraDados()
    {
        System.out.println("É monitor e tem bolsa de " + this.bolsa);
        //super.mostraDados();
    }

}
