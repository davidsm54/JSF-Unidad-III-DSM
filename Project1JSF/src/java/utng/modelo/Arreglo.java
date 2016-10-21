package utng.modelo;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arreglo")
public class Arreglo implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_arreglo")
    private Long idArreglo;
    
    @Column (name = "nombre_arreglo", length = 50 )
    private String nombreArreglo;
    
    @Column (length = 100 )
    private String ciudad;
    
    @Column (length = 50 )
    private String salon;
    
    @ManyToOne
    @JoinColumn (name = "id_fiesta")
    private Fiesta fiesta;

    public Arreglo(Long idArreglo, String nombreArreglo, String ciudad, Fiesta fiesta) {
        super();
        this.idArreglo = idArreglo;
        this.nombreArreglo = nombreArreglo;
        this.ciudad = ciudad;
        this.fiesta = fiesta;
    }
    
     public Arreglo() {
        this.idArreglo = 0L;
    }

    public Long getIdArreglo() {
        return idArreglo;
    }

    public void setIdArreglo(Long idArreglo) {
        this.idArreglo = idArreglo;
    }

    public String getNombreArreglo() {
        return nombreArreglo;
    }

    public void setNombreArreglo(String nombreArreglo) {
        this.nombreArreglo = nombreArreglo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public Fiesta getFiesta() {
        return fiesta;
    }

    public void setFiesta(Fiesta fiesta) {
        this.fiesta = fiesta;
    }
    
    
}
