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
public class Aluno extends Pessoa {
    int ra;
    boolean preguica;

    public Aluno(String nome, int idade, float altura, int ra, boolean preguica) {
        super(nome, idade, altura);
        this.ra = ra;
        this.preguica = preguica;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override
    public void mostraDados()
    {
        System.out.println("É um aluno com RA " + this.ra);
        //super.mostraDados();
    }
}
