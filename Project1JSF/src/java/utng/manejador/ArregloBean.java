package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ArregloDAO;
import utng.datos.FiestaDAO;
import utng.modelo.Arreglo;
import utng.modelo.Fiesta;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean (name = "arregloBean")
@SessionScoped
public class ArregloBean implements Serializable{
    private List<Arreglo> arreglos;
    private Arreglo arreglo;
    private List<Fiesta> fiestas;
    
    public ArregloBean (){
        arreglo = new Arreglo();
        arreglo.setFiesta(new Fiesta());
    }

    public List<Arreglo> getArreglos() {
        return arreglos;
    }

    public void setArreglos(List<Arreglo> arreglos) {
        this.arreglos = arreglos;
    }

    public Arreglo getArreglo() {
        return arreglo;
    }

    public void setArreglo(Arreglo arreglo) {
        this.arreglo = arreglo;
    }

    public List<Fiesta> getFiestas() {
        return fiestas;
    }

    public void setFiestas(List<Fiesta> fiestas) {
        this.fiestas = fiestas;
    }
    
    //LISTAR
  public String listar(){
        ArregloDAO dao = new ArregloDAO();
        
        try {
            arreglos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Arreglos";
    }
    
     public String eliminar() {
        ArregloDAO dao = new ArregloDAO();

        try {
            dao.delete(arreglo);
            arreglos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

   public String iniciar(){
       arreglo = new Arreglo();
       arreglo.setFiesta(new Fiesta());
       
       try {
          fiestas = new FiestaDAO().getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Iniciar";
   }
   
   public String guardar(){
       ArregloDAO dao = new ArregloDAO();
       
       try {
           if (arreglo.getIdArreglo() != 0){
               dao.update(arreglo);
           }else{
               dao.insert(arreglo);
           }
           
           arreglos = dao.getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Guardar";
   }
   
   public String cancelar(){
       return "Cancelar";
   }
   
   public String editar (Arreglo arreglo){
       this.arreglo = arreglo;
       
       try {
           arreglos = new ArregloDAO().getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Editar";
   }
   
}
