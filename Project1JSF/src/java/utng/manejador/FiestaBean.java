package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.FiestaDAO;
import utng.modelo.Fiesta;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean
@SessionScoped
public class FiestaBean implements Serializable{
    private List<Fiesta> fiestas;
    private Fiesta fiesta;

    public FiestaBean() {
    }

    public List<Fiesta> getFiestas() {
        return fiestas;
    }

    public void setFiestas(List<Fiesta> fiestas) {
        this.fiestas = fiestas;
    }

    public Fiesta getFiesta() {
        return fiesta;
    }

    public void setFiesta(Fiesta fiesta) {
        this.fiesta = fiesta;
    }
    
    public String listar() {
        FiestaDAO dao = new FiestaDAO();
        try {
            fiestas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Fiestas";
    }

    public String eliminar() {
        FiestaDAO dao = new FiestaDAO();

        try {
            dao.delete(fiesta);
            fiestas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

   public String iniciar(){
       fiesta = new Fiesta();
       return "Iniciar";
   }
   
   public String guardar(){
       FiestaDAO dao = new FiestaDAO();
       
       try {
           if (fiesta.getIdFiesta() != 0){
               dao.update(fiesta);
           }else{
               dao.insert(fiesta);
           }
           
           fiestas = dao.getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Guardar";
   }
   
   public String cancelar(){
       return "Cancelar";
   }
   
   public String editar (Fiesta fiesta){
       this.fiesta = fiesta;
       return "Editar";
   }
}
