package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Fiesta;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class FiestaDAO extends DAO<Fiesta>{
     public FiestaDAO() {
        super(new Fiesta());
    }
    
    public Fiesta getOneById(Fiesta fiesta) throws HibernateException{
        return super.getOneById(fiesta.getIdFiesta());
    }
}
