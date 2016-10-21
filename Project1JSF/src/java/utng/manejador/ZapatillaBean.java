package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ZapatillaDAO;
import utng.modelo.Zapatilla;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean
@SessionScoped
public class ZapatillaBean implements Serializable{
     private List<Zapatilla> zapatillas;
    private Zapatilla zapatilla;

    public ZapatillaBean() {
    }

    public List<Zapatilla> getZapatillas() {
        return zapatillas;
    }

    public void setZapatillas(List<Zapatilla> zapatillas) {
        this.zapatillas = zapatillas;
    }


    public Zapatilla getZapatilla() {
        return zapatilla;
    }

    public void setZapatilla(Zapatilla zapatilla) {
        this.zapatilla = zapatilla;
    }
    
     public String listar() {
        ZapatillaDAO dao = new ZapatillaDAO();
        try {
            zapatillas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Zapatillas";
    }

    public String eliminar() {
        ZapatillaDAO dao = new ZapatillaDAO();

        try {
            dao.delete(zapatilla);
            zapatillas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

   public String iniciar(){
       zapatilla = new Zapatilla();
       return "Iniciar";
   }
   
   public String guardar(){
       ZapatillaDAO dao = new ZapatillaDAO();
       
       try {
           if (zapatilla.getIdZapatilla()!= 0){
               dao.update(zapatilla);
           }else{
               dao.insert(zapatilla);
           }
           
           zapatillas = dao.getAll();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "Guardar";
   }
   
   public String cancelar(){
       return "Cancelar";
   }
   
   public String editar (Zapatilla zapatilla){
       this.zapatilla = zapatilla;
       return "Editar";
   }
}
