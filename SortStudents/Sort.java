package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {

	public static void main(String args[]) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student("Иванов", "Илья", 10));
		arraylist.add(new Student("Ларионова", "Светлана", 2));
		arraylist.add(new Student("Шилова", "Лада", 4));
		arraylist.add(new Student("Тимофеева", "Клавдия", 3));
		arraylist.add(new Student("Шарапова", "Екатерина", 6));
		arraylist.add(new Student("Мелания", "Фомичёва", 7));
		arraylist.add(new Student("Носова", "Агния", 1));
		arraylist.add(new Student("Шашкова", "Серафима", 5));
		arraylist.add(new Student("Федотова", "Зинаида", 8));
		arraylist.add(new Student("Устинова", "Таисья", 9));

		
		ArrayList<Student> list = new ArrayList<Student>();
		list = arraylist;

		///////////////////////////////////Version 1////////////////////////////////////////////////
        ///////////////////////Sort with using anonymous class//////////////////////////////////////////////////////////////////////////

		System.out.println("GroupNum Sorting:"); 
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				int groupnumber1 = o1.getgroupnumber();
				int groupnumber2 = o2.getgroupnumber();

				/* For ascending order */
				return groupnumber1 - groupnumber2;

				/* For descending order */
				// groupnumber2-groupnumber1;
			}
		});

		for (Student str : list) {
			System.out.println(str);
		}
		

		System.out.println("Student Surname Sorting:");
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				String StudentName1 = o1.getStudentsurname().toUpperCase();
				String StudentName2 = o2.getStudentsurname().toUpperCase();

				// ascending order
				return StudentName1.compareTo(StudentName2);

				// descending order
				// return StudentName2.compareTo(StudentName1);
			}
		});
		
		for (Student str : list) {
			System.out.println(str);
		}


		System.out.println("Student Name Sorting:");
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				String StudentName1 = o1.getStudentname().toUpperCase();
				String StudentName2 = o2.getStudentname().toUpperCase();

				// ascending order
				return StudentName1.compareTo(StudentName2);
				
				// descending order
				// return StudentName2.compareTo(StudentName1);
			}
		});

		for (Student str : list) {
			System.out.println(str);
		}

		
        ///////////////////////////////////Version 2////////////////////////////////////////////////
		/*

		 * System.out.println("GroupNum Sorting:"); 
		 * Collections.sort(arraylist,
		 * Student.Stugroupnumber);
		 * 
		 * for (Student str : arraylist) { System.out.println(str); }
		 * 

		 * System.out.println("Student Surname Sorting:");
		 * Collections.sort(arraylist, Student.StuSurnameComparator);
		 * 
		 * for (Student str : arraylist) { System.out.println(str); }
		 * 

		 * System.out.println("Student Name Sorting:");
		 * Collections.sort(arraylist, Student.StuNameComparator);
		 * 
		 * for (Student str : arraylist) { System.out.println(str); }
		 */
	}
}
