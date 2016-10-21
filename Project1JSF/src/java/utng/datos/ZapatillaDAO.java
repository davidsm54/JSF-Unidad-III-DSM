package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Zapatilla;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class ZapatillaDAO extends DAO<Zapatilla>{
    public ZapatillaDAO() {
        super(new Zapatilla());
    }
    
    public Zapatilla getOneByID(Zapatilla zapatilla)
    throws HibernateException{
        return super.getOneById(zapatilla.getIdZapatilla());
    }
}
