package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Quinceaniera;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class QuinceanieraDAO extends DAO<Quinceaniera>{
     public QuinceanieraDAO(){
        super(new Quinceaniera());
    }
    public Quinceaniera getOneById(Quinceaniera quinceaniera) 
            throws HibernateException{
        return super.getOneById(quinceaniera.getIdQuinceaniera());        
    }
}
