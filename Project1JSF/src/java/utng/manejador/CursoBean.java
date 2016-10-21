package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CursoDAO;
import utng.modelo.Curso;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean
@SessionScoped
public class CursoBean implements Serializable{
    private List<Curso> cursos;
    private Curso curso;

    public CursoBean() {
    }

    public Curso getCurso(){
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public String listar() {
        CursoDAO dao = new CursoDAO();
        try {
            cursos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Cursos";
    }

    public String eliminar() {
        CursoDAO dao = new CursoDAO();

        try {
            dao.delete(curso);
            cursos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

   public String iniciar(){
       curso = new Curso();
       return "Iniciar";
   }
   
   public String guardar(){
       CursoDAO dao = new CursoDAO();
       
       try {
           if (curso.getIdCurso() != 0){
               dao.update(curso);
           }else{
               dao.insert(curso);
           }
           
           cursos = dao.getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Guardar";
   }
   
   public String cancelar(){
       return "Cancelar";
   }
   
   public String editar (Curso curso){
       this.curso = curso;
       return "Editar";
   }
    
}