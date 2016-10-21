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
@Table(name = "instructor")
public class Instructor implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_instructor")
    private Long idInstructor;
    
    @Column (name = "nombre", length = 50 )
    private String nombre;
    
    @Column (length = 100 )
    private String ciudad;
    
    @Column (length = 50 )
    private String contrasenia;
    
    @ManyToOne
    @JoinColumn (name = "id_curso")
    private Curso curso;
    
   
    public Instructor(Long idInstructor, String nombre, String ciudad, String contrasenia, Curso curso) {
        super();
        this.idInstructor = idInstructor;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.contrasenia = contrasenia;
        this.curso = curso;
    }
    
    public Instructor (){
        this.idInstructor = 0L;
    }

    public Long getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Long idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
