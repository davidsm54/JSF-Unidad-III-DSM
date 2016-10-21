package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@Entity
@Table(name = "fiesta")
public class Fiesta implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_fiesta")
    private Long idFiesta;
    
    @Column (name = "tipofiesta")
    private String tipoFiesta;
    
    @Column (name = "duracion", length = 100)
    private int duracion;
    
    @Column (name = "invitados")
    private int invitados; 

    public Fiesta() {
        this.idFiesta = 0L;
    }

    public Long getIdFiesta() {
        return idFiesta;
    }

    public void setIdFiesta(Long idFiesta) {
        this.idFiesta = idFiesta;
    }

    public String getTipoFiesta() {
        return tipoFiesta;
    }

    public void setTipoFiesta(String tipoFiesta) {
        this.tipoFiesta = tipoFiesta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }
    
    
    
   
}
