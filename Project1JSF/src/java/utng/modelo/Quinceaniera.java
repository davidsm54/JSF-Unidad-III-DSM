package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@Entity 
@Table(name = "quinceaniera")
public class Quinceaniera implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_quinceaniera")
    private Long idQuinceaniera;
    
    @Column(name = "nombre_quinceaniera", length = 100)
    private String nombreQuinceaniera;
    
    @Column(length = 40)
    private String suenio;
    
    @Column(length = 40)
    private String familia;
    
    @ManyToOne()
    @JoinColumn (name = "id_zapatilla")
    private Zapatilla zapatilla;
    
    @ManyToOne()
    @JoinColumn (name = "id_vestido")
    private Vestido vestido;

    public Quinceaniera(Long idQuinceaniera, String nombreQuinceaniera, String suenio,String familia, Zapatilla zapatilla, Vestido vestido) {
        super();
        this.idQuinceaniera = idQuinceaniera;
        this.nombreQuinceaniera = nombreQuinceaniera;
        this.suenio = suenio;
        this.familia = familia;
        this.zapatilla = zapatilla;
        this.vestido = vestido;
    }

    public Quinceaniera() {
        this.idQuinceaniera = 0L;
    }

    public Long getIdQuinceaniera() {
        return idQuinceaniera;
    }

    public void setIdQuinceaniera(Long idQuinceaniera) {
        this.idQuinceaniera = idQuinceaniera;
    }

    public String getNombreQuinceaniera() {
        return nombreQuinceaniera;
    }

    public void setNombreQuinceaniera(String nombreQuinceaniera) {
        this.nombreQuinceaniera = nombreQuinceaniera;
    }

    public String getSuenio() {
        return suenio;
    }

    public void setSuenio(String suenio) {
        this.suenio = suenio;
    }

    public Zapatilla getZapatilla() {
        return zapatilla;
    }

    public void setZapatilla(Zapatilla zapatilla) {
        this.zapatilla = zapatilla;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    
}
