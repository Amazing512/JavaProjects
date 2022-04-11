/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemhibernate;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Disciplina;
import model.Professor;

import org.hibernate.query.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author mathe
 */
public class ExemHibernate {

    public static void main(String[] args) {
        
        Aluno al1 = new Aluno (1234, "Guilherme");
        Aluno al2 = new Aluno (4567, "Matheuses");
        Aluno al3 = new Aluno (7890, "Mateuses");
        Aluno al4 = new Aluno (5555, "Otto");
        
        Professor prof1 = new Professor("Tania","a",55);
        Professor prof2 = new Professor("Matioli","b",55);
        
        Disciplina disc1 = new Disciplina("LPM", "sim", 20 );
        Disciplina disc2 = new Disciplina("ED", "é", 30);
        Disciplina disc3 = new Disciplina("DDM", "talvez", 40);
        
        List<Disciplina> listaDiscMatioli = new ArrayList<>();
        listaDiscMatioli.add(disc2);
        listaDiscMatioli.add(disc3);
        
        //criando lista de disciplinas
        List<Disciplina> listaDisc3D = new ArrayList();
        listaDisc3D.add (disc2);
        listaDisc3D.add (disc3);
//atribuindo lista de disciplinas a aluno
        al1.setListaDisc(listaDisc3D);
        al3.setListaDisc(listaDisc3D);
        
        prof2.setListaDisciplina(listaDiscMatioli);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
                session.save(al1);
                session.save(al2);
                session.save(al3);
                session.save(al4);
                
                session.save(disc1);
                session.save(disc2);
                session.save(disc3);
                
                session.save(prof1);
                session.save(prof2);
            session.getTransaction().commit();
            
            try {
                session.beginTransaction();
                    Aluno raRepetido = new Aluno(1234, "Rogerinho");

                    session.save(raRepetido);
                session.getTransaction().commit();
            } catch (Exception e) {
                    System.out.println("deu erro no repetido!!!!!!!!!!!");
            }
            
            try {
                session.beginTransaction();
                    Aluno nulo = new Aluno();

                    session.save(nulo);
                session.getTransaction().commit();
            } catch (Exception e) {
                    System.out.println("deu erro no nulo!!!!!!!!!!!");
            }
            
            session.delete(al4);
            
            al3.setNome("Ottorrinolaringologista"); 
            session.update(al3);
            
            Aluno al5 = session.get(Aluno.class, 1234);
            System.out.println("RA: " + al5.getRa() + "\nNome: " + al5.getNome());
            
            //buscar vários alunos no bd
            String hql  = "from Aluno where nome like 'm%'";
            Query query = session.createQuery(hql);
            List <Aluno> listaAl = query.list();
            for (Aluno al: listaAl)
                System.out.println("\n===== RA: "+ al.getRa()+ " Nome: " + al.getNome());
            
        HibernateUtil.shutdown();
    }
    
}
