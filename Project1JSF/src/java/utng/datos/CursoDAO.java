package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Curso;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class CursoDAO extends DAO<Curso>{
    
    public CursoDAO() {
        super(new Curso());
    }
    
    public Curso getOneById(Curso curso) throws HibernateException{
        return super.getOneById(curso.getIdCurso());
    }
}
