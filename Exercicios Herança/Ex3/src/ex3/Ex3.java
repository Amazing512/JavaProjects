/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author mathe
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imovel imovelNormal = new Imovel(1,"RUA OLAVO BILAC", 20000);
        Novo imovelNovo = new Novo(2,"RUA JACAREZINHO", 20000,5000);
        Usado imovelUsado = new Usado(2,"RUA RUA RUA RUA", 20000,5000);
        imovelNormal.imprimirDados();
        System.out.println("");
        imovelNovo.imprimirDados();
        System.out.println("");
        imovelUsado.imprimirDados();
    }
    
}
