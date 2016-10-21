package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Vestido;
/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class VestidoDAO extends DAO<Vestido>{
     public VestidoDAO() {
        super(new Vestido());
    }
    
    public Vestido getOneById(Vestido vestido) throws HibernateException{
        return super.getOneById(vestido.getIdVestido());
    }
}
