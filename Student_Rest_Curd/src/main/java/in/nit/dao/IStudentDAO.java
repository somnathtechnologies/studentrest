package in.nit.dao;

import java.util.List;

import in.nit.model.Student;

public interface IStudentDAO {
public List<Student> getAllStudents();
public Integer saveStudent(Student s);
}
