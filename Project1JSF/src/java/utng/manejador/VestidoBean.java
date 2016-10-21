package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.VestidoDAO;
import utng.modelo.Vestido;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
@ManagedBean
@SessionScoped
public class VestidoBean implements Serializable {

    private List<Vestido> vestidos;
    private Vestido vestido;

    public VestidoBean() {
    }

    public List<Vestido> getVestidos() {
        return vestidos;
    }

    public void setVestidos(List<Vestido> vestidos) {
        this.vestidos = vestidos;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }

    public String listar() {
        VestidoDAO dao = new VestidoDAO();
        try {
            vestidos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Vestidos";
    }

    public String eliminar() {
        VestidoDAO dao = new VestidoDAO();

        try {
            dao.delete(vestido);
            vestidos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        vestido = new Vestido();
        return "Iniciar";
    }

    public String guardar() {
        VestidoDAO dao = new VestidoDAO();

        try {
            if (vestido.getIdVestido() != 0) {
                dao.update(vestido);
            } else {
                dao.insert(vestido);
            }

            vestidos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Vestido vestido) {
        this.vestido = vestido;
        return "Editar";
    }
}
