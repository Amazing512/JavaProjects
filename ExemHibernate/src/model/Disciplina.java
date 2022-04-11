
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "DisciplinaLPM")
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int codigo;
    
    @Column (nullable = false, length = 100)
    private String nome;
    
    @Column (nullable = false, length = 100)
    private String descricao;
    
    @Column
    private int cargaHoraria;
    
    @ManyToMany (mappedBy = "listaDisc")
    private List<Aluno> listaAl;
    
    @OneToOne (mappedBy = "doc")
    private Aluno aluno;
    
    /*@ManyToOne
    private Professor profResponsavel;*/

    public Disciplina(String nome, String descricao, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.listaAl = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /*public Professor getProfResponsavel() {
        return profResponsavel;
    }

    public void setProfResponsavel(Professor profResponsavel) {
        this.profResponsavel = profResponsavel;
    }
*/
    public List<Aluno> getListaAl() {
        return listaAl;
    }

    public void setListaAl(List<Aluno> listaAl) {
        this.listaAl = listaAl;
    }
    
    
    
    
}
