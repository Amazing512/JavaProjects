/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;

/**
 *
 * @author mathe
 */
public class ExercicioInterface {

    public static void main(String[] args) {
        TipoPagamento cartao = new CartaoCredito(200);
        CartaoCredito cartao2 = new CartaoCredito(1000);
        TipoPagamento dinheiro = new Dinheiro(40);
        Dinheiro dinheiro2 = new Dinheiro(80);
        TipoPagamento cheque = new Cheque(100);
        Cheque cheque2 = new Cheque(500);
        
        System.out.println(cartao.getPorcentagemFinanceiraPaga());
        System.out.println(cartao2.getPorcentagemFinanceiraPaga());
        System.out.println(dinheiro.getPorcentagemFinanceiraPaga());
        System.out.println(dinheiro2.getPorcentagemFinanceiraPaga());
        System.out.println(cheque.getPorcentagemFinanceiraPaga());
        System.out.println(cheque2.getPorcentagemFinanceiraPaga());
    }
    
}
