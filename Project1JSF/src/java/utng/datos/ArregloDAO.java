package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Arreglo;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class ArregloDAO extends DAO<Arreglo>{
    public ArregloDAO() {
        super(new Arreglo());
    }
    
    public Arreglo getOneByID(Arreglo arreglo)
    throws HibernateException{
        return super.getOneById(arreglo.getIdArreglo());
    }
}
