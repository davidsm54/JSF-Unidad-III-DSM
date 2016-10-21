package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Instructor;

/**
 *
 * @author David Salazar Mejia davidsm54@gmail.com
 */
public class InstructorDAO extends DAO<Instructor>{
    
    public InstructorDAO() {
        super(new Instructor());
    }
    
    public Instructor getOneByID(Instructor instructor)
    throws HibernateException{
        return super.getOneById(instructor.getIdInstructor());
    }
    
}
