package in.nit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Student;
import in.nit.util.HibernateUtil;

public class StudentDAOImpl implements IStudentDAO{


	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		Session ses=HibernateUtil.getSf().openSession();
		List<Student> list=null;
		try (ses){
			list=ses
					.createQuery("from in.nit.model.Student s")
					.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public Integer saveStudent(Student s) {
		Session ses=HibernateUtil.getSf().openSession();
		Transaction tx=null;
		Integer id=null;
		try(ses) {
			tx=ses.beginTransaction();
			id=(Integer)ses.save(s);
			//ses.getTransaction().commit();
			tx.commit();
		} catch (Exception ex) {
			//ses.getTransaction().rollback();
			tx.rollback();
			ex.printStackTrace();
		}
		return id;
	}

	
}


