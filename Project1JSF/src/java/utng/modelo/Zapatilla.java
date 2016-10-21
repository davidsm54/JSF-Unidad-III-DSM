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
@Table(name = "zapatilla")
public class Zapatilla implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_zapatilla")
    private Long idZapatilla;
    
    @Column (name = "nombre_zapatilla", length = 50)
    private String nombreZapatilla;
    
    @Column (name = "color", length = 10)
    private String color;
    
    @Column (name = "marca", length = 50)
    private String marca; 
    
    public Zapatilla(){
        this.idZapatilla = 0L;
    }

    public Long getIdZapatilla() {
        return idZapatilla;
    }

    public void setIdZapatilla(Long idZapatilla) {
        this.idZapatilla = idZapatilla;
    }

    public String getNombreZapatilla() {
        return nombreZapatilla;
    }

    public void setNombreZapatilla(String nombreZapatilla) {
        this.nombreZapatilla = nombreZapatilla;
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

    
    
}
