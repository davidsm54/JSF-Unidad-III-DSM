package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CursoDAO;
import utng.datos.InstructorDAO;
import utng.modelo.Curso;
import utng.modelo.Instructor;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean (name = "instructorBean")
@SessionScoped
public class InstructorBean implements Serializable{
    private List<Instructor> instructores;
    private Instructor instructor;
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public InstructorBean() {
        instructor = new Instructor();
        instructor.setCurso(new Curso());
    }
    
    public Instructor getInstructor(){
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Instructor> getInstructores() {
        return instructores;
    }

    public void setInstructores(List<Instructor> instructores) {
        this.instructores = instructores;
    }
    
    public String listar(){
        InstructorDAO dao = new InstructorDAO();
        
        try {
            instructores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Instructores";
    }
    
     public String eliminar() {
        InstructorDAO dao = new InstructorDAO();

        try {
            dao.delete(instructor);
            instructores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

   public String iniciar(){
       instructor = new Instructor();
       instructor.setCurso(new Curso());
       
       try {
          cursos = new CursoDAO().getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Iniciar";
   }
   
   public String guardar(){
       InstructorDAO dao = new InstructorDAO();
       
       try {
           if (instructor.getIdInstructor() != 0){
               dao.update(instructor);
           }else{
               dao.insert(instructor);
           }
           
           instructores = dao.getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Guardar";
   }
   
   public String cancelar(){
       return "Cancelar";
   }
   
   public String editar (Instructor instructor){
       this.instructor = instructor;
       
       try {
           cursos = new CursoDAO().getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Editar";
   }
    
}
