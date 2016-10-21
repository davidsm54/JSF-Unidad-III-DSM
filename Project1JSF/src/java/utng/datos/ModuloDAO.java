package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Modulo;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class ModuloDAO extends DAO<Modulo>{
   
    public ModuloDAO(){
        super(new Modulo());
    }    
    
    public Modulo getOneById(Modulo modulo) 
            throws HibernateException{
        return super.getOneById(
                modulo.getIdModulo());
    }
}
