/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpolimorfismo;

/**
 *
 * @author mathe
 */
public class ExercPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal bob = new Cachorro("Bob", 2);
        bob.emitirSom();
        Animal carlinho = new Preguica("Carlos",10);
        if(carlinho instanceof Preguica)
        {
            System.out.println("CARLINHOS É UMA PREGUICA WOW");
            //carlinho.subirArvore();
            carlinho.emitirSom();
        }

        Animal cavaalo = new Cavalo("Cavaaaalo", 13);
        
        if(cavaalo instanceof Preguica)
        {
            Preguica preguicinha = (Preguica) cavaalo;
        }
        else
        {
            Cavalo calvalinho = (Cavalo)cavaalo;
            calvalinho.correr();
            calvalinho.emitirSom();
        }
        
                
    }
    
}
