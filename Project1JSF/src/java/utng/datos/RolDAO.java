
package utng.datos;


import org.hibernate.HibernateException;
import utng.modelo.Rol;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class RolDAO extends DAO<Rol>{
   
    public RolDAO(){
        super(new Rol());
    }
    
    public Rol getObeById(Rol rol)
            throws HibernateException{
        return super.getOneById(
                rol.getIdRol());
    }
    
}
