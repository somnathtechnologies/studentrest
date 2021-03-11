package in.nit.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import in.nit.dao.IStudentDAO;
import in.nit.model.Student;

public class StudentServiceImpl implements IStudentService {

	@Inject
	private IStudentDAO dao;
	@Override
	public List<Student> getAllStudents() {
		List<Student> st=dao.getAllStudents();
		Collections.sort(st);
		return st;
	}
	@Override
	public Integer saveStudent(Student s) {
		return dao.saveStudent(s);
	}
}


