
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "ProfessorLPM", uniqueConstraints = {
    @UniqueConstraint(columnNames = "matricula"),
    @UniqueConstraint(columnNames = "email"),
})
public class Professor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int matricula;
    
    @Column (nullable = false, length = 100)
    private String nome;
    
    @OneToMany
    @JoinColumn (name = "profResponsavel")
    private List<Disciplina> listaDisciplina;
    
    @Column (nullable = false)
    private String email;
    
    @Column (nullable = false)
    private double salario;

    public Professor( String nome, String email, double salario) {
        this.nome = nome;
        this.listaDisciplina = new ArrayList<>();
        this.email = email;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
    
    
    
}
