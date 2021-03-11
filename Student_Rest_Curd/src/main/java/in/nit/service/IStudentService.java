package in.nit.service;

import java.util.List;

import in.nit.model.Student;

public interface IStudentService {

	public List<Student> getAllStudents();
	public Integer saveStudent(Student s);

}
