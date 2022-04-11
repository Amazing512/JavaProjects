
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="DocumentoLPM")
public class Documento {
    @Id
    @Column ()
    private int idDoc;
    
    @Column ()
    private String tipoDoc;
    
    @Column ()
    private String numDoc;

    public Documento(int idDoc, String tipoDoc, String numDoc) {
        this.idDoc = idDoc;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    
}
