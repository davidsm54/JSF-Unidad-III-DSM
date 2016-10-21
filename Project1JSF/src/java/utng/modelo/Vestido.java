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
@Table(name = "vestido")
public class Vestido implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_vestido")
    private Long idVestido;
    
    @Column (name = "color", length = 50)
    private String color;
    
    @Column (name = "marca", length = 100)
    private String marca;
    
    @Column (name = "diseniador", length = 100)
    private String diseniador; 
    
    public Vestido(){
        this.idVestido = 0L;
    }

    public Long getIdVestido() {
        return idVestido;
    }

    public void setIdVestido(Long idVestido) {
        this.idVestido = idVestido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiseniador() {
        return diseniador;
    }

    public void setDiseniador(String diseniador) {
        this.diseniador = diseniador;
    }

}
