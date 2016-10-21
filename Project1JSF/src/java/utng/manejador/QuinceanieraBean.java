package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.QuinceanieraDAO;
import utng.datos.VestidoDAO;
import utng.datos.ZapatillaDAO;
import utng.modelo.Quinceaniera;
import utng.modelo.Vestido;
import utng.modelo.Zapatilla;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean (name = "quinceanieraBean") 
@SessionScoped
public class QuinceanieraBean implements Serializable{
    private List<Quinceaniera>quinceanieras;
    private Quinceaniera quinceaniera;
    private List<Vestido> vestidos;
    private List<Zapatilla> zapatillas;
    
    public QuinceanieraBean(){
        quinceaniera = new Quinceaniera();
        quinceaniera.setVestido(new Vestido());
        quinceaniera.setZapatilla(new Zapatilla());
    }

    public List<Quinceaniera> getQuinceanieras() {
        return quinceanieras;
    }

    public void setQuinceanieras(List<Quinceaniera> quinceanieras) {
        this.quinceanieras = quinceanieras;
    }

    public Quinceaniera getQuinceaniera() {
        return quinceaniera;
    }

    public void setQuinceaniera(Quinceaniera quinceaniera) {
        this.quinceaniera = quinceaniera;
    }

    public List<Vestido> getVestidos() {
        return vestidos;
    }

    public void setVestidos(List<Vestido> vestidos) {
        this.vestidos = vestidos;
    }

    public List<Zapatilla> getZapatillas() {
        return zapatillas;
    }

    public void setZapatillas(List<Zapatilla> zapatillas) {
        this.zapatillas = zapatillas;
    }
    
    public String listar(){
        QuinceanieraDAO dao = new QuinceanieraDAO();
        try{
            quinceanieras = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Quinceanieras";
    }
    public String eliminar(){
        QuinceanieraDAO dao = new QuinceanieraDAO();
        try{
            dao.delete(quinceaniera);
            quinceanieras = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        quinceaniera = new Quinceaniera();
        quinceaniera.setVestido(new Vestido());
        quinceaniera.setZapatilla(new Zapatilla());
        try{
            vestidos = new VestidoDAO().getAll();
            zapatillas = new ZapatillaDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Iniciar";
    }
    public String guardar(){
        QuinceanieraDAO dao = new QuinceanieraDAO();
        try{
            if(quinceaniera.getIdQuinceaniera() !=0){
                dao.update(quinceaniera);
            }else{
                dao.insert(quinceaniera);
            }
            quinceanieras = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Quinceaniera quinceaniera){
        this.quinceaniera = quinceaniera;
        try{
            vestidos = new VestidoDAO().getAll();
            zapatillas = new ZapatillaDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
}
