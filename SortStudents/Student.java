package learning;

import java.util.Comparator;

public class Student {

	private String studentname;
	private int groupnumber;
	private String studentsurname;

	public Student(String studentname, String studentsurname, int groupnumber) {
		this.groupnumber = groupnumber;
		this.studentname = studentname;
		this.studentsurname = studentsurname;
	}

	public String getStudentname() {
		return studentname;
	}
	
	public String getStudentsurname() {
		return studentsurname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getgroupnumber() {
		return groupnumber;
	}

	public void setgroupnumber(int groupnumber) {
		this.groupnumber = groupnumber;
	}
	
	///////////////////////Sort with using Comparator //////////////////////////////////////////////////////////////////////////////
	
	/* Comparator for sorting the list by Student Name */
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getStudentname().toUpperCase();
			String StudentName2 = s2.getStudentname().toUpperCase();

			// ascending order
			return StudentName1.compareTo(StudentName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};
	
	public static Comparator<Student> StuSurnameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getStudentsurname().toUpperCase();
			String StudentName2 = s2.getStudentsurname().toUpperCase();

			// ascending order
			return StudentName1.compareTo(StudentName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	/* Comparator for sorting the list by group number */
	public static Comparator<Student> Stugroupnumber = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {

			int groupnumber1 = s1.getgroupnumber();
			int groupnumber2 = s2.getgroupnumber();

			/* For ascending order */
			return groupnumber1 - groupnumber2;

			/* For descending order */
			// groupnumber2-groupnumber1;
		}
	};
	
	
	@Override
	public String toString() {
		return "[ groupnumber=" + groupnumber + ", name=" + studentname + ", surname=" + studentsurname + "]";
	}

}
