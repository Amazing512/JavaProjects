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
public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, float altura) {
        super(nome, idade, altura);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void mostraDados()
    {
        System.out.println("É professor");
        //super.mostraDados();
    }
}
