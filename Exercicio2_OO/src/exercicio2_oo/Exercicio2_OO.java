/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_oo;

/**
 *
 * @author mathe
 */
public class Exercicio2_OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item prego = new Item();
        prego.setCodigo(1);
        prego.setDescr("Prego novinho em folha só pra voce compra pfv");
        prego.setPreco(500);
        prego.setQtd(2);
        System.out.println("O item , cuja descrição é '" + prego.getDescr() + "' custa " + prego.getPreco());
        System.out.println("Como vao ser compradas " + prego.getQtd() + " unidade(s) do item, o cliente irá pagar " + prego.getTotal());
    }
    
}
