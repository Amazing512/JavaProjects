/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.defclasses;

/**
 *
 * @author mathe
 */
public class DefClasses {
    public static void main(String[] args){
        Aluno guatura = new Aluno();
        Aluno narezzi = new Aluno();
        
        guatura.altura = 1.7;
        guatura.feliz = true;
        guatura.nome = "Guilherme";
        guatura.ra = 19126;
        
        narezzi.nome = "Guilherme";
        narezzi.altura = 1.4;
        narezzi.feliz = true;
        narezzi.ra = 29384;
        
        guatura.assistirAulaTania();
        System.out.println("Estado do Guatura: " + guatura.feliz);
        
        guatura.matarAula();
        System.out.println("Estado do Guatura: " + guatura.feliz);
        
        boolean x;
        x = guatura.alturaMinima();
        System.out.println("Guatura tem altura minima? " + x);
        
        
        narezzi.assistirAulaTania();
        System.out.println("Estado do Narezzi: " + narezzi.feliz);
        
        narezzi.matarAula();
        System.out.println("Estado do Narezzi: " + narezzi.feliz);
        
        boolean y;
        y = narezzi.alturaMinima();
        System.out.println("Narezzi tem altura minima? " + y);
        //Disciplina
        Disciplina matematica = new Disciplina();
        matematica.nome = "matematica";
        matematica.qtdAlunos = 40;
        System.out.println("Quantos alunos tem no curso " + matematica.nome + "?");
        int aux = matematica.qtdAlunos/10;
        switch(aux)
        {
            case 0:
                System.out.println("Pouquissimos alunos");
                break;
            case 1:
                System.out.println("Poucos alunos");
                break;
            case 2:
                System.out.println("Quantidade mediana de alunos");
                break;
            case 3:
                System.out.println("Quantidade razoavel de alunos");
                break;
            default:
                System.out.println("Muitos alunos");
                break;  
        }
        //Professor
        Professor rosana = new Professor();
        rosana.idade = 30;
        rosana.nome = "Rosana";
        rosana.materiaLecionada = ".";
        System.out.println("A professora " + rosana.nome + " tem " + rosana.idade + " anos e leciona a matréria " + rosana.materiaLecionada);
        
    }
    
}
