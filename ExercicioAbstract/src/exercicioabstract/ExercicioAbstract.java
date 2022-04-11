/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioabstract;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class ExercicioAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horista horista_1 = new Horista("Joao","Alberto", "111-111-111-11", 100, 5);
        Horista horista_2 = new Horista("Joao","Robertinho", "111-111-111-12", 1000, 6);
        Comissionado comissionado_1 = new Comissionado("Julinho", "Alpaca", "111-111-111-13", 10000, 0.2);
        Comissionado comissionado_2 = new Comissionado("Julinho", "Cabra", "111-111-111-14", 20000, 0.5);
        Assalariado assa_1 = new Assalariado("Jacindo","Aduro","111-111-111-15", 7000);
        Assalariado assa_2 = new Assalariado("Jacindo","Alito","111-111-111-16", 7000);
        
        ArrayList<Empregado> listaEmpregados = new ArrayList<>();
        listaEmpregados.add(horista_1);
        listaEmpregados.add(horista_2);
        listaEmpregados.add(comissionado_1);
        listaEmpregados.add(comissionado_2);
        listaEmpregados.add(assa_1);
        listaEmpregados.add(assa_2);
        
        double totalVendas = 0;
        for(Empregado empregado: listaEmpregados)
        {   
            if (empregado instanceof Comissionado)
            {
                Comissionado aux = (Comissionado)empregado;
                totalVendas+= aux.getTotalVenda();
            }
        }
        System.out.println("O total das vendas realizadas por essa empresa foi de: " + totalVendas);
    }
    
}
