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
public class ExcHeranca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pessoa p1 = new Pessoa();
        p1.setNome("Tania");
        System.out.println("Nome: " + p1.getNome());
        
        Aluno al1 = new Aluno();
        al1.setAltura(1.7f);
        System.out.println("Altura: " + al1.getAltura());
        al1.setRa(2222);
        System.out.println("RA: " + al1.getRa());
        
        Professor prof1 = new Professor();
        prof1.setSalario(2000);
        prof1.setIdade(23);
        System.out.println("Salario: " + prof1.getSalario());
        System.out.println("Idade: " + prof1.getIdade());
        
        Monitor mon1 = new Monitor();*/
        Pessoa p1 = new Pessoa("Enzo", 16, 1.8f);
        Aluno al1 = new Aluno("Eduardo", 17, 1.7f, 2345, true);
        Monitor mon1 = new Monitor("Bruno", 16, 1.6f, 6666, true,500.10);
        p1.mostraDados();
        System.out.println("");
        al1.mostraDados();
        System.out.println("");
        mon1.mostraDados();
}
}