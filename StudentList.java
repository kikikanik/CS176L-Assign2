//*******************************************************************
// StudentList
// This class can be used to create a StudentList object which contains an array of Student objects
//*******************************************************************
public class StudentList {
	private Student[] studentArray;

	public StudentList(Student[] studentArray){
		setStudentArray(studentArray);
	}

	public Student[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;
	}
	
	public int getStudentCount(String major) {
		int count = 0;
		for (int i=0; i<studentArray.length; i++) {
			if (studentArray[i].getMajor() == major) {
				count++;
			}
		}
		return count;
	}
	
	public Student getStudentInfo(String email) {
		for (int i = 0; i< studentArray.length; i++) {
			if (studentArray[i].getEmail()== email) {
				return studentArray[i];
			}
		}
		return null;
	}

}
