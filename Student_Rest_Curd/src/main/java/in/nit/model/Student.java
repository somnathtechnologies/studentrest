package in.nit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STUDENT_TABLE")
public  class Student implements Comparable<Student>{
	@Id

	@GeneratedValue(generator = "STUD")
	@GenericGenerator(name = "STUD" , strategy = "increment")
	private Integer STUDENT_ID;

	private String STUDENT_NAME;

	private Date STUDENT_DOB;
	private Date STUDENT_DOJ;

	public Student() {
		System.out.println("Student.Student()");
	}

	public Integer getSTUDENT_ID() {
		return STUDENT_ID;
	}

	public void setSTUDENT_ID(Integer sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}

	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}

	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}

	public Date getSTUDENT_DOB() {
		return STUDENT_DOB;
	}

	public void setSTUDENT_DOB(Date sTUDENT_DOB) {
		STUDENT_DOB = sTUDENT_DOB;
	}

	public Date getSTUDENT_DOJ() {
		return STUDENT_DOJ;
	}

	public void setSTUDENT_DOJ(Date sTUDENT_DOJ) {
		STUDENT_DOJ = sTUDENT_DOJ;
	}

	@Override
	public String toString() {
		return "Employee [STUDENT_ID=" + STUDENT_ID + ", STUDENT_NAME=" + STUDENT_NAME + ", STUDENT_DOB=" + STUDENT_DOB
				+ ", STUDENT_DOJ=" + STUDENT_DOJ + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getSTUDENT_ID()-o.getSTUDENT_ID();
	}


}
