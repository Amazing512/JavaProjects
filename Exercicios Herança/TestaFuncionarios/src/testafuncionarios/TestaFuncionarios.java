/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionarios;

/**
 *
 * @author mathe
 */
public class TestaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TESTE GERENTE
        Gerente gerente = new Gerente("Robertinho", 3000.0, "euSouALei", "1234321");
        gerente.mostraDados();
        System.out.println("");
        
        //TESTE TELEFONISTA
        Telefonista telefonista = new Telefonista("Juliana", 2550.0, 123444);
        telefonista.mostraDados();
        System.out.println("");
        
        //TESTE SECRETARIA
        Secretaria secretaria = new Secretaria("Caminhao vrum vrum", 5000.0, 123123123);
        secretaria.mostraDados();
        System.out.println("");
    }
    
}
