/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Novo imovelNovo1 = new Novo("RUA OLAVO BILAC", 20000, 2000);
        Novo imovelNovo = new Novo("RUA JACAREZINHO", 12000,5000);
        Usado imovelUsado = new Usado("RUA RUA RUA RUA", 15000,5000);
        Usado imovelUsado1 = new Usado("LPAPAPAPPA", 25000,5000);
        ArrayList<Imovel> imoveis = new ArrayList<>();
        imoveis.add(imovelNovo1);
        imoveis.add(imovelNovo);
        imoveis.add(imovelUsado);
        imoveis.add(imovelUsado1);
        for(Imovel aux: imoveis)
        {
            if(aux instanceof Novo)
            {
                aux.imprimirDados();
            }
        }
    }
    
}
