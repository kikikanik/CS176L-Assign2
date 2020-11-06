//*******************************************************************
// Assign2Test
// This class contains the main method for CS-176L Assignment 2
//*******************************************************************
public class Assign2Test {

	public static void main(String[] args) {

		Student aj = new Student("Abdulmuhsin J. Al-Kandari", "s0936669@monmouth.edu", "SE");
		Student justin = new Student("Justin R. Schlemm", "s0898474@monmouth.edu", "SE");
		Student mary = new Student("Mary F. Menges", "s1012284@monmouth.edu", "SE");
		Student nick = new Student("Nicholas-Jason R. Roache", "s0906695@monmouth.edu", "CS");
		Student taylor = new Student("Taylor J. Klodowski", "s0912276@monmouth.edu", "SE");	
		Student veronica = new Student("Veronica M. Granite", "s1068680@monmouth.edu", "CS");
		// new students:
		Student yosef = new Student("Yosef D. Davidowitz", "s1284597@monmouth.edu", "SE");
		Student kiki = new Student("Kinneret H. Kanik", "s1278692@monmouth.edu", "CS");
		Student lance = new Student("Lance T. Harewood", "s1291523@monmouth.edu", "SE");
		Student jannut = new Student("Jannut M. Khan", "s1297843@monmouth.edu", "CS");

		Student[] studentArray = {aj, justin, mary, nick, taylor, veronica, yosef, kiki, lance, jannut};
		StudentList myStudentList = new StudentList(studentArray);
		System.out.println("Total number of students majoring in Computer Science: " + myStudentList.getStudentCount("CS"));
		System.out.println("Total number of students majoring in Software Engineering: " + myStudentList.getStudentCount("SE"));
		System.out.println("Total number of students majoring in History: " + myStudentList.getStudentCount("HIS"));

		if (myStudentList.getStudentInfo("Bob Dylan") == null) {
			System.out.println("Student information not found");
		}
		else {
			System.out.println(myStudentList.getStudentInfo("s1278692"));
		}
		if (myStudentList.getStudentInfo("s8630092@gmail.com") == null); {
			System.out.println("'s8630092@gmail.com' : Student not found");
		}
	}
}
