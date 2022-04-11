
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name = "AlunoLPM")
public class Aluno {
    
    @Id
    @Column(unique = true)
    private int ra;
    
    @Column
    private String nome;
    
    @ManyToMany
    @JoinTable (joinColumns = @JoinColumn(name = "ra"),
        inverseJoinColumns = @JoinColumn(name = "codigo"))
    private List<Disciplina> listaDisc;
    
    @OneToOne
    @JoinColumn (name = "idDoc")
    private Documento doc;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.listaDisc = new ArrayList();
    }
    
    public Aluno(){
        this.listaDisc = new ArrayList();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getListaDisc() {
        return listaDisc;
    }

    public void setListaDisc(List<Disciplina> listaDisc) {
        this.listaDisc = listaDisc;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }
    
    
    
}
